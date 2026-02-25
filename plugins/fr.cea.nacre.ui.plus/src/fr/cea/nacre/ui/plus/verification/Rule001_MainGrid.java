
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
 * The main grid shall contain at least a zone or a substation 
 */
public class Rule001_MainGrid extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			MainGrid maingrid=UMLUtil.getStereotypeApplication(clazz, MainGrid.class); 
			if(maingrid!= null) {
				// if no nested class error
				if(clazz.getNestedClassifiers().size()==0){
				  return context.createFailureStatus(clazz.getName() +" shall contains Zone or substation.");
				  //Create warning
				}
				if(maingrid.getSubstation().size()==0 && maingrid.getZone().size()==0) {
					return context.createFailureStatus(clazz.getName() +" shall reference Zone or substation.");
					 //Create warning
					
					
				}
				
			}
			
		}
		return context.createSuccessStatus();
	}
	
}