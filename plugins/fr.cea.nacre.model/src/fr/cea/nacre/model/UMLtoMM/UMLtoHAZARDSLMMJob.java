package fr.cea.nacre.model.UMLtoMM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
//import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.CommonType.CommonTypeFactory;
import fr.cea.nacre.model.NACREMM.Hazard.CfaHazard;
import fr.cea.nacre.model.NACREMM.Hazard.CraHazard;
import fr.cea.nacre.model.NACREMM.Hazard.HazardFactory;
import fr.cea.nacre.model.NACREMM.Hazard.NACREHazard;
//import fr.cea.nacre.model.NACREMM.cra.Cra;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.factory.GCMFactory2;

public class UMLtoHAZARDSLMMJob extends AbstractUMLtoNACRE {

	private static final String SECOND = "second"; //$NON-NLS-1$
	// rules:
	// all target elements of are prefixed by the metamodel by "gcm_"
	// all UML native element are prefixed by "UML
	// all stereotype application are prefixed by "StereotypeApp"
	private org.eclipse.uml2.uml.Package UML_craPackage;
	private org.eclipse.uml2.uml.Package UML_cfaPackage;
	@SuppressWarnings("unused")
	private Class UML_mainGrid;

	private GCMFactory2 gcmFactory;
	private Study gcm_study;
	private NACREHazard nacreHazard;

	public UMLtoHAZARDSLMMJob(org.eclipse.uml2.uml.Package UML_cra_package,
			org.eclipse.uml2.uml.Package UML_cfa_Package, Class UML_maingrid, GCMFactory2 gcmFactory, Study study) {

		this.UML_craPackage = UML_cra_package;
		this.UML_cfaPackage = UML_cfa_Package;
		this.UML_mainGrid = UML_maingrid;
		this.gcmFactory = gcmFactory;
		this.gcm_study = study;

	}

	@Override
	public EObject construct() {

		this.nacreHazard = HazardFactory.eINSTANCE.createNACREHazard();
		this.gcm_study.setHazards(nacreHazard);
		this.nacreHazard.setName("hazards");
		this.nacreHazard.setQualifiedName(this.gcm_study.getQualifiedName() + "_" + "hazards");

		gcm_study.setHazards(this.nacreHazard);
		List<Package> UML_craSubPackages = UML_craPackage.getNestedPackages();
		// List<Cra> gcm_cras = new ArrayList<>();
		// we iterate on Each CRA package
		for (Package UML_craSubPackage : UML_craSubPackages) {

			/************* generate Hazards **************************/
			// check if there is a Hazards stereotyped applied on the cra elements, if yes,
			// create an Hazard object (without cra from the nacre_object)

			// code that idependent of the loop!
			// Model model = UML_mainGrid.getModel();
			// List<EObject> UMLElementList = model.eResource().getContents();
			// List<EObject> stereotypeAppHazardsList = new ArrayList<>();
			// List<Hazards> gcm_Hazards = new ArrayList<>();
			List<fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard> gcm_comHazardList = new ArrayList<>();

			// this is only the component hazards
			for (Iterator<EObject> iterator = UML_craSubPackage.eAllContents(); iterator.hasNext();) {
				EObject craElement = iterator.next();

				// test if the calss is stereotyped Hazard;
				if (craElement instanceof Class) {
					contructCommHazardFromClass(gcm_comHazardList, craElement);
				}
				// test on deploiement elements
				if (craElement instanceof Abstraction) {
					Abstraction UMLabstraction = (Abstraction) craElement;

					if (UMLabstraction != null && UMLUtil.getStereotypeApplication(UMLabstraction,
							hazards.CommunicationHazard.class) != null) {
						constructHazardFromAbstraction(gcm_comHazardList, UMLabstraction);
					}
				}
			}
			if (gcm_comHazardList.size() > 0) {
				String craUid = getUIDFromElement(UML_craSubPackage);
				CraHazard gcm_hazards = createCraHazard(gcm_study, craUid);
				gcm_hazards.getCommunicationHazards().addAll(gcm_comHazardList);
			}
		}
		List<fr.cea.nacre.model.NACREMM.Hazard.LineHazard> gcm_LineHazardList = new ArrayList<>();
		List<fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard> gcm_GenerHazardList = new ArrayList<>();
		// this is only the line hazards
		for (Iterator<EObject> iterator = UML_cfaPackage.eAllContents(); iterator.hasNext();) {
			EObject cfaElement = iterator.next();

			// test if the class is stereotyped Hazard;
			if (cfaElement instanceof Class) {
				contructLineHazardFromClass(gcm_LineHazardList, cfaElement);
			}

			else if (cfaElement instanceof Property) {
				contructGeneratorHazardFromClass(gcm_GenerHazardList, cfaElement);
			}

		}
		String cfaUid = getUIDFromElement(UML_cfaPackage);
		CfaHazard gcm_hazards = createCfaHazard(gcm_study, cfaUid);
		if (gcm_LineHazardList.size() > 0) {
			gcm_hazards.getLineHazards().addAll(gcm_LineHazardList);
		}

		if (gcm_GenerHazardList.size() > 0) {
			gcm_hazards.getGeneratorhazard().addAll(gcm_GenerHazardList);
		}

		//////////////////////////////////////////////////////////////////////////////

		return gcm_study;
	}

	private void constructHazardFromAbstraction(
			List<fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard> gcm_comHazardList, Abstraction UMLabstraction) {
		hazards.CommunicationHazard linkHaz = UMLUtil.getStereotypeApplication(UMLabstraction,
				hazards.CommunicationHazard.class);

		// find supplier and test if it is CommunicationMedia or ComputingRes and get
		// its path
		NamedElement supplier = UMLabstraction.getSuppliers().get(0);
		NamedElement client = UMLabstraction.getClients().get(0);
		String from = gcmFactory.craMap.get(client);
		String to = gcmFactory.craMap.get(supplier);
		// String cra = gcmFactory.craMap.get(supplier).substring(0, 14);

		fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard gcm_hazard = createCommunicationHazard(from, to);

		gcm_hazard.setPercent(getPercentage(linkHaz));
		gcm_hazard.setName(linkHaz.getName());
		gcm_hazard.setQualifiedName(linkHaz.getName());
		gcm_hazard.setDescription(linkHaz.getDescription());
		gcm_hazard.setJustification(linkHaz.getJustification());
		if (linkHaz.getPeriod() != null) {
			gcm_hazard.setPeriod(getPeriod(linkHaz));
		}
		gcm_comHazardList.add(gcm_hazard);
	}

	private void contructCommHazardFromClass(
			List<fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard> gcm_comHazardList, EObject craElement) {
		hazards.CommunicationHazard stereotypeAppHazard = UMLUtil.getStereotypeApplication((Class) craElement,
				hazards.CommunicationHazard.class);
		if (stereotypeAppHazard != null) {
			Class UML_HazardClass = (stereotypeAppHazard).getBase_Class();
			String componentID = "none";
			componentID = getUIDFromElement(UML_HazardClass);

			if (componentID != null) {
				// String cra = componentID.substring(0, 14);

				double percent = getPercentage(stereotypeAppHazard);
				fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard gcm_hazard = createCommunicationHazard(
						componentID, percent);
				gcm_hazard.setName(stereotypeAppHazard.getName());
				gcm_hazard.setQualifiedName(stereotypeAppHazard.getName());
				gcm_hazard.setDescription(stereotypeAppHazard.getDescription());
				gcm_hazard.setJustification(stereotypeAppHazard.getJustification());
				if (stereotypeAppHazard.getPeriod() != null) {
					gcm_hazard.setPeriod(getPeriod(stereotypeAppHazard));
				}
				gcm_comHazardList.add(gcm_hazard);

			}
		}
	}

	private void contructLineHazardFromClass(List<fr.cea.nacre.model.NACREMM.Hazard.LineHazard> gcm_lineHazardList,
			EObject cfaElement) {
		hazards.LineHazard stereotypeAppHazard = UMLUtil.getStereotypeApplication((Class) cfaElement,
				hazards.LineHazard.class);
		if (stereotypeAppHazard != null) {
			Class UML_HazardClass = (stereotypeAppHazard).getBase_Class();
			String componentID = "none";
			componentID = getUIDFromElement(UML_HazardClass);
			if (componentID != null) {
				// String cra = componentID.substring(0, 14);

				fr.cea.nacre.model.NACREMM.Hazard.LineHazard gcm_hazard = createLineHazard(componentID);
				gcm_hazard.setName(stereotypeAppHazard.getName());
				gcm_hazard.setQualifiedName(stereotypeAppHazard.getName());
				gcm_hazard.setDescription(stereotypeAppHazard.getDescription());
				gcm_hazard.setJustification(stereotypeAppHazard.getJustification());
				gcm_hazard.setStart(getPeriodType(stereotypeAppHazard));
				gcm_hazard.setLine(UML_HazardClass.getName());
				gcm_lineHazardList.add(gcm_hazard);

			}
		}
	}

	//////////// GeneratorHazard
	private void contructGeneratorHazardFromClass(
			List<fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard> gcm_GeneHazardList, EObject cfaElement) {
		hazards.GeneratorHazard stereotypeAppHazard = UMLUtil.getStereotypeApplication((NamedElement) cfaElement,
				hazards.GeneratorHazard.class);
		if (stereotypeAppHazard != null) {
			Property UML_HazardClass = (stereotypeAppHazard).getBase_Property();
			String componentID = "none";
			componentID = getUIDFromElement(UML_HazardClass);
			if (componentID != null) {
				fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard gcm_hazard = createGeneratorHazard(componentID);
				gcm_hazard.setName(stereotypeAppHazard.getName());
				gcm_hazard.setQualifiedName(stereotypeAppHazard.getName());
				gcm_hazard.setDescription(stereotypeAppHazard.getDescription());
				gcm_hazard.setJustification(stereotypeAppHazard.getJustification());
				gcm_hazard.setStart(getPeriodType(stereotypeAppHazard));
				gcm_hazard.setGenerator(UML_HazardClass.getName());
				gcm_GeneHazardList.add(gcm_hazard);

			}
		}
	}
	////////////

	@Override
	public EObject getElement() {
		return gcm_study;
	}

	private double getPercentage(hazards.CommunicationHazard hazard) {
		double percent = (hazard != null) ? hazard.getPercent() : 100.0;
		return percent;
	}

	private fr.cea.nacre.model.NACREMM.CommonType.Period getPeriod(hazards.CommunicationHazard hazard) {
		fr.cea.nacre.model.NACREMM.CommonType.Period period = CommonTypeFactory.eINSTANCE.createPeriod();
		period.setEnd(0);
		period.setStart(0);
		period.setUnit(SECOND);
		if (hazard != null) {
			hazards.Period StereotypeAppPeriod = hazard.getPeriod();
			if (StereotypeAppPeriod != null) {
				Integer start = StereotypeAppPeriod.getStart();
				Integer end = StereotypeAppPeriod.getEnd();
				period.setStart(start);
				period.setEnd(end);
				return period;
			}
		}
		return period;
	}

	private fr.cea.nacre.model.NACREMM.CommonType.PeriodType getPeriodType(hazards.LineHazard hazard) {
		fr.cea.nacre.model.NACREMM.CommonType.PeriodType period = CommonTypeFactory.eINSTANCE.createPeriodType();
		period.setValue(hazard.getStart());

		period.setUnit(SECOND);

		return period;
	}

	private fr.cea.nacre.model.NACREMM.CommonType.PeriodType getPeriodType(hazards.GeneratorHazard hazard) {
		fr.cea.nacre.model.NACREMM.CommonType.PeriodType period = CommonTypeFactory.eINSTANCE.createPeriodType();
		period.setValue(hazard.getStart());

		period.setUnit(SECOND);

		return period;
	}

	/////////////////////////////////////
	// HAZARD FACTORY
	/////////////////////////////////////
	private final static HazardFactory HAZARD_FACTORY = HazardFactory.eINSTANCE;

	protected CraHazard createCraHazard(Study study, String craName) {
		CraHazard hazards = HAZARD_FACTORY.createCraHazard();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		this.nacreHazard.getCraHazards().add(hazards);
		hazards.setName(craName + "_hazards");
		hazards.setQualifiedName(craName);
		hazards.setCra(craName);

		return hazards;
	}

	protected CfaHazard createCfaHazard(Study study, String cfaName) {
		CfaHazard hazards = HAZARD_FACTORY.createCfaHazard();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		this.nacreHazard.getCfaHazards().add(hazards);
		hazards.setName(cfaName + "_hazards");
		hazards.setQualifiedName(cfaName);
		hazards.setCfa(cfaName);

		return hazards;
	}

	protected fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard createCommunicationHazard(String componentID,
			double percent) {
		fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard hazard = HAZARD_FACTORY.createCommunicationHazard();

		hazard.setComponent(componentID);
		hazard.setPercent(percent);

		return hazard;
	}

	protected fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard createCommunicationHazard(String from, String to) {
		fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard hazard = HAZARD_FACTORY.createCommunicationHazard();

		hazard.setFrom(from);
		hazard.setTo(to);

		return hazard;
	}

	protected fr.cea.nacre.model.NACREMM.Hazard.LineHazard createLineHazard(String lineID) {
		fr.cea.nacre.model.NACREMM.Hazard.LineHazard hazard = HAZARD_FACTORY.createLineHazard();

		hazard.setLine(lineID);

		return hazard;
	}

	protected fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard createGeneratorHazard(String generatorID) {
		fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard hazard = HAZARD_FACTORY.createGeneratorHazard();

		hazard.setGenerator(generatorID);

		return hazard;
	}

}
