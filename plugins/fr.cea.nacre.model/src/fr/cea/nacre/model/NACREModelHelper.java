package fr.cea.nacre.model;

import static fr.cea.nacre.model.GcmConstants.Element.CFA;
import static fr.cea.nacre.model.GcmConstants.Element.CFRA;
import static fr.cea.nacre.model.GcmConstants.Element.CFRAS;
import static fr.cea.nacre.model.GcmConstants.Element.COMMUNICATION_MEDIAS;
import static fr.cea.nacre.model.GcmConstants.Element.COMPUTING_RESSOURCES;
import static fr.cea.nacre.model.GcmConstants.Element.CONTROLLERS;
import static fr.cea.nacre.model.GcmConstants.Element.CRA;
import static fr.cea.nacre.model.GcmConstants.Element.CRAS;
import static fr.cea.nacre.model.GcmConstants.Element.SOFTWARE_RESSOURCES;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.cfa.Load;
import nacre.Battery;
import nacre.Bus;
import nacre.CFA;
import nacre.CFRA;
import nacre.CFRAS;
import nacre.CRA;
import nacre.CRAS;
import nacre.CentralController;
import nacre.CommunicationMedias;
import nacre.ComputingResources;
import nacre.Connect;
import nacre.Controllers;
import nacre.Equipement;
import nacre.Generator;
import nacre.INACREStereotype;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.SoftwareResources;
import nacre.Substation;
import nacre.ZonalController;
import nacre.Zone;

public class NACREModelHelper {

	/**
	 * get or create a CFA package
	 * 
	 * @param root the model never null
	 * @return the CFA package
	 */
	public org.eclipse.uml2.uml.Package getorCreateCFA(Model root) {
		org.eclipse.uml2.uml.Package UML_CFAPackage = getCFA(root);
		if (UML_CFAPackage == null) {
			Element UMLElement = root.getPackagedElement(CFA.label());
			if (UMLElement == null) {
				UMLElement = root.createNestedPackage(CFA.label());
			}
			Stereotype CFAStereotype = UMLElement.getApplicableStereotype(INACREStereotype.CFA_STEREOTYPE);
			UMLElement.applyStereotype(CFAStereotype);
		}

		return getCFA(root);
	}

	/**
	 * return the main grid from an element in the model
	 * @param element
	 * @return the main grid from an element in the model
	 */
	public MainGrid getMainGrid(Element element) {
		org.eclipse.uml2.uml.Package CFA=this.getCFA(element.getModel());
		if(CFA.getPackagedElements().size()>0) {
			for (PackageableElement current : CFA.getPackagedElements()) {
				MainGrid mainGrid=UMLUtil.getStereotypeApplication(current, MainGrid.class); 
				if( mainGrid!=null) {
					return mainGrid;
				}
			}
		}
		return null;
	}
	/**
	 * get or create a CRA package
	 * 
	 * @param root the model never null
	 * @return the CRA package
	 */
	public ArrayList<org.eclipse.uml2.uml.Package> getorCreateCRA(Model root) {
		org.eclipse.uml2.uml.Package UML_CRASPackage = getCRAS(root);
		ArrayList<Package> CRA_packages = this.getCRA(UML_CRASPackage);
		if (CRA_packages.size() == 0) {
			for (Iterator<PackageableElement> iterator = UML_CRASPackage.getPackagedElements().iterator(); iterator
					.hasNext();) {
				PackageableElement pelement = iterator.next();
				if (pelement.getName().startsWith(CRA.label())) {
					Stereotype CRAtereotype = pelement.getApplicableStereotype(INACREStereotype.CRA_STEREOTYPE);
					pelement.applyStereotype(CRAtereotype);
				}
			}
		}
		CRA_packages = this.getCRA(UML_CRASPackage);
		if (CRA_packages.size() == 0) {
			Package UMLElement = root.createNestedPackage(CRA.label() + "1");
			Stereotype CRAtereotype = UMLElement.getApplicableStereotype(INACREStereotype.CRA_STEREOTYPE);
			UMLElement.applyStereotype(CRAtereotype);
		}
		CRA_packages = this.getCRA(UML_CRASPackage);
		return CRA_packages;
	}

	/**
	 * get or create a CFRA package
	 * 
	 * @param root the model never null
	 * @return the CFRA package
	 */
	public ArrayList<org.eclipse.uml2.uml.Package> getorCreateCFRA(Model root) {
		org.eclipse.uml2.uml.Package UML_CFRASPackage = getCFRAS(root);
		ArrayList<Package> CFRA_packages = this.getCFRA(UML_CFRASPackage);
		if (CFRA_packages.size() == 0) {
			for (Iterator<PackageableElement> iterator = UML_CFRASPackage.getPackagedElements().iterator(); iterator
					.hasNext();) {
				PackageableElement pelement = iterator.next();
				if (pelement.getName().startsWith(CFRA.label())) {
					Stereotype CRAtereotype = pelement.getApplicableStereotype(INACREStereotype.CFRA_STEREOTYPE);
					pelement.applyStereotype(CRAtereotype);
				}
			}
		}
		CFRA_packages = this.getCFRA(UML_CFRASPackage);
		if (CFRA_packages.size() == 0) {
			Package UMLElement = root.createNestedPackage(CFRA.label() + "1");
			Stereotype CRAtereotype = UMLElement.getApplicableStereotype(INACREStereotype.CFRA_STEREOTYPE);
			UMLElement.applyStereotype(CRAtereotype);
		}
		CFRA_packages = this.getCFRA(UML_CFRASPackage);
		return CFRA_packages;
	}

	/**
	 * get or create a CRAS package
	 * 
	 * @param root the model never null
	 * @return the CRAS package
	 */
	public org.eclipse.uml2.uml.Package getorCreateCRAS(Model root) {
		org.eclipse.uml2.uml.Package UML_CRASPackage = getCRAS(root);
		if (UML_CRASPackage == null) {
			Element UMLElement = root.getPackagedElement(CRAS.label());
			if (UMLElement == null) {
				UMLElement = root.createNestedPackage(CRAS.label());
			}
			Stereotype CRAStereotype = UMLElement.getApplicableStereotype(INACREStereotype.CRAS_STEREOTYPE);
			UMLElement.applyStereotype(CRAStereotype);
		}

		return getCRAS(root);
	}

	/**
	 * get or create a CommunicationMedias
	 * 
	 * @param root the model never null
	 * @return the CommunicationMedias package
	 */
	public org.eclipse.uml2.uml.Package getorCreateCommunicationMedias(Package CRA) {
		org.eclipse.uml2.uml.Package UML_CRAPackage = getCommunicationMedias(CRA);
		if (UML_CRAPackage == null) {
			Element UMLElement = CRA.getPackagedElement(COMMUNICATION_MEDIAS.label());
			if (UMLElement == null) {
				UMLElement = CRA.createNestedPackage(COMMUNICATION_MEDIAS.label());
			}
			Stereotype ComminicationMediaStereotype = UMLElement
					.getApplicableStereotype(INACREStereotype.COMMUNICATIONMEDIAS_STEREOTYPE);
			UMLElement.applyStereotype(ComminicationMediaStereotype);
		}

		return getCommunicationMedias(CRA);
	}

	/**
	 * get or create a eComputingResources
	 * 
	 * @param root the model never null
	 * @return the ComputingResources package
	 */
	public org.eclipse.uml2.uml.Package getorCreateComputingResources(Package CRA) {
		org.eclipse.uml2.uml.Package UML_CRAPackage = getComputingResources(CRA);
		if (UML_CRAPackage == null) {
			Element UMLElement = CRA.getPackagedElement(COMPUTING_RESSOURCES.label());
			if (UMLElement == null) {
				UMLElement = CRA.createNestedPackage(COMPUTING_RESSOURCES.label());
			}
			Stereotype ComminicationMediaStereotype = UMLElement
					.getApplicableStereotype(INACREStereotype.COMPUTINGRESOURCES_STEREOTYPE);
			UMLElement.applyStereotype(ComminicationMediaStereotype);
		}

		return getComputingResources(CRA);
	}

	/**
	 * get or create a SoftwareResources
	 * 
	 * @param root the model never null
	 * @return the SoftwareResources package
	 */
	public org.eclipse.uml2.uml.Package getorCreateSoftwareResources(Package CRA) {
		org.eclipse.uml2.uml.Package UML_CRAPackage = getSoftwareResources(CRA);
		if (UML_CRAPackage == null) {
			Element UMLElement = CRA.getPackagedElement(SOFTWARE_RESSOURCES.label());
			if (UMLElement == null) {
				UMLElement = CRA.createNestedPackage(SOFTWARE_RESSOURCES.label());
			}
			Stereotype ComminicationMediaStereotype = UMLElement
					.getApplicableStereotype(INACREStereotype.SOFTWARERESOURCES_STEREOTYPE);
			UMLElement.applyStereotype(ComminicationMediaStereotype);
		}

		return getSoftwareResources(CRA);
	}

	/**
	 * get or create a CRAS package
	 * 
	 * @param root the model never null
	 * @return the CFAS package
	 */
	public org.eclipse.uml2.uml.Package getorCreateCFRAS(Model root) {
		org.eclipse.uml2.uml.Package UML_CFRASPackage = getCFRAS(root);
		if (UML_CFRASPackage == null) {
			Element UMLElement = root.getPackagedElement(CFRAS.label());
			if (UMLElement == null) {
				UMLElement = root.createNestedPackage(CFRAS.label());
			}
			Stereotype CFRAStereotype = UMLElement.getApplicableStereotype(INACREStereotype.CFRAS_STEREOTYPE);
			UMLElement.applyStereotype(CFRAStereotype);
		}

		return getCRAS(root);
	}

	/**
	 * get or create a controller package inside the CFA package
	 * 
	 * @param UML_CFAPackage never null;
	 * @return the controllers package
	 */
	public org.eclipse.uml2.uml.Package getorCreateControllers(Package UML_CFAPackage) {
		org.eclipse.uml2.uml.Package UML_ControllersPackage = this.getControllers(UML_CFAPackage);
		if (UML_ControllersPackage == null) {
			Element UMLElement = UML_CFAPackage.getPackagedElement(CONTROLLERS.label());
			if (UMLElement == null) {
				UMLElement = UML_CFAPackage.createNestedPackage(CONTROLLERS.label());
			}
			Stereotype Controllerstereotype = UMLElement
					.getApplicableStereotype(INACREStereotype.CONTROLLERS_STEREOTYPE);
			UMLElement.applyStereotype(Controllerstereotype);
		}

		return getControllers(UML_CFAPackage);
	}

	/**
	 * get the CFA package
	 * 
	 * @param root the model, never null
	 * @return return the CFA package
	 */
	public org.eclipse.uml2.uml.Package getCFA(Model root) {
		for (PackageableElement UMLelement : root.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, CFA.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the CRAS package
	 * 
	 * @param root the model, never null
	 * @return the CRAS package
	 */

	public org.eclipse.uml2.uml.Package getCRAS(Model root) {
		for (PackageableElement UMLelement : root.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, CRAS.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the CFRA package from a a given CRA package, pay attention the owner
	 * shall be stereotyped CFRAS
	 * 
	 * @param root                     the model, never null
	 * @param stereotypeApplicationCRA
	 * @return the CFRA package
	 */
	public org.eclipse.uml2.uml.Package getCFRAFromCRA(Model root, CRA stereotypeApplicationCRA) {
		Package UML_CFRAS_Package = this.getCFRAS(root);
		if (UML_CFRAS_Package != null) {

			for (PackageableElement UMLelement : UML_CFRAS_Package.getPackagedElements()) {
				if (UMLelement instanceof Package) {
					if (UMLUtil.getStereotypeApplication(UMLelement, CFRA.class) != null) {
						CFRA appliedSterotypeCFRA = UMLUtil.getStereotypeApplication(UMLelement, CFRA.class);
						if (appliedSterotypeCFRA.getCra() != null
								&& appliedSterotypeCFRA.getCra().equals(stereotypeApplicationCRA)) {
							return (org.eclipse.uml2.uml.Package) UMLelement;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * get the CFRAS package container of CFRA
	 * 
	 * @param root the model, never null
	 * @return the CFRA package
	 */
	public org.eclipse.uml2.uml.Package getCFRAS(Model root) {
		for (PackageableElement UMLelement : root.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, CFRAS.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the controller package from a CFA package
	 * 
	 * @param UML_CFAPackage
	 * @return the controller package
	 */
	public org.eclipse.uml2.uml.Package getControllers(org.eclipse.uml2.uml.Package UML_CFAPackage) {
		for (PackageableElement UMLelement : UML_CFAPackage.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, Controllers.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the CommunicationMedias package from a CRA package
	 * 
	 * @param UML_CRAPackage
	 * @return the CommunicationMedias package
	 */
	public org.eclipse.uml2.uml.Package getCommunicationMedias(org.eclipse.uml2.uml.Package UML_CRAPackage) {
		for (PackageableElement UMLelement : UML_CRAPackage.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, CommunicationMedias.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the ComputingResources package from a CRA package
	 * 
	 * @param UML_CRAPackage
	 * @return the ComputingResources package
	 */
	public org.eclipse.uml2.uml.Package getComputingResources(org.eclipse.uml2.uml.Package UML_CRAPackage) {
		for (PackageableElement UMLelement : UML_CRAPackage.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, ComputingResources.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the ComputingResources package from a CRA package
	 * 
	 * @param UML_CRAPackage
	 * @return the ComputingResources package
	 */
	public org.eclipse.uml2.uml.Package getSoftwareResources(org.eclipse.uml2.uml.Package UML_CRAPackage) {
		for (PackageableElement UMLelement : UML_CRAPackage.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, SoftwareResources.class) != null) {
					return (org.eclipse.uml2.uml.Package) UMLelement;
				}
			}
		}
		return null;
	}

	/**
	 * get the list of CRA package from a CRAS package
	 * 
	 * @param UML_CRASPackage
	 * @return the list of CRA Package
	 */
	public ArrayList<org.eclipse.uml2.uml.Package> getCRA(org.eclipse.uml2.uml.Package UML_CRASPackage) {
		ArrayList<org.eclipse.uml2.uml.Package> CRA_packages = new ArrayList<Package>();
		for (PackageableElement UMLelement : UML_CRASPackage.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, CRA.class) != null) {
					CRA_packages.add((org.eclipse.uml2.uml.Package) UMLelement);
				}
			}
		}
		return CRA_packages;
	}

	/**
	 * get the list of CFRA package from a CFRAS package
	 * 
	 * @param UML_CFRASPackage
	 * @return the list of CFRA Package
	 */
	public ArrayList<org.eclipse.uml2.uml.Package> getCFRA(org.eclipse.uml2.uml.Package UML_CFRASPackage) {
		ArrayList<org.eclipse.uml2.uml.Package> CFRA_packages = new ArrayList<Package>();
		for (PackageableElement UMLelement : UML_CFRASPackage.getPackagedElements()) {
			if (UMLelement instanceof Package) {
				if (UMLUtil.getStereotypeApplication(UMLelement, CFRA.class) != null) {
					CFRA_packages.add((org.eclipse.uml2.uml.Package) UMLelement);
				}
			}
		}
		return CFRA_packages;
	}

	/**
	 * get all SWSchedulableResource From a Controller
	 * 
	 * @param context could be a class stereotyped XController
	 * @return a list of SWSchedulableResource, never null
	 */
	public ArrayList<Element> getSRFromController(Element context) {
		ArrayList<Element> result = new ArrayList<Element>();
		if (UMLUtil.getStereotypeApplication(context, LocalController.class) != null
				|| UMLUtil.getStereotypeApplication(context, CentralController.class) != null
				|| UMLUtil.getStereotypeApplication(context, ZonalController.class) != null) {
			ArrayList<Abstraction> collect = AbstractionRegistry.getInstance().incomingAbstraction.get(context);
			if (collect != null) {
				for (Iterator<Abstraction> iterator = collect.iterator(); iterator.hasNext();) {
					DirectedRelationship directedRelationship = iterator.next();
					result.addAll(directedRelationship.getSources());
				}
			}
		}
		return result;
	}

	/**
	 * get the controller associated to a RteInstallation
	 * 
	 * @param context could be a RteInstallation
	 * @return the associated controller or null
	 */
	public Class getControllerFromRteInstallation(Element context) {
		RTE_Installation rteInstallation = UMLUtil.getStereotypeApplication(context, RTE_Installation.class);
		if (rteInstallation != null) {
			if (rteInstallation.getLocalcontroller() != null) {
				return rteInstallation.getLocalcontroller().getBase_Class();
			}
		}
		return null;
	}

	/**
	 * get the controller associated to a RteInstallation
	 * 
	 * @param context could be a RteInstallation
	 * @return the associated controller or null
	 */
	public Class getControllerFromBatteryElement (Element context) {
		Battery battery = UMLUtil.getStereotypeApplication(context, Battery.class);
		if (battery != null) {
			if (battery.getLocalcontroller() != null) {
				return battery.getLocalcontroller().getBase_Class();
			}
		}
		return null;
	}
	/**
	 * get the controller associated to a RteInstallation
	 * 
	 * @param context could be a RteInstallation
	 * @return the associated controller or null
	 */
	public Class getControllerFromGenerator(Element context) {
		Generator generator = UMLUtil.getStereotypeApplication(context, Generator.class);
		if (generator != null) {
			if (generator.getLocalcontroller() != null) {
				return generator.getLocalcontroller().getBase_Class();
			}
		}
		return null;
	}
	/** IK 
	 * get the controller associated to a RteInstallation
	 * 
	 * @param context could be a RteInstallation
	 * @return the associated controller or null
	 */
	public Class getControllerFromLoadElement (Element context) {
		Load load = UMLUtil.getStereotypeApplication(context, Load.class);
		if (load != null) {
			if (((Equipement) load).getLocalcontroller()!= null) {
				return ((Equipement) load).getLocalcontroller().getBase_Class();
			}
		}
		return null;
	}
	/**
	 * return the list of SWSchedulableResource from substation
	 * 
	 * @param element could be a substation
	 * @param swSchedulableResourceList the content of the result
	 * @param stereotypeKind kind of element for wich welook for SR
	 */
	public void getSRFromSubstation(Element element, ArrayList<Element> swSchedulableResourceList,java.lang.Class stereotypeKind ) {
		Substation substation = UMLUtil.getStereotypeApplication(element, Substation.class);
		for (Bus bus : substation.getBus()) {
			getSRFromBus(bus.getBase_Class(), swSchedulableResourceList,stereotypeKind);
		}
	}

	/**
	 * return the list of SWSchedulableResource from Zone
	 * 
	 * @param element could be a Zone
	 * @param swSchedulableResourceList the content of the result
	 */
	public void getSRFromZone(Element element, ArrayList<Element> swSchedulableResourceList,java.lang.Class stereotypeKind) {
		Zone zone = UMLUtil.getStereotypeApplication(element, Zone.class);
		for (Substation substation : zone.getSubstation()) {
			getSRFromSubstation(substation.getBase_Class(), swSchedulableResourceList,stereotypeKind);
		}
	}

	/**
	 * return the list of SoftwareResources from a CRA
	 * 
	 * @param element shall be a CRA
	 * @param softResouList the content of the result
	 */
	public void getSRfromCRA(Element element, ArrayList<Element> softResouList) {
		CRA cra = UMLUtil.getStereotypeApplication(element, CRA.class);
		Package SRP = getorCreateSoftwareResources(cra.getBase_Package());
		for (Element sr : SRP.getPackagedElements()) {
			if (UMLUtil.getStereotypeApplication(sr, SwSchedulableResource.class) != null) {
				softResouList.add(sr);
			}

		}
	}

	/**
	 * return the list of CreateComputingResources from a CRA
	 * 
	 * @param element shall be a CRA
	 * @param commResouList the content of the result
	 */
	public void getCRfromCRA(Element element, ArrayList<Element> commResouList) {
		CRA cra = UMLUtil.getStereotypeApplication(element, CRA.class);
		Package CRP = getorCreateComputingResources(cra.getBase_Package());
		for (Element cm : CRP.getPackagedElements()) {
			if (UMLUtil.getStereotypeApplication(cm, ComputingResource.class) != null) {
				commResouList.add(cm);
			}

		}
	}

	/**
	 * return the list of CreateCommunicationMedias from a CRA
	 * 
	 * @param element shall be a CRA
	 * @param commMediasList the content of the result
	 */
	public void getCMfromCRA(Element element, ArrayList<Element> commMediasList) {
		CRA cra = UMLUtil.getStereotypeApplication(element, CRA.class);
		Package CRP = getorCreateCommunicationMedias(cra.getBase_Package());
		for (Element cm : CRP.getPackagedElements()) {
			if (UMLUtil.getStereotypeApplication(cm, CommunicationMedia.class) != null) {
				commMediasList.add(cm);
			}
		}

	}


	/**
	 * return the list of SWSchedulableResource from the MainGrid
	 * 
	 * @param element could be a MainGrid
	 * @param swSchedulableResourceList the content of the result
	 * @param stereotypeKind kind of element for wich welook for SR
	 */
	public void getSRFromMainGrid(Element element, ArrayList<Element> swSchedulableResourceList,java.lang.Class stereotypeKind) {
		MainGrid maingrid = UMLUtil.getStereotypeApplication(element, MainGrid.class);
		for (Zone zone : maingrid.getZone()) {
			getSRFromZone(zone.getBase_Class(), swSchedulableResourceList,stereotypeKind);
		}
		for (Substation substation : maingrid.getSubstation()) {
			getSRFromSubstation(substation.getBase_Class(), swSchedulableResourceList,stereotypeKind);
		}
	}

	/**
	 * return the list of SWSchedulableResource from the Bus
	 * 
	 * @param element could be a bus
	 * @param swSchedulableResourceList the content of the result
	 * @param stereotypeKind kind of element for wich welook for SR
	 * 
	 */
	public void getSRFromBus(Element element, ArrayList<Element> swSchedulableResourceList, java.lang.Class stereotypeKind ) {
		for (Port port : ((Class) element).getOwnedPorts()) {
			AbstractionRegistry.getInstance().incomingAbstraction.get(port);
			if (UMLUtil.getStereotypeApplication(port, stereotypeKind) != null) {
				if( stereotypeKind.equals(RTE_Installation.class)) {
					Class UMLController = this.getControllerFromRteInstallation(port);
					swSchedulableResourceList.addAll(this.getSRFromController(UMLController));
				}
				if( stereotypeKind.equals(Battery.class)) {
					Class UMLController = this.getControllerFromBatteryElement(port);
					swSchedulableResourceList.addAll(this.getSRFromController(UMLController));
				}
				if( stereotypeKind.equals(Generator.class)) {
					Class UMLController = this.getControllerFromGenerator(port);
					swSchedulableResourceList.addAll(this.getSRFromController(UMLController));
				}
				if( stereotypeKind.equals(Load.class)) {
					Class UMLController = this.getControllerFromLoadElement(port);
					swSchedulableResourceList.addAll(this.getSRFromController(UMLController));
				}

			}
		}
	}


	/**
	 * get all SR associated to a Zonal controler from A zone
	 * @param element a zone the content of the result
	 * @param swSchedulableResourceList
	 */
	public void getSRZonalControlerFromZone (Element element, ArrayList<Element> swSchedulableResourceList) {
		Zone ZoneSterotypeApplication=(Zone)UMLUtil.getStereotypeApplication(element, Zone.class);
		if(ZoneSterotypeApplication!= null) {
			Class UMLController = ZoneSterotypeApplication.getZonalcontroller().getBase_Class();
			swSchedulableResourceList.addAll(this.getSRFromController(UMLController));
		}
	}
	/**
	 * return the list of SWSchedulableResource associated to a Zonal Controller from the MainGrid
	 * 
	 * @param element could be a MainGrid
	 * @param swSchedulableResourceList the content of the result
	 */
	public void getSRZonalControlerFromMainGrid(Element element, ArrayList<Element> swSchedulableResourceList) {
		MainGrid maingrid = UMLUtil.getStereotypeApplication(element, MainGrid.class);
		for (Zone zone : maingrid.getZone()) {
			getSRZonalControlerFromZone(zone.getBase_Class(), swSchedulableResourceList);
		}

	}
	/**
	 * return the list of SWSchedulableResource associated to a Central Controller from the MainGrid
	 * 
	 * @param element could be a MainGrid
	 * @param swSchedulableResourceList the content of the result
	 */
	public void getSRCentralControlerFromMainGrid(Element element, ArrayList<Element> swSchedulableResourceList) {
		MainGrid maingrid = UMLUtil.getStereotypeApplication(element, MainGrid.class);
		if(maingrid!= null) {
			Class UMLController = maingrid.getCentralcontroler().getBase_Class();
			swSchedulableResourceList.addAll(this.getSRFromController(UMLController));
		}

	}

	/**
	 * Test if the Computing resource is linked by a connect link to the CommunicationMedia
	 * @param communicationMedia
	 * @param computingResource
	 */
	public boolean isCRConnectedToCM(org.eclipse.uml2.uml.Class communicationMedia, PackageableElement computingResource) {
		if(UMLUtil.getStereotypeApplication(computingResource, ComputingResource.class)!=null){
			//We look for if the CR is already connected to CM
			//get all link that comes from the computingResource
			ArrayList<Abstraction> collect=AbstractionRegistry.getInstance().outgoingAbstraction.get(computingResource);
			if (collect!=null) {
				boolean isConnectedToCM=false;
				//inspect all links
				for (Iterator<Abstraction> iterator = collect.iterator(); iterator.hasNext();) {
					DirectedRelationship directedRelationship = iterator.next();
					//inspect all targets
					if( UMLUtil.getStereotypeApplication(directedRelationship, Connect.class)!=null) {
						for (Element CM : directedRelationship.getTargets()) {
							// is it connected to the communicationMEdia?
							if(CM.equals(communicationMedia)) {
								return true;
							}
						}
					}
				}
			}

		}
		return false;
	}

}
