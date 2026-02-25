
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;


/**
 * A zone shall contain at least one substation.
 */
public class Rule006_Zone extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Zone zone=UMLUtil.getStereotypeApplication(clazz, Zone.class); 
			if(zone!= null) {
				Element owner=clazz.getOwner();
				if( zone.getSubstation().size()==0) {
					return context.createFailureStatus("A zone shall contain at least one substation.");}
				}
		}
		return context.createSuccessStatus();
	}
	
}