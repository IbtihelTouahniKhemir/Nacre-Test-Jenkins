
package fr.cea.nacre.ui.plus.verification;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * The Activation period should be set for each software Resource
 */
public class Rule31_SoftwareResourcePeriodSet extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class) context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if (eType == EMFEventType.NULL) {
			SwSchedulableResource swR = UMLUtil.getStereotypeApplication(clazz, SwSchedulableResource.class);
			if (swR != null) {
				if (swR.getType() == null) {
					return context
							.createFailureStatus("The Activation period should be set for each software Resource");
				}
			}
		}
		return context.createSuccessStatus();
	}

}
