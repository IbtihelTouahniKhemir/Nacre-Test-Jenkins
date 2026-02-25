
package fr.cea.nacre.ui.plus.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Req02:Papyrus Req  shall provides a means to display upward traceability in the model explorer
 *
 */
public class UpwardClassesQuery implements IJavaQuery2<NamedElement,  Collection<EObject>> {



	public Collection<EObject>  evaluate(final NamedElement context, 
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
					throws DerivedTypedElementException {


		ArrayList<EObject> result= new ArrayList<EObject>();
		ResourceSet resourceSet=context.eResource().getResourceSet();
		for(int i=0; i< resourceSet.getResources().size();i++) {
			Resource resource = (Resource) resourceSet.getResources().get(i);
			if( resource instanceof UMLResource) {

				for (Iterator<EObject> iteratorObject = resource.getAllContents(); iteratorObject.hasNext();) {
					EObject ownedElement = (EObject) iteratorObject.next();
					if(ownedElement instanceof DirectedRelationship) {
						if( ownedElement instanceof  Abstraction) {
							if(((DirectedRelationship)ownedElement).getSources().contains(context)) {
								result.addAll(((DirectedRelationship)ownedElement).getTargets());
							}
						}
					}
				}
			}
		}
		return result;

	}

	/**
	 * @param elem
	 *            UML model element
	 * @return the highest level Package of the element
	 */
	public static Package getToPackage(Element elememt) {
		Package tmp = elememt.getNearestPackage();
		while (tmp.getOwner() != null && (tmp.getOwner() instanceof Package)) {
			tmp = (Package) tmp.getOwner();
		}
		return tmp;
	}
}
