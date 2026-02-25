
package fr.cea.nacre.ui.plus.verification;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.AbstractionRegistry;
import fr.cea.nacre.model.NACREModelHelper;
import nacre.CentralController;
import nacre.LocalController;
import nacre.ZonalController;

/**
 * A controller shall have to be linked to a SWResource
 */
public class Rule029_LocalController_SWResource extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class) context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if (eType == EMFEventType.NULL) {
			if (UMLUtil.getStereotypeApplication(clazz, LocalController.class) != null
					|| UMLUtil.getStereotypeApplication(clazz, CentralController.class) != null
					|| UMLUtil.getStereotypeApplication(clazz, ZonalController.class) != null) {
				ArrayList<Abstraction> collect = AbstractionRegistry.getInstance().incomingAbstraction.get(context);
				if (collect == null) {
					context.createFailureStatus("A controller shall have to be linked to a SWResource");
				}

				if (collect != null) {

					if (collect.size() == 0) {
						context.createFailureStatus("A controller shall have to be linked to a SWResource");
					} else {

						for (Iterator<Abstraction> iterator = collect.iterator(); iterator.hasNext();) {
							DirectedRelationship directedRelationship = iterator.next();

							for (Iterator<Element> iteratorSource = directedRelationship.getSources()
									.iterator(); iteratorSource.hasNext();) {
								Element source = iteratorSource.next();
								if (UMLUtil.getStereotypeApplication(source, SwSchedulableResource.class) != null) {
									return context.createSuccessStatus();
								}
								else {
									context.createFailureStatus("A controller shall have to be linked to a SWResource");
								}
							}
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}