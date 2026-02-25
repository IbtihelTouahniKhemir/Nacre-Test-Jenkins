
package fr.cea.nacre.ui.plus.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
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
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.AbstractionRegistry;
import fr.cea.nacre.model.LineRegistry;
import nacre.Battery;
import nacre.CentralController;
import nacre.Connect;
import nacre.Generator;
import nacre.Line;
import nacre.Load;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.RedundancyCluster;
import nacre.ZonalController;
import nacre.Zone;

/**
 * Req03: Papyrus Req  shall provides a means to display downward traceability in the model explorer
 *
 */
public class NacreQuery implements IJavaQuery2<NamedElement,  Collection<EObject>> {
	public Collection<EObject>  evaluate(final NamedElement context, 
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
					throws DerivedTypedElementException {


		if(!(context.eResource()).equals(AbstractionRegistry.getInstance().getResource())) {
			AbstractionRegistry.getInstance().setResource(context.eResource());
			LineRegistry.getInstance().setResource(context.eResource());		
		}
		if(! context.eResource().eAdapters().contains(AbstractionRegistry.getInstance())) {
			AbstractionRegistry.getInstance().setResource(context.eResource());
			context.eResource().eAdapters().add(AbstractionRegistry.getInstance());
			AbstractionRegistry.getInstance().updateRegistry();

			LineRegistry.getInstance().setResource(context.eResource());
			context.eResource().eAdapters().add(LineRegistry.getInstance());
			LineRegistry.getInstance().updateRegistry();
		}
		if(AbstractionRegistry.getInstance().incomingAbstraction.isEmpty()) {
			AbstractionRegistry.getInstance().updateRegistry();
			LineRegistry.getInstance().updateRegistry();
		}

		ArrayList<EObject> result= new ArrayList<EObject>();
		//case of the line
		if( UMLUtil.getStereotypeApplication(context, Line.class)!=null ) {
			ArrayList<RTE_Installation> collect=LineRegistry.getInstance().lineRTE.get(UMLUtil.getStereotypeApplication(context, Line.class));
			if( collect!=null) {
				for (RTE_Installation rte_Installation : collect) {
					result.add(rte_Installation.getBase_Port());
				}
			}
		}
		if( context  instanceof DirectedRelationship) {
			result.addAll(((DirectedRelationship)context).getSources());
		}
		//local controller
		if( UMLUtil.getStereotypeApplication(context, LocalController.class)!=null 
				||UMLUtil.getStereotypeApplication(context, CentralController.class)!=null
				||UMLUtil.getStereotypeApplication(context, ZonalController.class)!=null) {
			ArrayList<Abstraction> collect=AbstractionRegistry.getInstance().incomingAbstraction.get(context);
			if (collect!=null) {
				for (Iterator<Abstraction> iterator = collect.iterator(); iterator.hasNext();) {
					DirectedRelationship directedRelationship = iterator.next();
					result.addAll(directedRelationship.getSources());
				}
			}
		}
		if( UMLUtil.getStereotypeApplication(context, SwSchedulableResource.class)!=null 
				||  UMLUtil.getStereotypeApplication(context, ComputingResource.class)!=null ) {
			ArrayList<Abstraction> collect=AbstractionRegistry.getInstance().outgoingAbstraction.get(context);
			if (collect!=null) {
				for (Iterator<Abstraction> iterator = collect.iterator(); iterator.hasNext();) {
					DirectedRelationship directedRelationship = iterator.next();
					if( UMLUtil.getStereotypeApplication(directedRelationship, Allocate.class)!=null
							||UMLUtil.getStereotypeApplication(directedRelationship, Connect.class)!=null)
						result.addAll(directedRelationship.getTargets());
				}
			}
		}
		if( UMLUtil.getStereotypeApplication(context, CommunicationMedia.class)!=null) {
			ArrayList<DirectedRelationship> connectlink= new ArrayList<DirectedRelationship>();
			ArrayList<Abstraction> collect=AbstractionRegistry.getInstance().incomingAbstraction.get(context);
			if (collect!=null) {
				for (Iterator<Abstraction> iterator = collect.iterator(); iterator.hasNext();) {
					DirectedRelationship directedRelationship = iterator.next();
					if( UMLUtil.getStereotypeApplication(directedRelationship, Connect.class)!=null)
						connectlink.add(directedRelationship);
				}
			}
			result.addAll(connectlink);
		}
		if( UMLUtil.getStereotypeApplication(context, RedundancyCluster.class)!=null) {
			RedundancyCluster cluster= UMLUtil.getStereotypeApplication(context, RedundancyCluster.class);
			if(cluster.getHypervisor()!=null) {
				result.add(cluster.getHypervisor().getBase_Classifier());
			}
			if( cluster.getActive().size()>0) {
				for (Iterator<SwSchedulableResource> iterator = cluster.getActive().iterator(); iterator.hasNext();) {
					result.add(iterator.next().getBase_Classifier());
				}
			}
			if( cluster.getPassive().size()>0) {
				for (Iterator<SwSchedulableResource> iterator = cluster.getPassive().iterator(); iterator.hasNext();) {
					result.add(iterator.next().getBase_Classifier());
				}
			}

		}


		{
			RTE_Installation rteInstallation = UMLUtil.getStereotypeApplication(context, RTE_Installation.class);
			if( rteInstallation!=null) {
				if(rteInstallation.getLocalcontroller()!=null) {
					result.add(rteInstallation.getLocalcontroller().getBase_Class());
				}
			}
		}
		{//mainGrid
			MainGrid mainGrid = UMLUtil.getStereotypeApplication(context, MainGrid.class);
			if( mainGrid!=null) {
				if(mainGrid.getCentralcontroler()!=null) {
					result.add(mainGrid.getCentralcontroler().getBase_Class());
				}
				
				//add only class that are not lines
				for (org.eclipse.uml2.uml.Classifier currentClass : mainGrid.getBase_Class().getNestedClassifiers()) {
					if( UMLUtil.getStereotypeApplication(currentClass, Line.class)==null ) {
						result.add(currentClass);
					}
				}
				
			}
			
		}
		{
			Zone zone = UMLUtil.getStereotypeApplication(context, Zone.class);
			if( zone!=null) {
				if(zone.getZonalcontroller()!=null) {
					result.add(zone.getZonalcontroller().getBase_Class());
				}
			}
		}
		{
		Battery battery = UMLUtil.getStereotypeApplication(context, Battery.class);
			if( battery!=null) {
				if(battery.getLocalcontroller()!=null) {
					result.add(battery.getLocalcontroller().getBase_Class());
				}
			}
		}
		Generator generator = UMLUtil.getStereotypeApplication(context, Generator.class);
		if( generator!=null) {
			if(generator.getLocalcontroller()!=null) {
				result.add(generator.getLocalcontroller().getBase_Class());
			}
		}
		Load load = UMLUtil.getStereotypeApplication(context, Load.class);
		if( load!=null) {
			if(load.getLocalcontroller()!=null) {
				result.add(load.getLocalcontroller().getBase_Class());
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
