
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
 * A substation shall be referenced by the main grid or by the zone
 */
public class Rule007_Substation extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Substation substation=UMLUtil.getStereotypeApplication(clazz, Substation.class); 
			if(substation!= null) {
				Element owner=clazz.getOwner();
				MainGrid maingrid=UMLUtil.getStereotypeApplication(clazz, MainGrid.class);
				Zone zone=UMLUtil.getStereotypeApplication(clazz, Zone.class);

				if( maingrid!=null) {
					if( !maingrid.getSubstation().contains(substation))
					return context.createFailureStatus("A substation shall be reference by the main grid ");
				}
				if( zone!=null) {
					if( !zone.getSubstation().contains(substation))
					return context.createFailureStatus("A substation shall be reference by the zone");
				}
			}
		}
		return context.createSuccessStatus();
	}

}