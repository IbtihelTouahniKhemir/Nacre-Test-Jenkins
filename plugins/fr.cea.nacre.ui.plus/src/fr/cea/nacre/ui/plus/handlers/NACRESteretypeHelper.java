package fr.cea.nacre.ui.plus.handlers;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.gmf.command.ICommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.types.core.requests.ApplyStereotypeRequest;
import org.eclipse.papyrus.uml.types.core.requests.UnapplyStereotypeRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class NACRESteretypeHelper {
	
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

	/**
	 * Apply required stereotype.
	 *
	 * @param el         the el
	 * @param stereotype the stereotype
	 */


		protected Command getApplyStereotypeCommand(final Element elt, final Stereotype st, final TransactionalEditingDomain domain) {
			Command result = UnexecutableCommand.INSTANCE;

			IElementEditService edit = ElementEditServiceUtils.getCommandProvider(elt);
			if (edit != null) {
				ApplyStereotypeRequest request = new ApplyStereotypeRequest(elt, st, domain);
				ICommand editCommand = edit.getEditCommand(request);
				if (editCommand != null && editCommand.canExecute()) {
					result = ICommandWrapper.wrap(editCommand, Command.class);
				}
			}

			return result;
		}

		protected Command getUnapplyStereotypeCommand(final Element elt, final Stereotype st, final TransactionalEditingDomain domain) {
			Command result = UnexecutableCommand.INSTANCE;

			IElementEditService edit = ElementEditServiceUtils.getCommandProvider(elt);
			if (edit != null) {
				UnapplyStereotypeRequest request = new UnapplyStereotypeRequest(elt, st, domain);
				ICommand editCommand = edit.getEditCommand(request);
				if (editCommand != null && editCommand.canExecute()) {
					result = ICommandWrapper.wrap(editCommand, Command.class);
				}
			}

			return result;
		}


}
