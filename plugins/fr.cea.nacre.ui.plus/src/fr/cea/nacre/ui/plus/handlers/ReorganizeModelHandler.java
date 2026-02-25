package fr.cea.nacre.ui.plus.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.util.ServiceUtilsForHandlers;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;

import fr.cea.nacre.ui.plus.command.ReorganizeModelCommand;

public class ReorganizeModelHandler extends CmdHandler {

	protected TransactionalEditingDomain transactionalEditingDomain=null;
	protected PapyrusMultiDiagramEditor papyrusEditor;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		updateSelectedEObject();
		try {
			papyrusEditor =(PapyrusMultiDiagramEditor)ServiceUtilsForHandlers.getInstance().getService(IMultiDiagramEditor.class, event);
			transactionalEditingDomain =ServiceUtilsForHandlers.getInstance().getService(org.eclipse.emf.transaction.TransactionalEditingDomain.class, event);
		} catch (Exception e) {
			System.err.println("impossible to get the Transactional Editing Domain "+e);
		}
		transactionalEditingDomain.getCommandStack().execute(new ReorganizeModelCommand(transactionalEditingDomain, selectedEObject));
		return null;
	}


}
