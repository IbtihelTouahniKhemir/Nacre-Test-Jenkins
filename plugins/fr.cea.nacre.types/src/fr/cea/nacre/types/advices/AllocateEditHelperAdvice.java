
package fr.cea.nacre.types.advices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
//import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.types.utils.NACREElementTypesEnumerator;



public class AllocateEditHelperAdvice extends AbstractEditHelperAdvice {


	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#approveRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		// only CreateRelationshipRequest are interested for conform
		if (request instanceof CreateRelationshipRequest) {
			CreateRelationshipRequest createRelationshipRequest = (CreateRelationshipRequest) request;
			// only elementType conform are interested for conform
			IElementType elementType = createRelationshipRequest.getElementType();
			if (elementType instanceof ISpecializationType) {
				if (isSpecializationof((ISpecializationType) elementType, NACREElementTypesEnumerator.ALLOCATE)) {
					return approveCreateRelationshipRequest(createRelationshipRequest);
				}
			}
		}
		return super.approveRequest(request);
	}

	/**
	 * Check if iSpecializationType is a specialization of elementTypeId
	 * 
	 * @param iSpecializationType
	 * @param elementTypeId
	 * @return
	 */
	// FIXME : this utility should be provided by the elementType API
	private boolean isSpecializationof(ISpecializationType iSpecializationType, IElementType elementType) {
		List<IElementType> elementTypesHierarchy = new ArrayList<>();
		elementTypesHierarchy.add(iSpecializationType);
		elementTypesHierarchy.addAll(Arrays.asList(iSpecializationType.getAllSuperTypes()));
		return elementTypesHierarchy.contains(elementType);
	}

	/**
	 * supplier (target) of the createRelationshipRequest should be a requirement
	 * 
	 * @param createRelationshipRequest
	 * @return
	 */
	private boolean approveCreateRelationshipRequest(CreateRelationshipRequest createRelationshipRequest) {
		EObject target = createRelationshipRequest.getTarget();
		EObject source = createRelationshipRequest.getSource();
		if ((source instanceof Element) && (target instanceof Element)) {
			// to be refined. Source and target must be communication Media
			if (UMLUtil.getStereotypeApplication((Element) source, ComputingResource.class) != null
					&& UMLUtil.getStereotypeApplication((Element) target, CommunicationMedia.class) != null) {
				return true;
			}
		}
		return false;
	}
	

	
	@Override
	public ICommand getAfterConfigureCommand(ConfigureRequest request) {

		EObject newElement = request.getElementToConfigure();

		if (newElement != null && !(newElement instanceof Abstraction)) {
			return super.getAfterConfigureCommand(request);
		}
		final Abstraction abstraction = (Abstraction) request.getElementToConfigure();
		if (abstraction != null) {
			return new ConfigureElementCommand(request) {
				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
						throws ExecutionException {
					NamedElement supplier = abstraction.getSuppliers().get(0);
					NamedElement client = abstraction.getClients().get(0);
					if (abstraction != null) {
						String sourceName = ((NamedElement) client).getName();
						String targetName = ((NamedElement) supplier).getName();
						String newName = sourceName + "_" + targetName;

						abstraction.setName(newName);
					}

					return CommandResult.newOKCommandResult(newElement);

				}
			};
		}

		return super.getAfterConfigureCommand(request);
	}

	
	
}
