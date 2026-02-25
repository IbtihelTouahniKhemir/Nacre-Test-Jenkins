
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
 * the owner of a zone shall be contained the main grid.
 */
public class Rule005_Zone extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			Zone zone=UMLUtil.getStereotypeApplication(clazz, Zone.class); 
			if(zone!= null) {
				Element owner=clazz.getOwner();
				MainGrid maingrid=UMLUtil.getStereotypeApplication(owner, MainGrid.class); 
				if( maingrid==null) {
					return context.createFailureStatus("the owner of a zone shall be the main grid");}
				}
		}
		return context.createSuccessStatus();
	}
	
}