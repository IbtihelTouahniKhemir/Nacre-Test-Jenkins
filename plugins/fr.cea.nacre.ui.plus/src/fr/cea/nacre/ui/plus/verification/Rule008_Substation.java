
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
 * A substation shall be contained by the main grid or a zone
 */
public class Rule008_Substation extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Substation substation=UMLUtil.getStereotypeApplication(clazz, Substation.class); 
			if(substation!= null) {
				Element owner=clazz.getOwner();
				MainGrid maingrid=UMLUtil.getStereotypeApplication(owner, MainGrid.class);
				Zone zone=UMLUtil.getStereotypeApplication(owner, Zone.class);

				if( zone== null && maingrid==null) {
					return context.createFailureStatus("A substation shall be contained by the main grid or by the zone");
				}
			}
		}
		return context.createSuccessStatus();
	}

}