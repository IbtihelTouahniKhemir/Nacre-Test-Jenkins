package fr.cea.nacre.types.advices.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.util.SW_ConcurrencySwitch;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.CommonType.PeriodType;
import fr.cea.nacre.model.NACREMM.cra.SoftwareResource;


public class SetValueSwResourcesCommand extends EditElementCommand {
	
	private String period;
	private Element element;

	public SetValueSwResourcesCommand(EObject elementToEdit, IEditCommandRequest request, String period) {
		super("SetValueCommunicationMediaCommand", elementToEdit, request);
		this.period=period;
		this.element= (Element)elementToEdit;

	}



	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable adaptable) throws ExecutionException {
		CommandResult result = CommandResult.newOKCommandResult();
		SwSchedulableResource comM= UMLUtil.getStereotypeApplication(this.element, SwSchedulableResource.class);
		comM.setType(period);
		
		
		return result;
	}


}
