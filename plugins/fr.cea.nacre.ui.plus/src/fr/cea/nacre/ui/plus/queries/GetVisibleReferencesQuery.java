package fr.cea.nacre.ui.plus.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.uml.modelexplorer.queries.GetVisibleUMLReferencesQuery;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.MainGrid;

public class GetVisibleReferencesQuery extends GetVisibleUMLReferencesQuery{
	/**
	 * @see org.eclipse.papyrus.views.modelexplorer.queries.GetVisibleReferencesQuery#evaluate(org.eclipse.emf.ecore.EObject, org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2, org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager)
	 *
	 * @param source
	 * @param parameterValues
	 * @param facetManager
	 * @return
	 * @throws DerivedTypedElementException
	 */
	@Override
	public List<EReference> evaluate(EObject source, IParameterValueList2 parameterValues, IFacetManager facetManager) throws DerivedTypedElementException {
		List<EReference> result = new ArrayList<EReference>(super.evaluate(source, parameterValues, facetManager));
		if(source instanceof Element) {
			if( UMLUtil.getStereotypeApplication((Element)source, MainGrid.class)!=null ) {
				result.remove(UMLPackage.eINSTANCE.getClass_NestedClassifier());
			}
		}
		return result;
	}


}
