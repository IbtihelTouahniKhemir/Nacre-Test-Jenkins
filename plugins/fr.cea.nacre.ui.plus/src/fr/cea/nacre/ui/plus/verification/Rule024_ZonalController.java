
package fr.cea.nacre.ui.plus.verification;

import java.util.Iterator;

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
import nacre.ZonalController;
import nacre.Zone;


/**
 * the Zonal controller shall be referenced by a Zone
 */
public class Rule024_ZonalController extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class)context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			ZonalController zonalController=UMLUtil.getStereotypeApplication(clazz, ZonalController.class); 
			if(zonalController!= null) {
				// look for main grid
				NACREModelHelper helper = new NACREModelHelper();
				org.eclipse.uml2.uml.Package CFA=helper.getCFA(clazz.getModel());
				if(CFA.getPackagedElements().size()>0) {
					for (PackageableElement current : CFA.getPackagedElements()) {
						MainGrid mainGrid=UMLUtil.getStereotypeApplication(current, MainGrid.class); 
						if( mainGrid!=null) {
							for (Iterator iterator = mainGrid.getZone().iterator(); iterator.hasNext();) {
								Zone azone = (Zone) iterator.next();
								if (zonalController.equals(azone.getZonalcontroller())){
									return context.createSuccessStatus();
								}
								
							}
						}
					}
				}
				return context.createFailureStatus("At least One zone shall reference a Zonal Controler");
			}
		}
		return context.createSuccessStatus();
	}
	
}