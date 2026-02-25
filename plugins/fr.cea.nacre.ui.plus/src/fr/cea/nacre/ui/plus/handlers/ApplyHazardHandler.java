package fr.cea.nacre.ui.plus.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
//import org.eclipse.emf.common.util.URI;
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

import nacre.Generator;
import nacre.Line;

public class ApplyHazardHandler extends CmdHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		NACRESteretypeHelper nacreStereotypeHelper = new NACRESteretypeHelper();
		EObject eo = EMFHelper.getEObject(selection.getFirstElement());
        String hazard="hazards::CommunicationHazard";
		// get the container for the current element
		if (eo instanceof Element) {

			Element element = (Element) eo;
			Resource umlResource = eo.eResource();
			ServicesRegistry registry = null;
			if( UMLUtil.getStereotypeApplication(element, Generator.class)!=null){
				hazard="hazards::GeneratorHazard";
			}
			else if( UMLUtil.getStereotypeApplication(element, Line.class)!=null){
				hazard="hazards::LineHazard";
			}
			try {
				registry = ServiceUtilsForResource.getInstance().getServiceRegistry(umlResource);
			} catch (ServiceException e1) {

				e1.printStackTrace();
			}
			TransactionalEditingDomain domain = nacreStereotypeHelper.getTransactionalDomain(registry, umlResource);// TODO Auto-generated method stub
			 Stereotype stereotype = (element).getApplicableStereotype(hazard);
			if (element.getAppliedStereotype(hazard)!=null)
			{
			 Command command = nacreStereotypeHelper.getUnapplyStereotypeCommand(element, stereotype, domain);
			 domain.getCommandStack().execute(command);

			} else {
				 Command command = nacreStereotypeHelper.getApplyStereotypeCommand(element, stereotype, domain);
				 domain.getCommandStack().execute(command);
			}
		}
		return null;
	}

	


}