package fr.cea.nacre.model.UMLtoMM;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Line;
import fr.cea.nacre.model.factory.GCMFactory2;
import hazards.CommunicationHazard;
import hazards.GeneratorHazard;
import hazards.LineHazard;
import nacre.CFA;
import nacre.CRA;
import nacre.CentralController;
import nacre.LocalController;
import nacre.RedundancyCluster;
import nacre.ZonalController;

public abstract class AbstractUMLtoNACRE implements IUMLtoNACRE {

	protected static final String SOFTWARE_RESOURCE   = "SoftwareResource";
	protected static final String COMPUTING_RESOURCE  = "ComputingResource";
	protected static final String COMMUNICATION_MEDIA = "CommunicationMedia";
	protected static final String CONTROLLER          = "Controller";
	protected static final String REDUNDANCY_CLUSTER  = "RedundancyCluster";
	protected static final String CRA          = "Cra";
	protected static final String CFA          = "Cfa";
	protected static final String LINE          = "Line";
	protected static final String LINE_HAZARD          = "LineHazard";
	protected static final String COMMUNICATION_HAZARD          = "CommunicationHazard";
	protected static final String GENERATOR_HAZARD          = "GeneratorHazard";
	

	private static String getControllerUID(NamedElement namedElement) {
		return GCMFactory2.getUID(CONTROLLER, namedElement.getQualifiedName());
	}

	private static String getCommunicationMediaUID(NamedElement namedElement) {
		return GCMFactory2.getUID(COMMUNICATION_MEDIA, namedElement.getQualifiedName());
	}

	private static String getComputingResourceUID(NamedElement namedElement) {
		return GCMFactory2.getUID(COMPUTING_RESOURCE, namedElement.getQualifiedName());
	}

	private static String getSoftwareResourceUID(NamedElement namedElement) {
		return GCMFactory2.getUID(SOFTWARE_RESOURCE, namedElement.getQualifiedName());
	}
	private static String getRedundancyUID(NamedElement namedElement) {
		return GCMFactory2.getUID(REDUNDANCY_CLUSTER, namedElement.getQualifiedName());
	}
	
	private static String getCraUID(NamedElement namedElement) {
		return GCMFactory2.getUID(CRA, namedElement.getQualifiedName());
	}
	
	private static String getCfaUID(NamedElement namedElement) {
		return GCMFactory2.getUID(CFA, namedElement.getQualifiedName());
	}
	
	private static String getLineUID(NamedElement namedElement) {
		return GCMFactory2.getUID(LINE, namedElement.getQualifiedName());
	}
	
	private static String getLineHazardUID(NamedElement namedElement) {
		return GCMFactory2.getUID(LINE_HAZARD, namedElement.getQualifiedName());
	}
	private static String getGeneratorHazardUID(NamedElement namedElement) {
		return GCMFactory2.getUID(GENERATOR_HAZARD, namedElement.getQualifiedName());
	}
	
	private static String getCommunicationHazardUID(NamedElement namedElement) {
		return GCMFactory2.getUID(COMMUNICATION_HAZARD, namedElement.getQualifiedName());
	}
	
	public static String getUIDFromElement(NamedElement namedElement) {
		if( UMLUtil.getStereotypeApplication(namedElement, ZonalController.class)!=null) {
			return getControllerUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, CentralController.class)!=null) {
			return getControllerUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, LocalController.class)!=null) {
			return getControllerUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, CommunicationMedia.class)!=null) {
			return getCommunicationMediaUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, ComputingResource.class)!=null) {
			return getComputingResourceUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, SwSchedulableResource.class)!=null) {
			return getSoftwareResourceUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, RedundancyCluster.class)!=null) {
			return getRedundancyUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, CRA.class)!=null) {
			return getCraUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, CFA.class)!=null) {
			return getCfaUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, Line.class)!=null) {
			return getLineUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, LineHazard.class)!=null) {
			return getLineHazardUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, CommunicationHazard.class)!=null) {
			return getCommunicationHazardUID(namedElement); 
		}
		if( UMLUtil.getStereotypeApplication(namedElement, GeneratorHazard.class)!=null) {
			return getGeneratorHazardUID(namedElement); 
		}
		return null;
	}
	
	

	public  abstract EObject construct() ;

	public abstract EObject getElement() ;

}
