
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Line;
import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;


/**
 * the main shall contain only substation or zone
 */
public class Rule002_MainGrid extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			MainGrid maingrid=UMLUtil.getStereotypeApplication(clazz, MainGrid.class); 
			if(maingrid!= null) {
				
				//look for nested class
				for (Classifier nestedClassifier : clazz.getNestedClassifiers()) {
					Zone zone=UMLUtil.getStereotypeApplication(nestedClassifier, Zone.class);
					Substation substation=UMLUtil.getStereotypeApplication(nestedClassifier, Substation.class);
					Line line=UMLUtil.getStereotypeApplication(nestedClassifier, Line.class);
					if( zone==null && substation==null && line==null) {
						return context.createFailureStatus(clazz.getName() +" shall contain only Zone, substation and Lines");
					}
					
				} 
				
			}
			
		}
		return context.createSuccessStatus();
	}
	
}