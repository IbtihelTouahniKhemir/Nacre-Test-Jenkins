package fr.cea.nacre.types.advices.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class SetValueCommunicationMediaCommand extends EditElementCommand {

	private String latency;
	private String capacity;
	private Element element;
//	private Stereotype stereotype;

	public SetValueCommunicationMediaCommand(EObject elementToEdit, IEditCommandRequest request, String latency, String capacity) {
		super("SetValueCommunicationMediaCommand", elementToEdit, request);
//		this.stereotype= ((ApplyStereotypeRequest)request).getStereotype();
		this.latency= latency;
		this.capacity=capacity;
		this.element= (Element)elementToEdit;

	}



	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable adaptable) throws ExecutionException {
		CommandResult result = CommandResult.newOKCommandResult();
		CommunicationMedia comM= UMLUtil.getStereotypeApplication(this.element, CommunicationMedia.class);
		comM.getCapacity().add(capacity);
		comM.getBlockT().add(latency);

		return result;
	}

}
