
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Bus;
import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;


/**
 * A SubStation shall contain only bus.
 */
public class Rule010_Substation extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Substation substation=UMLUtil.getStereotypeApplication(clazz, Substation.class); 
			if(substation!= null) {
				for (EObject object : clazz.eContents()) {
					if (object instanceof Class) {
						Bus bus=UMLUtil.getStereotypeApplication((Class)object, Bus.class);
						if(bus==null) {
							return context.createFailureStatus("SubStation shall contain only bus.");
						}
					}
					else{
						return context.createFailureStatus("SubStation shall contain only bus.");
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}