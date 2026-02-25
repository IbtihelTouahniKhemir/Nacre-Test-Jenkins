
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Load;
import nacre.Battery;
import nacre.Bus;
import nacre.Generator;
import nacre.RTE_Installation;
import nacre.Substation;


/**
 * A bus shall contain only batteries or generators or RTE_Installations.
 */
public class Rule013_Bus extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Bus bus=UMLUtil.getStereotypeApplication(clazz, Bus.class); 
			if(bus!= null) {
				for (EObject object : clazz.eContents()) {
					if (object instanceof Port) {
						Battery battery=UMLUtil.getStereotypeApplication((Port)object, Battery.class);
						Generator generator=UMLUtil.getStereotypeApplication((Port)object, Generator.class);
						RTE_Installation rTE_Installation=UMLUtil.getStereotypeApplication((Port)object, RTE_Installation.class);
						Load load=UMLUtil.getStereotypeApplication((Port)object, Load.class);
						if(battery==null && generator==null && rTE_Installation==null && load==null) {
							return context.createFailureStatus("A bus shall contain only batteries or generators or RTE_Installations.");
						}
					}
					else{
						return context.createFailureStatus("A bus shall contain only batteries or generators or RTE_Installations.");
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}