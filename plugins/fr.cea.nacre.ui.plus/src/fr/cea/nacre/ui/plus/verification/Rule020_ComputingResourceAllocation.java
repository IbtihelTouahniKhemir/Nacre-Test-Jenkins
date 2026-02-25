
package fr.cea.nacre.ui.plus.verification;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Chaque Computing Resource a au moins une Software Resource allouée
 */
public class Rule020_ComputingResourceAllocation extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {

		Class clazz = (Class)context.getTarget();
		
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if(eType == EMFEventType.NULL) {
			if(UMLUtil.getStereotypeApplication(clazz, ComputingResource.class) != null) {
				ArrayList<EObject> targets= getDownClass(clazz);
				for (EObject eObject : targets) {
					if(UMLUtil.getStereotypeApplication(((Element)eObject), SwSchedulableResource.class) != null) {
						return context.createSuccessStatus();
					}
				}
				return context.createFailureStatus(clazz.getName() +" is not allocated on software resource.");
			}

		}
		return context.createSuccessStatus();
	}
	protected ArrayList<EObject> getDownClass(EObject context){
		ArrayList<EObject> result= new ArrayList<EObject>();
		ResourceSet resourceSet=context.eResource().getResourceSet();
		for(int i=0; i< resourceSet.getResources().size();i++) {
			Resource resource = (Resource) resourceSet.getResources().get(i);
			if( resource instanceof UMLResource) {

				for (Iterator<EObject> iteratorObject = resource.getAllContents(); iteratorObject.hasNext();) {
					EObject ownedElement = (EObject) iteratorObject.next();
					if( ownedElement instanceof  Abstraction) {
						if(((DirectedRelationship)ownedElement).getTargets().contains(context)) {
							DirectedRelationship directedRelationship=(DirectedRelationship) ownedElement;
							result.addAll(directedRelationship.getSources());
						}
					}
				}
			}
		}
		return result;
	}
}
