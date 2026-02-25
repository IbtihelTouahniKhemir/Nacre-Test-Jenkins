package fr.cea.nacre.ui.plus.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
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

import fr.cea.nacre.model.NACREModelHelper;
import nacre.CRA;

public class ApplyHazardOnCRHandler extends CmdHandler {

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
			ArrayList<Element> commResouList = new ArrayList<Element>();

			if (UMLUtil.getStereotypeApplication(element, CRA.class) != null) {
				nacreModelerHelper.getCRfromCRA(element, commResouList);
			}

			TransactionalEditingDomain domain = nacreStereotypeHelper.getTransactionalDomain(registry, umlResource);// TODO Auto-generated
																								// method stub
			// get the Hazard Stereotype from list element ( hazard not applied to a
			// package)
			if (commResouList != null && !commResouList.isEmpty()) {
				Element communicationMedia = commResouList.get(0);
				Stereotype stereotype = (communicationMedia).getApplicableStereotype("hazards::CommunicationHazard");
				CompoundCommand compoundCommand = new CompoundCommand();
				for (Element comMedia : commResouList) {
					Command command = nacreStereotypeHelper.getApplyStereotypeCommand(comMedia, stereotype, domain);
					compoundCommand.append(command);
				}
				domain.getCommandStack().execute(compoundCommand);
			}

		}

		return null;
	}



}