package fr.cea.nacre.types.advices;

import static fr.cea.nacre.model.GcmConstants.Element.CFRAS;
import static fr.cea.nacre.model.GcmConstants.Element.CRAS;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import fr.cea.nacre.types.utils.NACREElementTypesEnumerator;
import fr.cea.nacre.types.utils.PackageUtils;

public class ZC_CC_EditHelperAdvice extends AbstractEditHelperAdvice {

	// we should create :
	// 1) a swresource when we create a zonal controler
	// 2) abstraction between zonal controler and its swr resource


	@Override
	public ICommand getAfterConfigureCommand(ConfigureRequest request) {

		EObject newElement = request.getElementToConfigure();
		EObject container = newElement.eContainer(); // container is Package CFA
		TransactionalEditingDomain domain = request.getEditingDomain();

		if (container != null && container instanceof Element) {

				return new ConfigureElementCommand(request) {
					@Override
					protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {

										Model model = ((Element) container).getModel();
						// create sw resource for the zonal controller

						org.eclipse.uml2.uml.Package container = PackageUtils.getSpecificElementPackage(model, CRAS);
						if (container.getNestedPackages() != null && !container.getNestedPackages().isEmpty()) {
							// to be fixed, this in only for the first cras,
							container = container.getNestedPackages().get(0);
						}
						IElementType sw_Resource = NACREElementTypesEnumerator.SOFTWARE_RESOURCE;
						CreateElementRequest computing_request = new CreateElementRequest(domain, container,
								sw_Resource);
						IElementEditService provider = ElementEditServiceUtils.getCommandProvider(model);
						ICommand createCommandCompRes = provider.getEditCommand(computing_request);

						if ((createCommandCompRes != null) && createCommandCompRes.canExecute()) {
							try {
								createCommandCompRes.execute(new NullProgressMonitor(), null);
							} catch (ExecutionException e) {

								e.printStackTrace();
							}
						}

						NamedElement computingRes_class = null;
						Object cr_result = createCommandCompRes.getCommandResult().getReturnValue();
						if (cr_result != null) {
							computingRes_class = (NamedElement) ((Element) cr_result);
							computingRes_class.setName(((NamedElement)newElement).getName()+"_SwR");

						}

						// create abstraction between ZC and ZC_SWR

						org.eclipse.uml2.uml.Package container_cfras = PackageUtils.getSpecificElementPackage(model, CFRAS);
						if (container_cfras.getNestedPackages()!=null && !container_cfras.getNestedPackages().isEmpty())
						{
							container_cfras = container_cfras.getNestedPackages().get(0);
						}
						Abstraction abstraction = UMLFactory.eINSTANCE.createAbstraction();
						abstraction.getSuppliers().add((NamedElement) newElement);
						abstraction.getClients().add(computingRes_class);
						SetRequest abstraction_request = new SetRequest(domain, container_cfras,
								UMLPackage.eINSTANCE.getPackage_PackagedElement(), abstraction);





						ICommand createcommandAbstraction = provider.getEditCommand(abstraction_request);

						if ((createcommandAbstraction != null) && createcommandAbstraction.canExecute()) {
							try {
								createcommandAbstraction.execute(new NullProgressMonitor(), null);
							} catch (ExecutionException e) {

								e.printStackTrace();
							}
						}

						return CommandResult.newOKCommandResult(newElement);

					}
				};

		}
		return super.getAfterConfigureCommand(request);

	}

}
