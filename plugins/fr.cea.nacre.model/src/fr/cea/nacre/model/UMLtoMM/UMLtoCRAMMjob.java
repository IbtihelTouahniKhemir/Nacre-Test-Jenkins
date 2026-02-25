package fr.cea.nacre.model.UMLtoMM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.SchedulableResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;
import fr.cea.nacre.model.NACREMM.CommonType.CommonTypeFactory;
import fr.cea.nacre.model.NACREMM.CommonType.PeriodType;
import fr.cea.nacre.model.NACREMM.cra.CraFactory;
import fr.cea.nacre.model.NACREMM.cra.RedundancyKind;
import fr.cea.nacre.model.NACREMM.cra.SoftwareResource;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.factory.GCMFactory2;
import nacre.Connect;
import nacre.Link;
import nacre.RedundancyCluster;

/** the purpose is to transform a UML model to CRA Nacre MM Instance
 *
 */
public class UMLtoCRAMMjob extends AbstractUMLtoNACRE{


	private static final String EQUAL_SEPARATOR = "="; //$NON-NLS-1$
	private static final String SECOND = "second"; //$NON-NLS-1$
	private static final String MILLISECOND = "millisecond"; //$NON-NLS-1$
	private static final String S_UNIT = "s"; //$NON-NLS-1$
	private static final String MIN_UNIT = "min"; //$NON-NLS-1$
	private static final String MS_UNIT = "ms"; //$NON-NLS-1$
	private static final String SEPARATOR = ","; //$NON-NLS-1$
	//rules:
	// all target elements of are prefixed of the metamodel by "gcm_"
	// all UML natif element are prefixed by "UML
	// all stereotype application are prefixed by "StereotypeApp"
	private org.eclipse.uml2.uml.Package UML_craPackage;
	private GCMFactory2 gcmFactory;
	private Study gcm_study;


	public UMLtoCRAMMjob(org.eclipse.uml2.uml.Package UML_cra_package, GCMFactory2 gcmFactory, Study study) {
		this.UML_craPackage = UML_cra_package;
		this.gcmFactory     = gcmFactory;
		this.gcm_study      = study;
	}


	@Override
	public EObject construct() {
		List<Package> UML_craSubPackages = UML_craPackage.getNestedPackages();

		for (Package UML_craSubPackage : UML_craSubPackages) {
			String craName = UML_craSubPackage.getName();
			String craQName = UML_craSubPackage.getQualifiedName();

			fr.cea.nacre.model.NACREMM.cra.Cra gcm_cra = createCra(gcm_study, craName, craQName);

			List<Abstraction> abstractions = UML_craSubPackage.allOwnedElements().stream()
					.filter(Abstraction.class::isInstance)
					.map(Abstraction.class::cast)
					.collect(Collectors.toList());

			gcmFactory.UMLdeploiementRegistry.put(craName, abstractions);

			List<CommunicationMedia> stereotypeAppComMediaList = getCommMedias(UML_craSubPackage.allOwnedElements()
					.stream().filter(a -> a instanceof Class).collect(Collectors.toList()));

			//construction all CommunicationMedia
			for (CommunicationMedia stereotypeAppComMedia : stereotypeAppComMediaList) {
				fr.cea.nacre.model.NACREMM.cra.CommunicationMedia gcm_comMedia =
						createMMCommunicationMedia(gcm_cra, stereotypeAppComMedia);
				gcmFactory.commMediaMap.put(stereotypeAppComMedia, gcm_comMedia);
			}

			//construct all ComputingResource
			List<ComputingResource> stereotypeAppCompResources = getCompRes(UML_craSubPackage.allOwnedElements().stream()
					.filter(a -> a instanceof Class).collect(Collectors.toList()));
			String compResourceName=null;
			String compResourceQName=null;
			for (ComputingResource stereotypeAppCompResource : stereotypeAppCompResources) {
				compResourceName = stereotypeAppCompResource.getBase_Classifier().getName();
				compResourceQName=stereotypeAppCompResource.getBase_Classifier().getQualifiedName();
				fr.cea.nacre.model.NACREMM.cra.ComputingResource gcm_compResource =	createComputingResource(gcm_cra, compResourceName, compResourceQName);

				gcmFactory.compResMap.put(stereotypeAppCompResource, gcm_compResource);
			}

			
			// construct list of softwareResources
			List<SwSchedulableResource> stereotypeAppSchedulResList = getScheduleRes(UML_craSubPackage.allOwnedElements().stream()
					.filter(a -> a instanceof Class).collect(Collectors.toList()));
			String softResourceName;
			String softResourceQName;
			for (SwSchedulableResource stereotypeAppSchedulRes : stereotypeAppSchedulResList) {
				softResourceName = stereotypeAppSchedulRes.getBase_Classifier().getName();
				softResourceQName = stereotypeAppSchedulRes.getBase_Classifier().getQualifiedName();
				SoftwareResource gcm_sofRes = createSoftwareResource(gcm_cra, softResourceName, softResourceQName);
				if (stereotypeAppSchedulRes.getType() != null) {
					double period = getSwRPeriod(stereotypeAppSchedulRes);
					PeriodType gcm_periodType = createPeriodType(period, SECOND);
					gcm_sofRes.setPeriod(gcm_periodType);
				}
				if (getSwRResourceUsage(stereotypeAppSchedulRes) != null) {
					ResourceUsage stereotypeAppResUsage = getSwRResourceUsage(stereotypeAppSchedulRes);
					Integer executionTime = getSwRExecTimeValue(stereotypeAppResUsage);
					String unit = getSwRExecTimeUnit(stereotypeAppResUsage);
					if (executionTime != null && unit != "") { //$NON-NLS-1$
						CommonType gcm_execTime = createCommonType(executionTime, unit);
						gcm_sofRes.setExecutionTime(gcm_execTime);
					}
				}
				gcmFactory.swResMap.put(stereotypeAppSchedulRes, gcm_sofRes);
			}

			//Construct all redundancyCluster
			List<RedundancyCluster> stereotypeAppRedundancyCluster = getRedundancyCluster(UML_craSubPackage.allOwnedElements().stream()
					.filter(a -> a instanceof Class).collect(Collectors.toList()));
			String RedundancyClusterName=null;
			String RedundancyClusterQName=null;
			for (RedundancyCluster astereotypeARedundancyCluster : stereotypeAppRedundancyCluster) {
				RedundancyClusterName = astereotypeARedundancyCluster.getBase_Class().getName();
				RedundancyClusterQName=astereotypeARedundancyCluster.getBase_Class().getQualifiedName();
				fr.cea.nacre.model.NACREMM.cra.RedundancyCluster cluster =	createRedundancyCluster(gcm_cra, RedundancyClusterName, RedundancyClusterQName);
				gcmFactory.cluster.put(astereotypeARedundancyCluster, cluster);
				//fill attributes of the cluster
				List<String> active=getUIDListFromSWResourceList(astereotypeARedundancyCluster.getActive());
				cluster.getActive().addAll(active);
				List<String> passive=getUIDListFromSWResourceList(astereotypeARedundancyCluster.getPassive());
				cluster.getPassive().addAll(passive);
				//hypervisor
				if( astereotypeARedundancyCluster.getHypervisor()!=null) {
					ArrayList<SwSchedulableResource> hypervisorList= new ArrayList<SwSchedulableResource>();
					hypervisorList.add(astereotypeARedundancyCluster.getHypervisor());
					List<String> hypervisoirUIDList=getUIDListFromSWResourceList(hypervisorList);
					cluster.setHypervisor(hypervisoirUIDList.get(0));
				}
				cluster.setRuntime(RedundancyKind.get(astereotypeARedundancyCluster.getRuntime().getName()));
			}

			this.gcm_study.getCras().add(gcm_cra);
			fr.cea.nacre.model.factory.JsonResult interm_jsonResult = gcmFactory.getJsonResult();
			interm_jsonResult.setStudy(this.gcm_study);

			addReferenceForComputingResources( stereotypeAppCompResources);

			addReferenceForSoftwareResources( stereotypeAppSchedulResList);

			addReferenceForCommunicationMedias( stereotypeAppComMediaList);

			// prepare the references id for all CRAS components
			for (Map.Entry<Object, Object> m : gcmFactory.commMediaMap.entrySet()) {
				CommunicationMedia comMed = (CommunicationMedia) m.getKey();
				Class base_comMed = (Class) comMed.getBase_Classifier();
				String path = "ERROR";
				path=getUIDFromElement(base_comMed);
				gcmFactory.craMap.put(base_comMed, path);
			}

			for (Map.Entry<Object, Object> m : gcmFactory.compResMap.entrySet()) {
				ComputingResource compRes = (ComputingResource) m.getKey();
				Class base_comRes = (Class) compRes.getBase_Classifier();
				fr.cea.nacre.model.NACREMM.cra.ComputingResource gcmCompRes =
						(fr.cea.nacre.model.NACREMM.cra.ComputingResource) m.getValue();
				String uid = gcmCompRes.getUid();
				gcmFactory.craMap.put(base_comRes, uid);
			}

			for (Map.Entry<Object, Object> m : gcmFactory.swResMap.entrySet()) {
				SwSchedulableResource swRes = (SwSchedulableResource) m.getKey();
				Class base_swRes = (Class) swRes.getBase_Classifier();
				fr.cea.nacre.model.NACREMM.cra.SoftwareResource gcmSoftRes =
						(fr.cea.nacre.model.NACREMM.cra.SoftwareResource) m.getValue();
				String uid = gcmSoftRes.getUid();
				gcmFactory.craMap.put(base_swRes, uid);
			}

			for (Map.Entry<Object, Object> m : gcmFactory.cluster.entrySet()) {
				RedundancyCluster stereocluster = (RedundancyCluster) m.getKey();
				Class base_swRes = stereocluster.getBase_Class();
				fr.cea.nacre.model.NACREMM.cra.RedundancyCluster rcluster =	(fr.cea.nacre.model.NACREMM.cra.RedundancyCluster) m.getValue();
				String uid = rcluster.getUid();
				gcmFactory.craMap.put(base_swRes, uid);
			}
			//this.gcm_study.getCras().add(gcm_cra);
		}
		return gcm_study;
	}
	/**
	 * Construct an instance of CommunicationMedia from a MARTE stereotypeApplication
	 * @param gcm_cra
	 * @param stereotypeAppComMedia, never null
	 * @return a NAcre communicationMedia
	 */
	private fr.cea.nacre.model.NACREMM.cra.CommunicationMedia createMMCommunicationMedia(
			fr.cea.nacre.model.NACREMM.cra.Cra gcm_cra, CommunicationMedia stereotypeAppComMedia) {
		fr.cea.nacre.model.NACREMM.cra.CommunicationMedia gcm_comMedia = createCommunicationMedia(
				gcm_cra, stereotypeAppComMedia.getBase_Classifier().getName(),
				stereotypeAppComMedia.getBase_Classifier().getQualifiedName());
		if (stereotypeAppComMedia.getBlockT() != null) {
			Integer value = getNetworkLatency(stereotypeAppComMedia);
			String unit   = getNetworkLatencyUnit(stereotypeAppComMedia);
			CommonType gcm_commonType = createCommonType(value, unit);
			gcm_comMedia.setLatency(gcm_commonType);
		}
		if (stereotypeAppComMedia.getCapacity() != null) {
			Integer value = getNetworkCapacityValue(stereotypeAppComMedia);
			String unit   = getNetworkCapacityUnit(stereotypeAppComMedia);
			CommonType gcm_commonType = createCommonType(value, unit);
			gcm_comMedia.setCapacity(gcm_commonType);
		}
		return gcm_comMedia;
	}

	private void addReferenceForComputingResources(
			List<ComputingResource> computingResources) {

		// for computing resource, get the connected communication medias
		// and set their UIDs to the reference communicationMedias.
		for (ComputingResource cr : computingResources) {

			List<CommunicationMedia> networks = getCommunicationMediaforCompRes(cr);
			List<String> uids = (networks.stream()
					.map(CommunicationMedia::getBase_Classifier)
					.collect(Collectors.toList())).stream()
					.map(UMLtoCFRAMMjob::getUIDFromElement)
					.collect(Collectors.toList());

			fr.cea.nacre.model.NACREMM.cra.ComputingResource gcm_cresource =
					(fr.cea.nacre.model.NACREMM.cra.ComputingResource ) gcmFactory.compResMap.get(cr);
			// format the result according to pattern "#study/cras/0/communicationMedias/3"
			List<String> formattedResult = new ArrayList<>();
			formattedResult.addAll(uids);
			gcm_cresource.getCommunicationMedias().addAll(formattedResult);
		}
	}


	@Override
	public EObject getElement() {
		return null;
	}

	/**
	 * return the list of stereotype Application of communication Merdia from a list of elements
	 * @param UMLElementList of UML element
	 * @return the list of stereotype Application of communication Media
	 */
	private List<CommunicationMedia> getCommMedias(List<Element> UMLElementList) {

		List<CommunicationMedia> stereotypeAppCpmMediaCollecion = new ArrayList<CommunicationMedia>();
		for (Element classe : UMLElementList) {
			CommunicationMedia stereotypeAppCpmMedia =
					UMLUtil.getStereotypeApplication(classe, CommunicationMedia.class);
			if (stereotypeAppCpmMedia != null) {
				stereotypeAppCpmMediaCollecion.add(stereotypeAppCpmMedia);
			}
		}
		return stereotypeAppCpmMediaCollecion;
	}

	private Integer getNetworkLatency(CommunicationMedia communicationMedia) {
		Integer latency = 0;

		if (communicationMedia != null && communicationMedia.getBlockT() != null
				&& !communicationMedia.getBlockT().isEmpty()) {
			String blockt = communicationMedia.getBlockT().get(0);

			String[] values = blockt.split(SEPARATOR);
			if (values != null && values.length > 0) {
				return Integer.parseInt(values[0]);
			}
		}
		return latency;
	}

	private String getNetworkLatencyUnit(CommunicationMedia communicationMedia) {
		String value = new String();

		if (communicationMedia != null && communicationMedia.getBlockT() != null
				&& !communicationMedia.getBlockT().isEmpty()) {
			String blockt = communicationMedia.getBlockT().get(0);

			String[] values = blockt.split(SEPARATOR);
			if (values != null && values.length > 1) {
				String marte_unit = convertUnit(values[1]);
				return marte_unit;
			}
		}
		return value;
	}

	private Integer getNetworkCapacityValue(CommunicationMedia StereotypeAppComMedia) {
		Integer capacity = 0;

		if (StereotypeAppComMedia != null && StereotypeAppComMedia.getCapacity() != null
				&& !StereotypeAppComMedia.getCapacity().isEmpty()) {
			String capacity1 = StereotypeAppComMedia.getCapacity().get(0);

			String[] values = capacity1.split(SEPARATOR);
			if (values != null && values.length > 0) {
				return Integer.parseInt(values[0]);
			}
		}
		return capacity;
	}

	private String getNetworkCapacityUnit(CommunicationMedia StereotypeAppComMedia) {
		String value = ""; //$NON-NLS-1$

		if (StereotypeAppComMedia != null && StereotypeAppComMedia.getCapacity() != null
				&& !StereotypeAppComMedia.getCapacity().isEmpty()) {
			String capacity = StereotypeAppComMedia.getCapacity().get(0);

			String[] values = capacity.split(SEPARATOR);
			if (values != null && values.length > 1) {
				// String marte_unit = convertUnit(values[1]);
				return values[1];
			}
		}
		return value;
	}
	private String convertUnit(String marte_unit) {
		String result = marte_unit;
		if (marte_unit.equals(MS_UNIT)) {
			result = MILLISECOND;
		} else if (marte_unit.equals(S_UNIT)) {
			result = SECOND;
		}
		if (marte_unit.equals(MIN_UNIT)) {
			result = MIN_UNIT;
		}
		return result;
	}



	/**
	 * return the list of application of stereotype RedundancyCluster from a list of UML element
	 * @param UMLElementlist never null
	 * @return the list of application of RedundancyCluster
	 */
	private List<RedundancyCluster> getRedundancyCluster(List<Element> UMLElementlist) {

		List<RedundancyCluster> stereotypeRedundancyClusterList = new ArrayList<RedundancyCluster>();
		for (Element UMLElement : UMLElementlist) {
			RedundancyCluster stereotypeAppRedundancyCluster = UMLUtil.getStereotypeApplication(UMLElement, RedundancyCluster.class);
			if (stereotypeAppRedundancyCluster != null) {
				stereotypeRedundancyClusterList.add(stereotypeAppRedundancyCluster);
			}
		}
		return stereotypeRedundancyClusterList;
	}

	/**
	 * return the list of application of stereotype Computing resource from a list of UML element
	 * @param UMLElementlist never null
	 * @return the list of application of stereotype Computing resource
	 */
	private List<ComputingResource> getCompRes(List<Element> UMLElementlist) {

		List<ComputingResource> stereotypeAppCompResourceList = new ArrayList<ComputingResource>();
		for (Element UMLElement : UMLElementlist) {
			ComputingResource stereotypeAppComputingResource =
					UMLUtil.getStereotypeApplication(UMLElement, ComputingResource.class);
			if (stereotypeAppComputingResource != null) {
				stereotypeAppCompResourceList.add(stereotypeAppComputingResource);
			}
		}
		return stereotypeAppCompResourceList;
	}


	/**
	 * return the list of application of stereotype Software resource from a list of UML element
	 * @param UMLElementlist never null
	 * @return the list of application of stereotype software resource
	 */
	private List<SwSchedulableResource> getScheduleRes(List<Element> UMLElementlist) {

		List<SwSchedulableResource> stereotypeAppSchedulResList = new ArrayList<SwSchedulableResource>();
		for (Element classe : UMLElementlist) {
			SwSchedulableResource stereotypeAppSchedulRes =
					UMLUtil.getStereotypeApplication(classe, SwSchedulableResource.class);
			if (stereotypeAppSchedulRes != null) {
				stereotypeAppSchedulResList.add(stereotypeAppSchedulRes);
			}
		}
		return stereotypeAppSchedulResList;
	}

	/**
	 * get the value of the period (type) from a sterotypeApplication
	 * @param stereotypeAppswSchRes
	 * @return
	 */
	private double getSwRPeriod(SwSchedulableResource stereotypeAppswSchRes) {
		double period = 0.0;
		if (stereotypeAppswSchRes != null) {
			String pattern = stereotypeAppswSchRes.getType();
			String[] values = pattern.split(SEPARATOR);
			if (values != null && values.length > 0) {
				String[] periods = values[0].split(EQUAL_SEPARATOR);
				if (periods != null && periods.length > 1) {
					return Double.parseDouble(periods[1]);
				}
			}
		}
		return period;
	}

	/**
	 * get the resourceUsage StereotypeApplication  from a sterotypeApplication SwSchedulableResource
	 * @param stereotypeAppswSchRes
	 * @return ResourceUsage stereotypeApp
	 */
	private ResourceUsage getSwRResourceUsage(SwSchedulableResource stereotypeAppSchedulRes) {
		ResourceUsage stereotypeAppResUsage = null;

		Element UMLclassifier = stereotypeAppSchedulRes.getBase_Classifier();

		if (UMLUtil.getStereotypeApplication(UMLclassifier, ResourceUsage.class) != null) {
			stereotypeAppResUsage = UMLUtil.getStereotypeApplication(UMLclassifier, ResourceUsage.class);
		}

		return stereotypeAppResUsage;
	}


	/**
	 * return the exectime value from a resourceUsage
	 * @param stereotypeAppResUsage
	 * @return
	 */
	private Integer getSwRExecTimeValue(ResourceUsage stereotypeAppResUsage) {
		Integer exectimeValue = 0;

		if (stereotypeAppResUsage != null) {
			List<String> execTimes = stereotypeAppResUsage.getExecTime();
			if (execTimes != null && !execTimes.isEmpty() && execTimes.get(0) != null) {
				String value = execTimes.get(0);
				//				if( value.startsWith("[") ) { // Due to '[' of "[5, s]" or "[45, s]"
				//					value = value.substring(1);
				//				}
				String[] values = value.split(SEPARATOR);
				if (values != null && values.length > 0 && values[0] != null) {
					Integer valueInt = Integer.valueOf(values[0]);
					exectimeValue = valueInt;
				}
			}
		}

		return exectimeValue;
	}

	/**
	 * return the exectime unit from a resourceUsage
	 * @param stereotypeAppResUsage
	 * @return
	 */
	private String getSwRExecTimeUnit(ResourceUsage stereotypeAppResUsage) {
		String execTimeUnit = ""; //$NON-NLS-1$
		if (stereotypeAppResUsage != null) {
			List<String> execTimes = stereotypeAppResUsage.getExecTime();
			if (execTimes != null && !execTimes.isEmpty() && execTimes.get(0) != null) {
				String value = execTimes.get(0);
				String[] values = value.split(SEPARATOR);
				if (values != null && values.length > 1 && values[1] != null) {
					String marte_unit = values[1];
					execTimeUnit = convertUnit(marte_unit);
				}
			}
		}

		return execTimeUnit;
	}
	private void addReferenceForSoftwareResources(	List<SwSchedulableResource> softwareResources) {
		// for computing resource, get the connected communication medias
		// and set their UIDs to the reference communicationMedias.
		for (SwSchedulableResource sr : softwareResources) {

			List<ComputingResource> computingRes = getComputingResources(sr);
			List<String> uids = (computingRes.stream()
					.map(ComputingResource::getBase_Classifier)
					.collect(Collectors.toList())).stream()
					.map(UMLtoCFRAMMjob::getUIDFromElement)
					.collect(Collectors.toList());

			SoftwareResource gcm_sresource = (SoftwareResource) gcmFactory.swResMap.get(sr);
			// format the result according to pattern "#study/cras/0/communicationMedias/3"
			List<String> formattedResult = new ArrayList<>();
			formattedResult.addAll(uids);
			gcm_sresource.getComputingResources().addAll(formattedResult);
		}
	}

	private List<String> getUIDListFromSWResourceList(	List<SwSchedulableResource> softwareResources) {
		// for computing resource, get the connected communication medias
		// and set their UIDs to the reference communicationMedias.

			List<String> uids = (softwareResources.stream()
					.map(SchedulableResource::getBase_Classifier)
					.collect(Collectors.toList())).stream()
					.map(UMLtoCFRAMMjob::getUIDFromElement)
					.collect(Collectors.toList());

			// format the result according to pattern "#study/cras/0/communicationMedias/3"
			List<String> formattedResult = new ArrayList<>();
			formattedResult.addAll(uids);
			return formattedResult;
	}



	private List<ComputingResource> getComputingResources(SwSchedulableResource swSchRes) {
		List<ComputingResource> computingResources = new ArrayList<>();
		Classifier classifier = swSchRes.getBase_Classifier();
		Model packge = classifier.getModel();
		List<Element> abstractions = packge.allOwnedElements().stream().filter(a -> a instanceof Abstraction)
				.collect(Collectors.toList());
		for (Element relation : abstractions) {
			if (relation instanceof Abstraction) {
				Abstraction abs = (Abstraction) relation;
				if (UMLUtil.getStereotypeApplication(abs,Allocate.class) != null) {
					if (abs.getClients() != null && !abs.getClients().isEmpty()
							&& abs.getClients().contains(classifier)) {
						Element supplier = abs.getSuppliers().get(0);
						if (UMLUtil.getStereotypeApplication(supplier, ComputingResource.class) != null) {
							computingResources.add(UMLUtil.getStereotypeApplication(supplier, ComputingResource.class));
						}
					}
				}
			}
		}

		return computingResources;
	}
	private void addReferenceForCommunicationMedias(List<CommunicationMedia> communicationMedias) {
		// for computing resource, get the connected communication medias
		// and set their UIDs to the reference communicationMedias.
		for (CommunicationMedia comMed : communicationMedias) {

			List<CommunicationMedia> computingRes =
					getCommunicationMediaforComMedia(comMed);
			List<String> uids = (computingRes.stream()
					.map(CommunicationMedia::getBase_Classifier)
					.collect(Collectors.toList())).stream()
					.map(UMLtoCFRAMMjob::getUIDFromElement)
					.collect(Collectors.toList());

			fr.cea.nacre.model.NACREMM.cra.CommunicationMedia gcm_sresource =
					(fr.cea.nacre.model.NACREMM.cra.CommunicationMedia) gcmFactory.commMediaMap.get(comMed);
			// format the result according to pattern "#study/cras/0/communicationMedias/3"
			List<String> formattedResult = new ArrayList<>();
			formattedResult.addAll(uids);
			gcm_sresource.getCommunicationMedias().addAll(formattedResult);
		}
	}
	private List<CommunicationMedia> getCommunicationMediaforCompRes(ComputingResource computingResource) {

		List<CommunicationMedia> networks = new ArrayList<>();

		Element element = computingResource.getBase_Classifier();
		org.eclipse.uml2.uml.Package pakage = element.getModel();

		List<Element> abstractions = pakage.allOwnedElements().stream().filter(a -> a instanceof Abstraction)
				.collect(Collectors.toList());
		for (Element relation : abstractions) {
			if (relation instanceof Abstraction) {
				Abstraction abs = (Abstraction) relation;

				if (UMLUtil.getStereotypeApplication(abs, Connect.class)!=null) {
					if (abs.getClients() != null && !abs.getClients().isEmpty() && abs.getClients().contains(element)) {
						Element supplier = abs.getSuppliers().get(0);
						if (UMLUtil.getStereotypeApplication(supplier, CommunicationMedia.class) != null) {
							networks.add(UMLUtil.getStereotypeApplication(supplier, CommunicationMedia.class));
						}
					}
				}
			}
		}

		return networks;
	}
	private List<CommunicationMedia> getCommunicationMediaforComMedia(CommunicationMedia computingResource) {

		List<CommunicationMedia> networks = new ArrayList<>();

		Element element = computingResource.getBase_Classifier();
		org.eclipse.uml2.uml.Package pakage = element.getModel();

		List<Element> abstractions = pakage.allOwnedElements().stream().filter(a -> a instanceof Abstraction)
				.collect(Collectors.toList());
		for (Element relation : abstractions) {
			if (relation instanceof Abstraction) {
				Abstraction abs = (Abstraction) relation;

				if (UMLUtil.getStereotypeApplication(abs, Link.class) != null) {
					if (abs.getClients() != null && !abs.getClients().isEmpty() && abs.getClients().contains(element)) {
						Element supplier = abs.getSuppliers().get(0);
						if (UMLUtil.getStereotypeApplication(supplier, CommunicationMedia.class)!= null) {
							networks.add(UMLUtil.getStereotypeApplication(supplier, CommunicationMedia.class));
						}
					}
					if (abs.getSuppliers() != null && !abs.getSuppliers().isEmpty()
							&& abs.getSuppliers().contains(element)) {
						Element client = abs.getClients().get(0);
						if (UMLUtil.getStereotypeApplication(client, CommunicationMedia.class) != null) {
							networks.add(UMLUtil.getStereotypeApplication(client, CommunicationMedia.class));
						}
					}
				}
			}
		}

		return networks;
	}


	/////////////////////////////////////
	// COMMON TYPE FACTORY
	/////////////////////////////////////
	private final static CommonTypeFactory COMMON_TYPE_FACTORY = CommonTypeFactory.eINSTANCE;

	protected CommonType createCommonType(int value, String unit) {
		CommonType commonType = COMMON_TYPE_FACTORY.createCommonType();

		commonType.setValue(value);
		commonType.setUnit(unit);

		return commonType;
	}

	protected PeriodType createPeriodType(double period, String unit) {
		PeriodType periodType = COMMON_TYPE_FACTORY.createPeriodType();

		periodType.setValue(period);
		periodType.setUnit(unit);

		return periodType;
	}


	/////////////////////////////////////
	// CRA FACTORY
	/////////////////////////////////////
	private final static CraFactory CRA_FACTORY = CraFactory.eINSTANCE;

	protected fr.cea.nacre.model.NACREMM.cra.Cra createCra(Study study, String name, String qualifiedName) {
		fr.cea.nacre.model.NACREMM.cra.Cra cra = CRA_FACTORY.createCra();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		study.getCras().add(cra);

		cra.setName(name);
		cra.setQualifiedName(qualifiedName);

		return  cra;
	}

	protected fr.cea.nacre.model.NACREMM.cra.CommunicationMedia createCommunicationMedia(
			fr.cea.nacre.model.NACREMM.cra.Cra cra, String name, String qualifiedName) {
		fr.cea.nacre.model.NACREMM.cra.CommunicationMedia comMedia = CRA_FACTORY.createCommunicationMedia();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		cra.getCommunicationMedias().add(comMedia);

		comMedia.setName(name);
		comMedia.setQualifiedName(qualifiedName);

		return comMedia;
	}


	protected fr.cea.nacre.model.NACREMM.cra.RedundancyCluster createRedundancyCluster(
			fr.cea.nacre.model.NACREMM.cra.Cra cra, String name,String qualifiedName) {
		fr.cea.nacre.model.NACREMM.cra.RedundancyCluster cluster = CRA_FACTORY.createRedundancyCluster();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		cra.getRedundancyClusters().add(cluster);

		cluster.setName(name);
		cluster.setQualifiedName(qualifiedName);

		return cluster;
	}


	protected fr.cea.nacre.model.NACREMM.cra.ComputingResource createComputingResource(
			fr.cea.nacre.model.NACREMM.cra.Cra cra, String name,String qualifiedName) {
		fr.cea.nacre.model.NACREMM.cra.ComputingResource compResource = CRA_FACTORY.createComputingResource();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		cra.getComputingResources().add(compResource);

		compResource.setName(name);
		compResource.setQualifiedName(qualifiedName);

		return compResource;
	}

	protected fr.cea.nacre.model.NACREMM.cra.SoftwareResource createSoftwareResource(
			fr.cea.nacre.model.NACREMM.cra.Cra cra, String name,String qualifiedName) {
		fr.cea.nacre.model.NACREMM.cra.SoftwareResource softResource = CRA_FACTORY.createSoftwareResource();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		cra.getSoftwareResources().add(softResource);

		softResource.setName(name);
		softResource.setQualifiedName(qualifiedName);

		return softResource;
	}

}
