
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;


/**
 * "the maingrid shall reference a central controller"
 */
public class Rule016_MainGrid extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			MainGrid maingrid=UMLUtil.getStereotypeApplication(clazz, MainGrid.class); 
			if(maingrid!= null) {
				// if no nested class error
				if(maingrid.getCentralcontroler()==null) {
					return context.createFailureStatus("the maingrid shall reference a central controller");
				}
				
			}
			
		}
		return context.createSuccessStatus();
	}
	
}