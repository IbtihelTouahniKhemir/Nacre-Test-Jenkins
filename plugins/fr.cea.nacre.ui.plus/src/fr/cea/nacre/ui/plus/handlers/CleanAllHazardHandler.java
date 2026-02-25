package fr.cea.nacre.ui.plus.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
//import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.tools.util.PlatformHelper;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.papyrus.uml.tools.commands.UnapplyStereotypeCommand;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class CleanAllHazardHandler extends CmdHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();

		EObject eo = EMFHelper.getEObject(selection.getFirstElement());
		//			UMLUtil.resolveUMLElement((EObject) selection);
		//			Graphic
		//
		GraphicalEditPart ep = PlatformHelper.getAdapter(selection.getFirstElement(), IGraphicalEditPart.class);
		if( ep != null ) {
			ep.getModel();
		}

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
			TransactionalEditingDomain domain = getTransactionalDomain(registry, umlResource);// TODO Auto-generated method stub
			Stereotype stereotype = (element).getApplicableStereotype("hazards::CommunicationHazard");

			CompoundCommand compoundCommand= new CompoundCommand();
			for (Iterator iterator = eo.eAllContents(); iterator.hasNext();) {
				EObject eObject = (EObject) iterator.next();
				if(eObject instanceof Element) {
					Element currentElement= (Element)eObject;
					if (currentElement.getAppliedStereotype("hazards::CommunicationHazard")!=null){
						Command command =new UnapplyStereotypeCommand(currentElement, currentElement.getAppliedStereotype("hazards::CommunicationHazard"), domain);
						if (command.canExecute()) {
							compoundCommand.append(command);
						}
					}

				}

			}
			domain.getCommandStack().execute(compoundCommand);
		}
		return null;
	}

	/**
	 * Gets the transactional domain.
	 *
	 * @param registry the registry
	 * @return the transactional domain
	 */
	public TransactionalEditingDomain getTransactionalDomain(ServicesRegistry registry, Resource resource) {
		TransactionalEditingDomain domain = null;
		try {
			ModelSet modelSet = registry.getService(ModelSet.class);
			domain = modelSet.getTransactionalEditingDomain();
			// URI uri = resource.getURI();
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}

		return domain;
	}


}