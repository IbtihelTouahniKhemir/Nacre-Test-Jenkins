package fr.cea.nacre.ui.plus.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import nacre.Bus;
import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;

public abstract class AbstractApplyHazard extends CmdHandler {

	protected Class stereotypeKind;

	public AbstractApplyHazard() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NACREModelHelper nacreModelerHelper = new NACREModelHelper();
		NACRESteretypeHelper nacreStereotypeHelper = new NACRESteretypeHelper();
		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
	
		EObject eo = EMFHelper.getEObject(selection.getFirstElement());
	
		// get the container for the current element
		if (eo instanceof Element) {
	
			Element element = (Element) eo;
			Resource umlResource = eo.eResource();
			ServicesRegistry registry = null;
			try {
				registry = ServiceUtilsForResource.getInstance().getServiceRegistry(umlResource);
			} catch (ServiceException e1) {
	
				e1.printStackTrace();
			}
			ArrayList<Element> swSchedulableResourceList= new ArrayList<Element>(); 
	
			
			if (UMLUtil.getStereotypeApplication(element, MainGrid.class)!=null) {
				nacreModelerHelper.getSRFromMainGrid( element, swSchedulableResourceList, stereotypeKind);
			}
			if (UMLUtil.getStereotypeApplication(element, Zone.class)!=null) {
				nacreModelerHelper.getSRFromZone( element, swSchedulableResourceList,stereotypeKind);
			}
			if (UMLUtil.getStereotypeApplication(element, Substation.class)!=null) {
				nacreModelerHelper.getSRFromSubstation( element, swSchedulableResourceList,stereotypeKind);
			}
			// look for All RTE Elements for the seub tree
			if (UMLUtil.getStereotypeApplication(element, Bus.class)!=null) {
				nacreModelerHelper.getSRFromBus( element, swSchedulableResourceList,stereotypeKind);
			}
	
			// look for all allocations
			TransactionalEditingDomain domain = nacreStereotypeHelper.getTransactionalDomain(registry, umlResource);// TODO Auto-generated method stub
			Stereotype stereotype = (element).getApplicableStereotype("hazards::CommunicationHazard");
			CompoundCommand compoundCommand= new CompoundCommand();
			for (Element swSchedulableResource : swSchedulableResourceList) {
				Command command = nacreStereotypeHelper.getApplyStereotypeCommand(swSchedulableResource, stereotype, domain);
				compoundCommand.append(command);
			}
			domain.getCommandStack().execute(compoundCommand);
	
		}
	
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
	 * 
	 * @return
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		if( selectedEObject instanceof Element) {
			Element element= (Element) selectedEObject;
			if (UMLUtil.getStereotypeApplication(element, MainGrid.class)!=null) {
				return true;
			}
			if (UMLUtil.getStereotypeApplication(element, Zone.class)!=null) {
				return true;
			}
			if (UMLUtil.getStereotypeApplication(element, Substation.class)!=null) {
				return true;
			}
			if (UMLUtil.getStereotypeApplication(element, Bus.class)!=null) {
				return true;
			}
		}
		return false;
	}

}