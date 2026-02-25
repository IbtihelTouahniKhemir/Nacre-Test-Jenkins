
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import nacre.CentralController;
import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;


/**
 * the central controller shall be referenced by the mainGrid
 */
public class Rule017_CentralController extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			CentralController centralController=UMLUtil.getStereotypeApplication(clazz, CentralController.class); 
			if(centralController!= null) {
				// look for main grid
				NACREModelHelper helper = new NACREModelHelper();
				org.eclipse.uml2.uml.Package CFA=helper.getCFA(clazz.getModel());
				if(CFA.getPackagedElements().size()>0) {
					for (PackageableElement current : CFA.getPackagedElements()) {
						MainGrid mainGrid=UMLUtil.getStereotypeApplication(current, MainGrid.class); 
						if( mainGrid!=null) {
							if(!centralController.equals(mainGrid.getCentralcontroler())) {
								return context.createFailureStatus("the central controller shall be referenced by the mainGrid");
							}
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}
	
}