package fr.cea.nacre.ui.plus.handlers;

import java.util.ArrayList;
import java.util.Iterator;

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
import nacre.Link;
import nacre.MainGrid;
import nacre.ZonalController;
import nacre.Zone;

public class ApplyHazardOnAllLinkHandler extends CmdHandler {


	public ApplyHazardOnAllLinkHandler() {
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
			ArrayList<Element> linkList= new ArrayList<Element>(); 
			Resource resource=eo.eResource();
			ServicesRegistry registry = null;
			try {
				registry = ServiceUtilsForResource.getInstance().getServiceRegistry(resource);
			} catch (ServiceException e1) {

				e1.printStackTrace();
			}

			for (Iterator iterator = resource.getAllContents(); iterator.hasNext();) {
				EObject currentEObject = (EObject) iterator.next();
				if( currentEObject instanceof Link) {
					linkList.add( ((Link)currentEObject).getBase_Abstraction());
				}

			}

			// look for all allocations
			if( linkList.size()>0) {
				TransactionalEditingDomain domain = nacreStereotypeHelper.getTransactionalDomain(registry, resource);// TODO Auto-generated method stub
				Stereotype stereotype = (linkList.get(0)).getApplicableStereotype("hazards::CommunicationHazard");
				CompoundCommand compoundCommand= new CompoundCommand();
				for (Element abstraction : linkList) {
					Command command = nacreStereotypeHelper.getApplyStereotypeCommand(abstraction, stereotype, domain);
					compoundCommand.append(command);
				}
				domain.getCommandStack().execute(compoundCommand);
			}
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
			return true;
		}
		return false;
	}

}