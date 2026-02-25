
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Battery;
import nacre.Bus;
import nacre.Generator;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.Substation;
import nacre.Zone;


/**
 * An Equipment shall be contained by the Bus.
 */
public class Rule015_Equipement extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Element port = (Element)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Battery battery=UMLUtil.getStereotypeApplication((Element)port, Battery.class);
			if(battery!= null) {
				Element owner=port.getOwner();
				Bus bus=UMLUtil.getStereotypeApplication(owner, Bus.class);

				if( bus==null) {
					return context.createFailureStatus("A battery shall be contained by the bus");
				}
			}
			Generator generator=UMLUtil.getStereotypeApplication((Element)port, Generator.class);
			if(generator!= null) {
				Element owner=port.getOwner();
				Bus bus=UMLUtil.getStereotypeApplication(owner, Bus.class);

				if( bus==null) {
					return context.createFailureStatus("A generator shall be contained by the bus");
				}
			}
			RTE_Installation rTE_Installation=UMLUtil.getStereotypeApplication((Element)port, RTE_Installation.class);
			if(rTE_Installation!= null) {
				Element owner=port.getOwner();
				Bus bus=UMLUtil.getStereotypeApplication(owner, Bus.class);
				if( bus==null) {
					return context.createFailureStatus("A rTE_Installation shall be contained by the bus");
				}
			}
			
		}
		return context.createSuccessStatus();
	}

}