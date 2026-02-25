
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
 * An Equipment shall refernce a local Controller
 */
public class Rule026_Equipement extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Element port = (Element)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Battery battery=UMLUtil.getStereotypeApplication((Element)port, Battery.class);
			if(battery!= null) {

				if( battery.getLocalcontroller()==null) {
					return context.createFailureStatus("A battery shall reference a local Controller");
				}
			}
			Generator generator=UMLUtil.getStereotypeApplication((Element)port, Generator.class);
			if(generator!= null) {
				if( generator.getLocalcontroller()==null) {
					return context.createFailureStatus("A generator shall reference a local Controller");
				}
			}
			RTE_Installation rTE_Installation=UMLUtil.getStereotypeApplication((Element)port, RTE_Installation.class);
			if(rTE_Installation!= null) {
				if( rTE_Installation.getLocalcontroller()==null) {
					return context.createFailureStatus("A rte installation shall reference a local Controller");
				}
			}
			
		}
		return context.createSuccessStatus();
	}

}