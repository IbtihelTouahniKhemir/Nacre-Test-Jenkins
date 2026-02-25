
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Zone;


/**
 *the zone shall be reference a Zonal controler
 */
public class Rule023_Zone extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Zone zone=UMLUtil.getStereotypeApplication(clazz, Zone.class); 
			if(zone!=null && zone.getZonalcontroller()== null) {
				return context.createFailureStatus("the zone shall reference a Zonal Controller");
			}
		}
		return context.createSuccessStatus();
	}

}