package fr.cea.nacre.types.advices;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.MainGrid;
import nacre.Zone;

public class ZoneEditHelperAdvice extends AbstractEditHelperAdvice {
	

	@Override
	public ICommand getAfterConfigureCommand(ConfigureRequest request) {
	
		EObject newElement = request.getElementToConfigure();
		EObject container = newElement.eContainer();

		// set the Maingrid property of the Zone

		if (container != null && container instanceof Element) {

			return new ConfigureElementCommand(request) {
				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {

					MainGrid mainGid = UMLUtil.getStereotypeApplication((Element) container, MainGrid.class);
					Zone zone = UMLUtil.getStereotypeApplication((Element) newElement, Zone.class);
					if (zone != null && mainGid != null) {
						zone.setMaingrid(mainGid);
					}

					return CommandResult.newOKCommandResult(newElement);

				}
			};
		}
		return super.getAfterConfigureCommand(request);
	}


}
