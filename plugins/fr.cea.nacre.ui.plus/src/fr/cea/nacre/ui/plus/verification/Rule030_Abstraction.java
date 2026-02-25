
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;

import fr.cea.nacre.model.NACREMM.cfra.Abstraction;
import nacre.CentralController;
import nacre.Connect;
import nacre.Control;
import nacre.Link;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.RedundancyCluster;
import nacre.Substation;
import nacre.ZonalController;
import nacre.Zone;


/**
 * an abstraction can exist only between CentralControler and SwSchedulableResource, between SwSchedulableResource and ComputingReseource <<allocate>>, ComputingResource and CommunicationMedia <<Connect>>, between  CommunicationMedia <<Link>>
 */
public class Rule030_Abstraction extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		org.eclipse.uml2.uml.Abstraction abstraction = (org.eclipse.uml2.uml.Abstraction)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Element source=abstraction.getSources().get(0);
			Element target=abstraction.getTargets().get(0);
			
			//between MainGrid and CentralController
			if((UMLUtil.getStereotypeApplication(source, CentralController.class)!=null)&& (UMLUtil.getStereotypeApplication(target, MainGrid.class)!=null)){
				if( (UMLUtil.getStereotypeApplication(abstraction, Control.class)!=null)){
					return context.createSuccessStatus();
				}
			}
			//between zone and ZonalController
			if((UMLUtil.getStereotypeApplication(source, ZonalController.class)!=null)&& (UMLUtil.getStereotypeApplication(target, Zone.class)!=null)){
				if( (UMLUtil.getStereotypeApplication(abstraction, Control.class)!=null)){
					return context.createSuccessStatus();
				}
			}
			//between substation and computingResource
			if((UMLUtil.getStereotypeApplication(source, ComputingResource.class)!=null)&& (UMLUtil.getStereotypeApplication(target, Substation.class)!=null)){
					return context.createSuccessStatus();
			}
			// abstraction between Controller and RedundancyCluster
			if((UMLUtil.getStereotypeApplication(source, RedundancyCluster.class)!=null)&& (UMLUtil.getStereotypeApplication(target, ZonalController.class)!=null)){
				return context.createSuccessStatus();
			}
			
			
			// abstraction between Controller and SwResource
			if((UMLUtil.getStereotypeApplication(source, SwSchedulableResource.class)!=null)&& (UMLUtil.getStereotypeApplication(target, CentralController.class)!=null)){
				return context.createSuccessStatus();
			}
		
			if((UMLUtil.getStereotypeApplication(source, SwSchedulableResource.class)!=null)&& (UMLUtil.getStereotypeApplication(target, ZonalController.class)!=null)){
				return context.createSuccessStatus();
			}
			if((UMLUtil.getStereotypeApplication(source, SwSchedulableResource.class)!=null)&& (UMLUtil.getStereotypeApplication(target, LocalController.class)!=null)){
				return context.createSuccessStatus();
			}
			// abstraction between SwResource and ComputingReseource <<allocate>>
			if((UMLUtil.getStereotypeApplication(source, SwSchedulableResource.class)!=null)&& (UMLUtil.getStereotypeApplication(target, ComputingResource.class)!=null)){
				if( (UMLUtil.getStereotypeApplication(abstraction, Allocate.class)!=null)){
					return context.createSuccessStatus();
				}
			}
			// abstraction between ComputingReseource and CommunicationMedia <<Connect>>
			if((UMLUtil.getStereotypeApplication(source, ComputingResource.class)!=null)&& (UMLUtil.getStereotypeApplication(target, CommunicationMedia.class)!=null)){
				if( (UMLUtil.getStereotypeApplication(abstraction, Connect.class)!=null)){
					return context.createSuccessStatus();
				}
			}
			// abstraction between  CommunicationMedia <<Link>>
			if((UMLUtil.getStereotypeApplication(source, CommunicationMedia.class)!=null)&& (UMLUtil.getStereotypeApplication(target, CommunicationMedia.class)!=null)){
				if( (UMLUtil.getStereotypeApplication(abstraction, Link.class)!=null)){
					return context.createSuccessStatus();
				}
			}

		}
		return context.createFailureStatus("an abstraction shall be...");
	}

}