package fr.cea.nacre.types.advices;

import static fr.cea.nacre.model.GcmConstants.ComputingResourcePrefix.CR_SUBSTATION_EQUIPMENTS;
import static fr.cea.nacre.model.GcmConstants.ComputingResourcePrefix.CR_SUBSTATION_GENERATORS;
import static fr.cea.nacre.model.GcmConstants.Element.CFRAS;
import static fr.cea.nacre.model.GcmConstants.Element.CRAS;
import static fr.cea.nacre.model.GcmConstants.Parameter.NEW_GCM_DATA;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.types.utils.NACREElementTypesEnumerator;
import fr.cea.nacre.types.utils.PackageUtils;
import nacre.Bus;
import nacre.MainGrid;
import nacre.Substation;
import nacre.Zone;


public class SubstationEditHelperAdvice extends AbstractEditHelperAdvice {

	class SubstationConfigureElementCommand extends ConfigureElementCommand {

		ConfigureRequest cfgRequest;

		protected TransactionalEditingDomain domain;
		protected IElementType busElementType;

		protected Class subContainer;
		protected Model model;

		org.eclipse.uml2.uml.Package craContainer;
		org.eclipse.uml2.uml.Package cfrasContainer;

		SubstationConfigureElementCommand(ConfigureRequest cfgRequest, Class subContainer) {
			super(cfgRequest);

			this.cfgRequest = cfgRequest;

			this.domain = cfgRequest.getEditingDomain();
			this.busElementType = ElementTypeRegistry.getInstance()
					.getElementType(NACREElementTypesEnumerator.BUS);

			this.subContainer = subContainer;
			this.model = subContainer.getModel();
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
				throws ExecutionException {

			MainGrid maingrid = UMLUtil.getStereotypeApplication(subContainer, MainGrid.class);
			Zone zone = UMLUtil.getStereotypeApplication(subContainer, Zone.class);
			EObject newElement = cfgRequest.getElementToConfigure();

			fr.cea.nacre.model.NACREMM.cfa.Substation gcmSubstation =
					(fr.cea.nacre.model.NACREMM.cfa.Substation) cfgRequest.getParameter(NEW_GCM_DATA);
			String name = gcmSubstation.getName();

			boolean hasGeneratorBattery = false;
			boolean hasRteInstallation = false;
			for ( fr.cea.nacre.model.NACREMM.cfa.Bus bus : gcmSubstation.getBus()) {
				hasGeneratorBattery = hasGeneratorBattery
						|| (! bus.getGenerators().isEmpty())
						|| (! bus.getBatteries().isEmpty()
						|| (! bus.getBatteries().isEmpty()));/***IK*****/
				hasRteInstallation = hasRteInstallation
						|| (! bus.getRteInstallations().isEmpty());
			}

			NamedElement substation_class = (NamedElement) newElement;
			if (name != null) {
				substation_class.setName(name);
			}

			// set substation container
			Substation substation = UMLUtil.getStereotypeApplication(substation_class, Substation.class);

			if (maingrid != null && substation != null) {

				maingrid.getSubstation().add(substation);
			} else if (zone != null && substation != null) {
				zone.getSubstation().add(substation);
			}

			// create bus and name it as the substation and set substation property of the
			// bus
			// IElementType busElementType = (IHintedType)
			// getElementType("com.example.nacre.Bus_Class");

			CreateElementRequest request = new CreateElementRequest(domain, substation_class,
					busElementType);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(model);
			ICommand createcommandBus = provider.getEditCommand(request);

			if ((createcommandBus != null) && createcommandBus.canExecute()) {
				try {
					createcommandBus.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {

					e.printStackTrace();
				}
			}
			Object result = createcommandBus.getCommandResult().getReturnValue();
			if (result != null) {
				NamedElement bus_class = (NamedElement) ((Element) result);
				bus_class.setName(substation_class.getName());
				Bus bus = UMLUtil.getStereotypeApplication(bus_class, Bus.class);
				bus.setSubstation(substation);

			}

			// create computing resource for the substation
			craContainer = PackageUtils.getSpecificElementPackage(model, CRAS);
			if (craContainer.getNestedPackages() != null
				&& !craContainer.getNestedPackages().isEmpty())
			{
				craContainer = craContainer.getNestedPackages().get(0);
			}

			cfrasContainer = PackageUtils.getSpecificElementPackage(model, CFRAS);
			if (cfrasContainer.getNestedPackages()!=null
				&& !cfrasContainer.getNestedPackages().isEmpty())
			{
				cfrasContainer = cfrasContainer.getNestedPackages().get(0);
			}

			// create computing resource for LC of the substation generators
			if( hasGeneratorBattery) {
				createSubstation_CR_SR(substation_class, provider, CR_SUBSTATION_GENERATORS);
			}

			// create computing resource for : LC of the substation equipments (rte_installations, ...)
			if( hasRteInstallation ) {
				createSubstation_CR_SR(substation_class, provider, CR_SUBSTATION_EQUIPMENTS);
			}

			return CommandResult.newOKCommandResult(newElement);
		}

		protected void createSubstation_CR_SR(NamedElement substation_class,
				IElementEditService provider, String crCategoryPrefix) {
			// create computing resource for the substation
			IElementType computing_Resource = NACREElementTypesEnumerator.COMPUTING_RESOURCE;


			// create computing resource for LC of the substation generators
			CreateElementRequest computing_request =
					new CreateElementRequest(domain, craContainer, computing_Resource);

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
			if (cr_result instanceof NamedElement) {
				computingRes_class = (NamedElement) cr_result;
				computingRes_class.setName(crCategoryPrefix + substation_class.getName());
			}

			// create abstraction between CR and Substation
			Abstraction abstraction = UMLFactory.eINSTANCE.createAbstraction();
			abstraction.getSuppliers().add(substation_class);
			abstraction.getClients().add(computingRes_class);
			SetRequest abstraction_request = new SetRequest(domain, cfrasContainer,
					UMLPackage.eINSTANCE.getPackage_PackagedElement(), abstraction);

			ICommand createcommandAbstraction = provider.getEditCommand(abstraction_request);

			if ((createcommandAbstraction != null) && createcommandAbstraction.canExecute()) {
				try {
					createcommandAbstraction.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {

					e.printStackTrace();
				}
			}

			// it is not executed, it is not a createElement,
//			NamedElement abstraction_class = null;
//			Object result_abs = createcommandAbstraction.getCommandResult().getReturnValue();
//			if (result_abs != null) {
//				abstraction_class = (NamedElement) ((Element) result_abs);
//				abstraction_class.setName(substation_class.getName() + "_" + computingRes_class.getName());
//
//			}
		}
	}

	// we should create :
	// 1) a bus with the same name
	// 2) a computing Resource in the CRAS with the same name , with a new Package
	// cra1
	// 3) abstractions in the CFRAS between substation and computing Resource, with
	// a new Package cfra1

	@Override
	public ICommand getAfterConfigureCommand(ConfigureRequest request) {

		EObject newElement = request.getElementToConfigure();
		EObject subContainer = newElement.eContainer(); // container is either a mainGrid or Zone

		// creation from CSV file
		if (subContainer instanceof Class) {
			return new SubstationConfigureElementCommand(request, (Class) subContainer);
		}

		return super.getAfterConfigureCommand(request);
	}

}
