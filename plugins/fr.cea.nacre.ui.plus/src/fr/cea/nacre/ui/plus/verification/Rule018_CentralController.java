
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
 * the central controller shall be contained in the package controller inside CFA package
 */
public class Rule018_CentralController extends AbstractModelConstraint {

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
				org.eclipse.uml2.uml.Package ControlerPackage=helper.getControllers(CFA);


				if(ControlerPackage!=null) {
					if(!ControlerPackage.getPackagedElements().contains(clazz))
						return context.createFailureStatus("the central controller shall be contained in the package controller inside CFA package");
				}
			}
		}
		return context.createSuccessStatus();
	}

}