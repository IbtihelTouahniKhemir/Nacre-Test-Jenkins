package fr.cea.nacre.ui.plus.queries;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.AbstractionRegistry;
import fr.cea.nacre.model.NACREModelHelper;
import fr.cea.nacre.model.NACREMM.cfa.Battery;
import nacre.CFRA;
import nacre.Connect;
import nacre.Generator;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.Zone;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.uml.tools.providers.DelegatingItemLabelProvider;

public class GetLabelQuery implements IJavaQuery2<NamedElement, String> {


	private static final IItemLabelProvider labelProvider = new DelegatingItemLabelProvider();
	public String evaluate(final NamedElement context, 	final IParameterValueList2 parameterValues,	final IFacetManager facetManager)
			throws DerivedTypedElementException {


		ParameterValue parameterValue = parameterValues.getParameterValueByName("eObject"); //$NON-NLS-1$
		if (parameterValue.getValue() instanceof EStructuralFeature) {
			return ((EStructuralFeature) parameterValue.getValue()).getName();
		}
		String owner="";
		String zonedisplay=" ";
		String CRDisplay=" ";
		// Delegate to UML2 Edit providers to get localized and inferred names where applicable
		if(UMLUtil.getStereotypeApplication(context, SwSchedulableResource.class) != null) {
			ArrayList<org.eclipse.uml2.uml.Abstraction> collect=AbstractionRegistry.getInstance().outgoingAbstraction.get(context);
			if( collect!=null) {
				for (Iterator iterator = collect.iterator(); iterator.hasNext();) {
					Abstraction abstraction = (Abstraction) iterator.next();
					if(UMLUtil.getStereotypeApplication(abstraction.getOwner(), CFRA.class) != null) {
						owner= " ("+((NamedElement)abstraction.getOwner()).getLabel()+")";
					}
				}
			}
		}

		if(UMLUtil.getStereotypeApplication(context, Connect.class) != null) {
			NACREModelHelper helper=new NACREModelHelper();
			MainGrid mainGrid=helper.getMainGrid(context);
			Abstraction connectLink=(Abstraction)context;
			Element CR=connectLink.getSources().get(0);
			CRDisplay= " from "+((NamedElement)CR).getLabel();

			ArrayList<org.eclipse.uml2.uml.Abstraction> collect=AbstractionRegistry.getInstance().incomingAbstraction.get(CR);
			if(collect!=null) {
				for (Iterator iterator = collect.iterator(); iterator.hasNext();) {
					Abstraction abstraction = (Abstraction) iterator.next();
					Element SWSCH=abstraction.getSources().get(0);

					for (Zone zone : mainGrid.getZone()) {
						ArrayList<Element> swSchedulableResourceList= new ArrayList();
						helper.getSRFromZone(zone.getBase_Class(), swSchedulableResourceList, RTE_Installation.class);
						helper.getSRFromZone(zone.getBase_Class(), swSchedulableResourceList, Generator.class);
						helper.getSRFromZone(zone.getBase_Class(), swSchedulableResourceList, nacre.Battery.class);
						helper.getSRFromZone(zone.getBase_Class(), swSchedulableResourceList, nacre.Load.class);
						if( swSchedulableResourceList.contains(SWSCH)) {
							if(!zonedisplay.contains(zone.getBase_Class().getName())) {
								zonedisplay=zonedisplay+" ("+zone.getBase_Class().getName()+")";	
							}
						}
					}
					return context.getName()+CRDisplay+ zonedisplay;

				}
			}
		}
		return labelProvider.getText(context)+owner+CRDisplay+ zonedisplay;

	}
}
