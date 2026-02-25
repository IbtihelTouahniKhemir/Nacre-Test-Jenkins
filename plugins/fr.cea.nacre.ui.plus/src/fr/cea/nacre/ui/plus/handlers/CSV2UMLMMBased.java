package fr.cea.nacre.ui.plus.handlers;

import static fr.cea.nacre.model.GcmConstants.Parameter.NEW_GCM_DATA;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;
import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.Bus;
import fr.cea.nacre.model.NACREMM.cfa.Generator;
import fr.cea.nacre.model.NACREMM.cfa.Load;
import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.factory.GCMFactory2;
import fr.cea.nacre.types.utils.NACREElementTypesEnumerator;
import fr.cea.nacre.ui.plus.parser.GCMParserMMBased;
import fr.cea.nacre.ui.plus.parser.ImporterParserMMBasedFactory;
import nacre.VoltageLevel;

public class CSV2UMLMMBased {

	/** The domain. */
	public TransactionalEditingDomain transactionalDomain;

	public Resource umlResource;
	public GCMFactory2 gcmFactory;

	protected Model umlContainer;
	protected EditingDomain editingDomain;

	protected GCMParserMMBased parser;


	protected IWizardContainer wizardContainer;
	protected String importedFilePath;
	public Class element;

	public CSV2UMLMMBased(IWizardContainer wizardContainer, String importedFilePath, Class element) {
		this.wizardContainer  = wizardContainer;
		this.importedFilePath = importedFilePath;
		this.element          = element;
		this.umlResource      = element.eResource();
	}

	protected Class importSubstation2UML(Substation gcmSubstation) {
		//System.out.println("+->import substation "+csvSubstation.getName());
		// create Substation using Element Type, to create automatically bus,
		// computingresource and abstractions between substations and computing resources
		Class substation = null;

		IElementType substationelementType = NACREElementTypesEnumerator.Substation;
		IElementEditService cmdProvider = ElementEditServiceUtils.getCommandProvider(umlContainer);
		CreateElementRequest createElementRequest = new CreateElementRequest(
				(TransactionalEditingDomain) editingDomain, element, substationelementType);
		createElementRequest.setParameter(NEW_GCM_DATA, gcmSubstation);
		ICommand command = cmdProvider.getEditCommand(createElementRequest);
		editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));

		// FIXME : put it in the request Parameter to be executed in the advice,
		// see if we can add Parameter to the request to set also the bus id
		Object result = command.getCommandResult().getReturnValue();
		if (result != null && result instanceof Class) {
			substation = (Class) result;
			SetRequest setRequest = new SetRequest(substation,
					UMLPackage.eINSTANCE.getNamedElement_Name(), gcmSubstation.getName());
			IElementEditService provider2 = ElementEditServiceUtils.getCommandProvider(umlContainer);
			ICommand command2 = provider2.getEditCommand(setRequest);
			editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));
		}

		return substation;
	}

	protected Class importBus2UML(Class substation, Bus gcmBus, int busIndex) {
		String bus_name = gcmBus.getName();
		//System.out.println("+-->import bus "+bus_name);
		// Bus already created, get it from the substation advice
		CommonType bus_nominalLevel = gcmBus.getNominalLevel();
		Class bus = null;

		//by default a substation us created with a bus.
		//so if we parse the first bus, we have to update element
		if ( (substation.getNestedClassifiers().size()==1 && busIndex==0)) {
			bus = updateBusInformation(substation, bus_name, busIndex, bus_nominalLevel);
		}
		else {//create a bus for the substation
			createBus(substation, bus_name, bus_nominalLevel);
			bus = (Class) substation.getNestedClassifiers().get(busIndex);
		}

		return bus;
	}
	/*****load*/
	protected void importLoad2UML(Class bus, Load gcmLoad) {
		IElementEditService cmdProvider = ElementEditServiceUtils.getCommandProvider(umlContainer);
		CreateElementRequest createElementRequest2 = new CreateElementRequest(
				(TransactionalEditingDomain) editingDomain, bus, NACREElementTypesEnumerator.Load);
		// Why not the full Structure
		//createElementRequest2.setParameter(NEW_GCM_DATA, csvLoad);

		createElementRequest2.setParameter(NEW_GCM_DATA, gcmLoad);
		ICommand command3 = cmdProvider.getEditCommand(createElementRequest2);
		editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command3));
		//System.out.println("+--->create csvload "+csvLoad.getName());
	}
   /*************/
	protected void importBattery2UML(Class bus, Battery gcmBattery) {
		IElementEditService cmdProvider = ElementEditServiceUtils.getCommandProvider(umlContainer);
		CreateElementRequest createElementRequest2 = new CreateElementRequest(
				(TransactionalEditingDomain) editingDomain, bus, NACREElementTypesEnumerator.Battery);
		// Why not the full Structure
		//createElementRequest2.setParameter(NEW_GCM_DATA, csvBattery);

		createElementRequest2.setParameter(NEW_GCM_DATA, gcmBattery);
		ICommand command3 = cmdProvider.getEditCommand(createElementRequest2);
		editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command3));
		//System.out.println("+--->create csvBattery "+csvBattery.getName());
	}

	protected void importGenerator2UML(Class bus, Generator gcmGenerator) {
		IElementEditService cmdProvider = ElementEditServiceUtils.getCommandProvider(umlContainer);
		CreateElementRequest createElementRequest2 = new CreateElementRequest(
				(TransactionalEditingDomain) editingDomain, bus, NACREElementTypesEnumerator.Generator);
		// Why not the full Structure
		//createElementRequest2.setParameter(NEW_GCM_DATA, csvGenerator);

		createElementRequest2.setParameter(NEW_GCM_DATA, gcmGenerator);
		ICommand command3 = cmdProvider.getEditCommand(createElementRequest2);
		editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command3));
		//System.out.println("+--->create Generator "+csvGenerator.getName());
	}

	protected void importRteInstallation2UML(Class bus, RteInstallation gcmRteInstallation) {
		IElementType rte_inst_elementType = NACREElementTypesEnumerator.RTE_INSTALLATION;
		IElementEditService cmdProvider = ElementEditServiceUtils.getCommandProvider(umlContainer);
		CreateElementRequest createElementRequest2 = new CreateElementRequest(
				(TransactionalEditingDomain) editingDomain, bus, rte_inst_elementType);
		// Why not the full Structure
		//createElementRequest2.setParameter(NEW_GCM_DATA, csvRteInstallation);

		createElementRequest2.setParameter(NEW_GCM_DATA, gcmRteInstallation);
		ICommand command3 = cmdProvider.getEditCommand(createElementRequest2);
		editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command3));
		//System.out.println("+--->create rteInstallation "+csvRteInstallation.getName());
	}


	protected void import2UML() {
		for (Substation gcmSubstation : parser.getSubstations()) {
			Class substation = importSubstation2UML(gcmSubstation);

			int busIndex = 0;
			for (Bus gcmBus : gcmSubstation.getBus()) {
				Class bus =  importBus2UML(substation, gcmBus, busIndex);
				busIndex = busIndex + 1;

				// create the batteries or generators or loads for each bus
				List<Generator> csvGenerators = gcmBus.getGenerators();
				List<Battery> csvBatteries    = gcmBus.getBatteries();
				EList<Load> csvLoads    = gcmBus.getLoads();

				if (((csvGenerators != null) && (! csvGenerators.isEmpty()))
					|| ((csvBatteries != null) && (! csvBatteries.isEmpty()))|| ((csvLoads != null) && (! csvLoads.isEmpty()))) {
//					org.eclipse.uml2.uml.Package cras =
//							PackageUtils.getSpecificElementPackage(umlContainer, CRAS);
//
//					org.eclipse.uml2.uml.Package cra  = null;
//					if (cras.getNestedPackages() != null && !cras.getNestedPackages().isEmpty()) {
//						cra = cras.getNestedPackages().get(0);
//					}
//
// Pourquoi créer cette COMPUTING_RESOURCE ici et pas dans SubstationEditHelperAdvice ligne 110 ...
//						IElementType computing_Resource = NACREElementTypesEnumerator.COMPUTING_RESOURCE;
//						CreateElementRequest computing_request = new CreateElementRequest(domain, cra, computing_Resource);
//						computing_request.setParameter(Constants4Handlers.NEW_NAME, ("CR_gen_" + bus_name));

//						ICommand createCommandCompRes = cmdProvider.getEditCommand(computing_request);

//						if ((createCommandCompRes != null) && createCommandCompRes.canExecute()) {
//							try {
//								createCommandCompRes.execute(new NullProgressMonitor(), null);
//								System.out.println("+-->create computing resource "+"CR_gen_" + bus_name);
//							} catch (ExecutionException e) {
//								e.printStackTrace();
//							}
//						}

					if (csvBatteries != null) {
						for (Battery gcmBattery : csvBatteries) {
							importBattery2UML(bus, gcmBattery);
						}
					}

					if (csvGenerators != null) {
						for (Generator gcmGenerator : csvGenerators) {
							importGenerator2UML(bus, gcmGenerator);
						}
					}
					if (csvLoads != null) {
						for (Load gcmLoad : csvLoads) {
							importLoad2UML(bus, gcmLoad);
						}
					}
				}

				// create the rte installation for each bus
				List<RteInstallation> csvRteInstallations = gcmBus.getRteInstallations();
				if( csvRteInstallations != null ) {
					for (RteInstallation gcmRteInstallation : gcmBus.getRteInstallations()) {
						importRteInstallation2UML(bus, gcmRteInstallation);
					}
				}
			}
		}
	}


	class Import2UMLWithProgressMonitor implements IRunnableWithProgress {
		@Override
		public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
			final int totalWork = 100;
			int taskProgress = 0;
			String topologyFilename = Path.of(importedFilePath).getFileName().toString();
            monitor.beginTask("Import zone topology " + topologyFilename + " ...", totalWork);

			// 30 % of total work : Parsing end !
			taskProgress += 10;
			int nbSubstations = parser.getSubstations().size();
			double substationTaskPart = 90.0 / nbSubstations;

			monitor.worked(taskProgress);

			for (Substation gcmSubstation : parser.getSubstations()){
				monitor.subTask("Import Substation " + gcmSubstation.getName());

				Class substation = importSubstation2UML(gcmSubstation);

				int busIndex = 0;
				for (Bus gcmBus : gcmSubstation.getBus()) {
					String bus_name = gcmBus.getName();
					//System.out.println("+-->import bus "+bus_name);
					// Bus already created, get it from the substation advice

					monitor.subTask("Import Substation " + gcmSubstation.getName() + "\nBus " + bus_name);

					Class bus =  importBus2UML(substation, gcmBus, busIndex);
					busIndex = busIndex + 1;

					// create the batteries or generators for each bus
					List<Generator> csvGenerators = gcmBus.getGenerators();
					List<Battery> csvBatteries    = gcmBus.getBatteries();
					EList<Load> csvLoads    = gcmBus.getLoads();

					if (((csvGenerators != null) && (! csvGenerators.isEmpty()))
						|| ((csvBatteries != null) && (! csvBatteries.isEmpty()))|| ((csvLoads != null) && (! csvLoads.isEmpty()))) {
						if (csvBatteries != null) {
							for (Battery gcmBattery : csvBatteries) {
								monitor.subTask("Import Substation " + gcmSubstation.getName()
										+ "\nBus " + bus_name + " Battery " + gcmBattery.getName());

								importBattery2UML(bus, gcmBattery);
							}
						}

						if (csvGenerators != null) {
							for (Generator gcmGenerator : csvGenerators) {
								monitor.subTask("Import Substation " + gcmSubstation.getName()
										+ "\nBus " + bus_name + " Generator " + gcmGenerator.getName());

								importGenerator2UML(bus, gcmGenerator);
							}
						}
						if (csvLoads != null) {
							for (Load gcmLoad : csvLoads) {
								monitor.subTask("Import Substation " + gcmSubstation.getName()
										+ "\nBus " + bus_name + " Load " + gcmLoad.getName());

								importLoad2UML(bus, gcmLoad);
							}
						}
					}

					// create the rte installation for each bus
					List<RteInstallation> csvRteInstallations = gcmBus.getRteInstallations();
					if( csvRteInstallations != null ) {
						for (RteInstallation gcmRteInstallation : gcmBus.getRteInstallations()) {
							monitor.subTask("Import Substation " + gcmSubstation.getName()
									+ "\nBus " + bus_name + " RteInstallation " + gcmRteInstallation.getName());

							importRteInstallation2UML(bus, gcmRteInstallation);
						}
					}
				}

				//  nbSubstations+  of rest (70 %) of work : Parsing end !
				taskProgress += substationTaskPart;
				monitor.worked(taskProgress);
			}
			monitor.done();
		}
	}



	public void execute() throws ExecutionException {
		ServicesRegistry registry = null;

		gcmFactory = new GCMFactory2();

		try {
			registry = ServiceUtilsForResource.getInstance().getServiceRegistry(umlResource);
		} catch (ServiceException e1) {
			e1.printStackTrace();
			return;
		}

		transactionalDomain = getTransactionalDomain(registry, umlResource);// TODO Auto-generated method stub

		this.parser = ImporterParserMMBasedFactory.parse(importedFilePath);
		if( parser == null ) {
			System.err.println("Failed to parse file< " + importedFilePath + " > to import !");
			if( importedFilePath.endsWith(".csv") ) {
				System.err.println("!! This import file format is no longer supported !!");
			}
			return;
		}

		this.umlContainer = element.getModel();
		this.editingDomain = EMFHelper.resolveEditingDomain(umlContainer);

// Without progress monitor for best user experience
//		import2UML();

//// To Do extension with progress monitor for best user experience
		final IRunnableWithProgress runnable = new Import2UMLWithProgressMonitor();
	    try {
//	        wizardContainer.run(true, false, runnable);
//	        PlatformUI.getWorkbench().getProgressService().run(true, false, runnable);

//	        wizardContainer.run(false, true, runnable);
	        PlatformUI.getWorkbench().getProgressService().run(false, true, runnable);
	    } catch (InvocationTargetException e) {
	    	e.printStackTrace();
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	/**
	 * create a new bes for a given substation
	 * @param substation the substation that will have a new bus, never null
	 * @param bus_name the name of the new bus, never null
	 * @param bus_id the id of the new bus, never null
	 */
	private void createBus(Class substation, String bus_name, CommonType nominalLevel) {
		nacre.Substation substationSterotype = UMLUtil.getStereotypeApplication(substation, nacre.Substation.class);
		IElementType busElementType = ElementTypeRegistry.getInstance().getElementType(NACREElementTypesEnumerator.BUS);
		CreateElementRequest request = new CreateElementRequest(transactionalDomain, substation,busElementType);
		IElementEditService cmdProvider = ElementEditServiceUtils.getCommandProvider(substation.getModel());
		ICommand createcommandBus = cmdProvider.getEditCommand(request);

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
			SetRequest setRequest = new SetRequest(bus_class,	UMLPackage.eINSTANCE.getNamedElement_Name(), bus_name);
			Stereotype busStereotype = bus_class.getAppliedStereotype("nacre::Bus");
			
			IElementEditService provider2 = ElementEditServiceUtils.getCommandProvider(element);
			ICommand command2 = provider2.getEditCommand(setRequest);
			transactionalDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));
			setPropertiesValues(substationSterotype, "substation", bus_class);
			
			VoltageLevel nacre_nominalLevel = transformVoltageLevelLiterals(nominalLevel.getValue());
			setStereotypePropertiesValues(nacre_nominalLevel, "nominalLevel", bus_class, busStereotype);
			//System.out.println("+--<>create bus "+bus_name);
		}
	}
	
	/**
	 * Transform VoltageLevel enum literals.
	 *
	 * @param int the nominalLevel enum
	 * @return the VoltageLevel enum
	 */
	public static VoltageLevel transformVoltageLevelLiterals(int nominalLevel) {
		switch (nominalLevel) {
		case 20:
			return VoltageLevel._20;
		case 42:
			return VoltageLevel._42;
		case 63:
			return VoltageLevel._63;
		case 90:
			return VoltageLevel._90;
		case 150:
			return VoltageLevel._150;
		case 225:
			return VoltageLevel._225;
		case 380:
			return VoltageLevel._380;
		default:
			return VoltageLevel._63;
		}
	}

	/**
	 * Update information of a created bus.
	 * @param substation the substation that contain the bus , never null
	 * @param bus_name the new name of the bus
	 * @param bus_nominalLevel 
	 * @param bus_id the new bus id
	 * @param the bus index in the collection to change.
	 */
	private Class updateBusInformation(Class substation, String bus_name, int busIndex, CommonType bus_nominalLevel) {
		Class bus = (Class) substation.getNestedClassifiers().get(busIndex);

		SetRequest setRequest = new SetRequest(bus,
				UMLPackage.eINSTANCE.getNamedElement_Name(), bus_name);
		IElementEditService provider2 = ElementEditServiceUtils.getCommandProvider(element);
		ICommand command2 = provider2.getEditCommand(setRequest);
		transactionalDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));
		VoltageLevel nacre_nominalLevel = transformVoltageLevelLiterals(bus_nominalLevel.getValue());
		Stereotype busStereotype = bus.getAppliedStereotype("nacre::Bus");
		setStereotypePropertiesValues(nacre_nominalLevel, "nominalLevel", bus, busStereotype);
		//System.out.println("+--<>update bus "+bus_name);
		return bus;
	}


	/**
	 * Creates the services registry.
	 *
	 * @return the services registry
	 */
	protected ServicesRegistry createServicesRegistry() {

		ServicesRegistry result = null;

		try {
			result = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		} catch (ServiceException e) {
			// couldn't create the registry? Fatal problem
			e.printStackTrace();
		}

		try {
			// have to create the model set and populate it with the DI model
			// before initializing other services that actually need the DI
			// model, such as the SashModel Manager service
			result.startServicesByClassKeys(ModelSet.class);

		} catch (ServiceException ex) {
			// Ignore this exception: some services may not have been loaded,
			// which is probably normal at this point
		}

		return result;
	}

	/**
	 * Inits the services registry.
	 *
	 * @param registry the registry
	 * @throws ServiceException the service exception
	 */
	protected void initServicesRegistry(ServicesRegistry registry) throws ServiceException {
		try {
			registry.startRegistry();
		} catch (ServiceException ex) {
			// Ignore this exception: some services may not have been loaded,
			// which is probably normal at this point
		}

		registry.getService(ModelSet.class);
	}

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
			URI uri = resource.getURI();
			this.umlResource = modelSet.getResource(uri, true);
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}

		return domain;
	}

	private void setStereotypePropertiesValues(Object value, String att_name, Element target, Stereotype stereotype) {
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(transactionalDomain,
				"Setting Sterteotype Propeties Value"); //$NON-NLS-1$

		if (value != null) {
			final Object getsrcValue = value;
			// Object sourceValue = StereotypeUtil.displayPropertyValue(stereotype,
			// property, target, "");
			AbstractTransactionalCommand c = new AbstractTransactionalCommand(transactionalDomain, att_name, null) {

				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
						throws ExecutionException {
					if (target != null && stereotype!=null) {
						
						target.setValue(stereotype, att_name, getsrcValue);
					}
					return CommandResult.newOKCommandResult();
				}
			};

			command.add(c);
		}


		// execute command
		if (command != null && command.canExecute()) {
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void setPropertiesValues(Object value, String att_name, Element target) {
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(transactionalDomain,
				"Setting Sterteotype Propeties Value"); //$NON-NLS-1$

		if (value != null) {
			final Object getsrcValue = value;
			// Object sourceValue = StereotypeUtil.displayPropertyValue(stereotype,
			// property, target, "");
			AbstractTransactionalCommand c = new AbstractTransactionalCommand(transactionalDomain, att_name, null) {

				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
						throws ExecutionException {
					if (target != null) {
						Stereotype stereotype = null;
						if (target != null && target.getAppliedStereotypes() != null
								&& !target.getAppliedStereotypes().isEmpty()) {
							stereotype = target.getAppliedStereotypes().get(0);
						}
						target.setValue(stereotype, att_name, getsrcValue);
					}
					return CommandResult.newOKCommandResult();
				}
			};

			command.add(c);
		}


		// execute command
		if (command != null && command.canExecute()) {
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}




}
