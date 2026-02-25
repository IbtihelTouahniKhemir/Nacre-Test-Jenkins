
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Bus;
import nacre.Substation;


/**
 * A Bus shall be contained by the substation
 */
public class Rule012_Bus extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Bus bus=UMLUtil.getStereotypeApplication(clazz, Bus.class); 
			if(bus!= null) {
				Element owner=clazz.getOwner();
				Substation substation=UMLUtil.getStereotypeApplication(owner, Substation.class);

				if( substation==null) {
					return context.createFailureStatus("A Bus shall be contained by the substation");
				}
			}
		}
		return context.createSuccessStatus();
	}

}