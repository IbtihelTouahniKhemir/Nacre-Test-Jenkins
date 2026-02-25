package fr.cea.nacre.model.UMLtoMM;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.cfra.Cfra;
import fr.cea.nacre.model.NACREMM.cfra.CfraFactory;
import fr.cea.nacre.model.NACREMM.cra.RedundancyCluster;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.factory.GCMFactory2;
import nacre.CFRA;

public class UMLtoCFRAMMjob extends AbstractUMLtoNACRE {

	// rules:
	// all target elements of are prefixed by the metamodel by "gcm_"
	// all UML native element are prefixed by "UML
	// all stereotype application are prefixed by "StereotypeApp"
	private org.eclipse.uml2.uml.Package UML_cfras_package;
	private Study gcm_study;

	public UMLtoCFRAMMjob(org.eclipse.uml2.uml.Package UML_cfras_package, Study study) {
		this.UML_cfras_package = UML_cfras_package;
		this.gcm_study = study;
	}

	@Override
	public EObject construct() {
		List<Package> UML_cfraPackageList = UML_cfras_package.getNestedPackages();

		for (Package UML_cfraPackage : UML_cfraPackageList) {
			String craUid = null;
			// get The Cra from the CFRA stereotype applied to the Package
			CFRA cfra = UMLUtil.getStereotypeApplication(UML_cfraPackage, CFRA.class);
			craUid = getUIDFromElement(cfra.getCra().getBase_Package());
			Cfra gcm_cfra = createCfra(gcm_study, UML_cfraPackage.getName(), UML_cfraPackage.getQualifiedName(),
					craUid);

			List<Element> UML_abstractions = UML_cfraPackage.allOwnedElements().stream()
					.filter(a -> a instanceof Abstraction).collect(Collectors.toList());

			for (Element UML_Element : UML_abstractions) {

				if (UML_Element instanceof Abstraction) {
					Abstraction UML_abstraction = (Abstraction) UML_Element;
					EList<NamedElement> clients = UML_abstraction.getClients();
					EList<NamedElement> suppliers = UML_abstraction.getSuppliers();
					if ((clients != null) && (!clients.isEmpty()) && (suppliers != null) && (!suppliers.isEmpty())) {
						// we assume only one refinement per concept, should be changed for the future
						// suppliers are abstract concept in the CFA
						NamedElement client = clients.get(0);
						SwSchedulableResource swResource = UMLUtil.getStereotypeApplication(client,
								SwSchedulableResource.class);
						if (swResource != null) {
							NamedElement UML_cfa_supplier = suppliers.get(0);

							SwSchedulableResource stereotypeAppSchedulRes = UMLUtil.getStereotypeApplication(client,
									SwSchedulableResource.class);

							// populate the abstraction with paths of cfa and swr elements

							String gcm_supplier = getUIDFromElement(UML_cfa_supplier);
							String gcm_client = getUIDFromElement(stereotypeAppSchedulRes.getBase_Classifier());

							@SuppressWarnings("unused")
							fr.cea.nacre.model.NACREMM.cfra.Abstraction gcm_abstraction = createAbstraction(gcm_cfra,
									gcm_supplier, gcm_client);
						}
						
						nacre.RedundancyCluster rClusterApp = UMLUtil.getStereotypeApplication(client,nacre.RedundancyCluster.class);
						if (rClusterApp != null) {
							NamedElement UML_cfa_supplier = suppliers.get(0);

			

							// populate the abstraction with paths of cfa and swr elements

							String gcm_supplier = getUIDFromElement(UML_cfa_supplier);
							String gcm_client = getUIDFromElement(rClusterApp.getBase_Class());

							@SuppressWarnings("unused")
							fr.cea.nacre.model.NACREMM.cfra.Abstraction gcm_abstraction = createAbstraction(gcm_cfra,
									gcm_supplier, gcm_client);
						}
						
					}
				}
			}
		}

		return gcm_study;
	}

	@Override
	public EObject getElement() {
		return gcm_study;
	}

	/////////////////////////////////////
	// CFRA FACTORY
	/////////////////////////////////////
	private final static CfraFactory CFRA_FACTORY = CfraFactory.eINSTANCE;

	protected Cfra createCfra(Study study, String name, String qualifiedName, String craUid) {
		Cfra cfra = CFRA_FACTORY.createCfra();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		study.getCfras().add(cfra);

		cfra.setName(name);
		if (craUid != null)
			cfra.setCra(craUid);
		cfra.setQualifiedName(qualifiedName);

		return cfra;
	}

	protected fr.cea.nacre.model.NACREMM.cfra.Abstraction createAbstraction(Cfra cfra, String supplier, String client) {
		fr.cea.nacre.model.NACREMM.cfra.Abstraction abstraction = CFRA_FACTORY.createAbstraction();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		cfra.getAbstractions().add(abstraction);

		abstraction.setFunction(supplier);
		abstraction.setResource(client);

		return abstraction;
	}

}
