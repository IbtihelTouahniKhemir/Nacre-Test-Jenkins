package fr.cea.nacre.modelgenerator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.util.ServiceUtilsForHandlers;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;


public class GenerateModelHandler extends CmdHandler {

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
		transactionalEditingDomain.getCommandStack().execute(new GenerateModelCommand(transactionalEditingDomain, selectedEObject));
		return null;
	}


}