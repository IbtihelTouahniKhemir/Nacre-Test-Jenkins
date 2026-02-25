
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
 * the main shall shall reference contained substation or contained zone.
 */
public class Rule003_MainGrid extends AbstractModelConstraint {

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

					if(zone!=null) {
						if(!maingrid.getZone().contains(zone)) {
							return context.createFailureStatus(clazz.getName() +" shall reference the Zone "+ nestedClassifier.getLabel()+ ".");
							//warning
						}
					}
					if(substation!=null) {
						if(!maingrid.getSubstation().contains(substation)) {
							return context.createFailureStatus(clazz.getName() +" shall reference the substation "+ nestedClassifier.getLabel()+ ".");
							//warning
						}
					}
				} 
				
			}
			
		}
		return context.createSuccessStatus();
	}
	
}