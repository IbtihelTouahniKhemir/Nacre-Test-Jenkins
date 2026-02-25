
package fr.cea.nacre.ui.plus.verification;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import nacre.Bus;
import nacre.CentralController;
import nacre.Equipement;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.Substation;
import nacre.ZonalController;
import nacre.Zone;


/**
 * the local controller shall be referenced by an Equipment
 */
public class Rule027_LocalController extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			LocalController localController=UMLUtil.getStereotypeApplication(clazz, LocalController.class); 
			if(localController!= null) {
				// look for main grid
				NACREModelHelper helper = new NACREModelHelper();
				org.eclipse.uml2.uml.Package CFA=helper.getCFA(clazz.getModel());
				if(CFA.getPackagedElements().size()>0) {
					for (PackageableElement current : CFA.getPackagedElements()) {
						MainGrid mainGrid=UMLUtil.getStereotypeApplication(current, MainGrid.class); 
						if( mainGrid!=null) {
							for (Iterator iterator = mainGrid.getZone().iterator(); iterator.hasNext();) {
								Zone azone = (Zone) iterator.next();
								for (Iterator iteratorSubstation = azone.getSubstation().iterator(); iteratorSubstation.hasNext();) {
									Substation currentSubstation = (Substation) iteratorSubstation.next();
									for (Iterator iteratorBus = currentSubstation.getBus().iterator(); iteratorBus.hasNext();) {
										Bus currentBus = (Bus) iteratorBus.next();
										for (Iterator iteratorEquipement = currentBus.getEquipement().iterator(); iteratorEquipement.hasNext();) {
											Equipement currentEquipment = (Equipement) iteratorEquipement.next();
											if(localController.equals(currentEquipment.getLocalcontroller())){
												return context.createSuccessStatus();
											}
											
										}
										
									}
								}
							}
						}
						return context.createFailureStatus("At least One equipment shall reference a local Controler");
					}
				}
				return context.createSuccessStatus();
				
			}
		}
		return context.createSuccessStatus();
	}
	
}