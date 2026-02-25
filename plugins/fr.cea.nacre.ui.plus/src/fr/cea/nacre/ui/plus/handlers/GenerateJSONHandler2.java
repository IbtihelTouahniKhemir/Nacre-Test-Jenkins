package fr.cea.nacre.ui.plus.handlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
//import java.util.Map;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.validation.IPapyrusDiagnostician;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.infra.services.validation.internal.ValidationRegistry;
import org.eclipse.papyrus.infra.services.validation.internal.ValidationRegistry.HookType;
import org.eclipse.papyrus.infra.ui.util.ServiceUtilsForHandlers;
//import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
//import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
//import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
//import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import fr.cea.nacre.model.NACREMM.study.StudyFactory;
import fr.cea.nacre.model.UMLtoMM.MyExclusionStrategy;
//import fr.cea.nacre.model.UMLtoMM.UMLtoCRAMMjob;
import fr.cea.nacre.model.UMLtoMM.UMLtoNacreMMJob;
import fr.cea.nacre.model.factory.GCMFactory2;
import fr.cea.nacre.ui.plus.command.ReorganizeModelCommand;

public class GenerateJSONHandler2 extends CmdHandler {

	protected static String jsonExt = "json";
	protected GCMFactory2 gcmFactory ;

	protected IProject project;
	protected Class UML_mainGrid;
	protected UMLtoNacreMMJob transformer;
	private TransactionalEditingDomain transactionalEditingDomain;

	//	Map<Object, String> gcm_cra_Map = new HashMap<>();


	//	protected static String fullyQualifiedNameOf(NamedElement element, String separator) {
	//		List<String> fullNames = new LinkedList<>();
	//		fullNames.add(element.getName());
	//		EObject container = element.eContainer();
	//		while (container instanceof NamedElement) {
	//			fullNames.add(0, ((NamedElement) container).getName());
	//			container = container.eContainer();
	//		}
	//
	//		String fullyQualifiedName = String.join(separator, fullNames);
	//
	//		System.out.println("UML->qualifiedName : " + element.getQualifiedName());
	//		System.out.println("fullyQualifiedName : " + fullyQualifiedName);
	//
	//		return fullyQualifiedName;
	//	}

	protected class GenerateJSONWithProgressMonitor implements IRunnableWithProgress {
		@Override
		public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {


			final int totalWork = 100;
			int taskProgress = 0;
			monitor.beginTask("Generate GCM for Study "
					+ transformer.getStudy().getName() + " ...", totalWork);

			fr.cea.nacre.model.factory.JsonResult jsonResult = gcmFactory.getJsonResult();

			fr.cea.nacre.model.NACREMM.study.Manifest manifest = StudyFactory.eINSTANCE.createManifest();
			//			manifest.setVersion(3);
			//			manifest.setDescription("Use JSON path as reference and Matpower-case data"
			manifest.setVersion(3);
			manifest.setDescription("Use 'gcm_uid' as reference without Matpower-case data");
			manifest.setService("Modeling zones");
			manifest.setType("Model");
			jsonResult.setManifest(manifest);

			//			String IntermediateResult = null;

			// 30 % of total work : Parsing end !
			taskProgress += 10;
			monitor.worked(taskProgress);

			monitor.subTask("Build GCM : CFA + CRA + CFRA + HAZARD");

			// To Do extension with progress monitor for best user experience
			//			transformer.construct(monitor);
			transformer.construct();

			taskProgress += 60;
			monitor.worked(taskProgress);

			jsonResult.setStudy(transformer.getStudy());

			monitor.subTask("Prepare the references uid for all CRAS components");

			/*******************************************************
			 * dump json file
			 *******************************************************/
			taskProgress += 10;
			monitor.worked(taskProgress);
			monitor.subTask("Dump json file ...");

			String jsonfileName = "";
			if (UML_mainGrid.getPackage().getName() != null) {
				jsonfileName = "GCM_" + UML_mainGrid.getModel().getName().replace(" ", "")
						+ "." + jsonExt;
			} else {
				jsonfileName = "GCM." + jsonExt;
			}


			GsonBuilder EMFbuilder = new GsonBuilder();
			EMFbuilder.addSerializationExclusionStrategy(new MyExclusionStrategy());

			String finalResult = EMFbuilder.create().toJson(jsonResult.getData());
			GsonBuilder builder = new GsonBuilder();
			builder.disableHtmlEscaping().setPrettyPrinting();
			Gson gsonPrettyPrinting = builder.create();
			JsonElement jsonElement = JsonParser.parseString(finalResult);
			String prettyJsonString = gsonPrettyPrinting.toJson(jsonElement);

			IFile file = project.getFile(jsonfileName); // such as file.exists() == false
			File myfile = new File(file.getLocationURI());

			taskProgress += 10;
			monitor.worked(taskProgress);
			monitor.subTask("Dump json file done");

			generateFile(prettyJsonString, myfile, project);

			try {
				project.refreshLocal(0, new NullProgressMonitor());
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
			taskProgress += 10;
			monitor.worked(taskProgress);

			/**********************************************************************************************/
			monitor.done();
		}
	}


	public static String generateJSON(GCMFactory2 gcmFactory, UMLtoNacreMMJob transformer, Class UML_mainGrid,  IProject project ) {
		fr.cea.nacre.model.factory.JsonResult jsonResult = gcmFactory.getJsonResult();

		fr.cea.nacre.model.NACREMM.study.Manifest manifest = StudyFactory.eINSTANCE.createManifest();
		//		manifest.setVersion(3);
		//		manifest.setDescription("Use JSON path as reference and Matpower-case data"
		manifest.setVersion(3);
		manifest.setDescription("Use 'gcm_uid' as reference without Matpower-case data");
		manifest.setService("Modeling zones");
		manifest.setType("Model");
		jsonResult.setManifest(manifest);

		//		String IntermediateResult = null;
		if( transformer.getStudy().getCfa()==null) {
			transformer.construct();
		}

		jsonResult.setStudy(transformer.getStudy());

		/*******************************************************
		 * dump json file
		 ************************************************************/

		String jsonfileName = "";
		if (UML_mainGrid.getPackage().getName() != null) {
			jsonfileName = "GCM_" + UML_mainGrid.getModel().getName().replace(" ", "") + "."
					+ jsonExt;
		} else
			jsonfileName = "GCM." + jsonExt;


		GsonBuilder EMFbuilder = new GsonBuilder();
		EMFbuilder.addSerializationExclusionStrategy(new MyExclusionStrategy());

		String finalResult = EMFbuilder.create().toJson(jsonResult.getData());
		GsonBuilder builder = new GsonBuilder();
		builder.disableHtmlEscaping().setPrettyPrinting();
		Gson gsonPrettyPrinting = builder.create();
		JsonElement jsonElement = JsonParser.parseString(finalResult);
		String prettyJsonString = gsonPrettyPrinting.toJson(jsonElement);
		saveInProject(jsonfileName, prettyJsonString, project);
		return prettyJsonString;

	}

	/** generate content inside file in Eclipse project**/
	protected static void saveInProject(String jsonfileName, String prettyJsonString, IProject project) {
		if( project!=null) {
			IFile file = project.getFile(jsonfileName); // such as file.exists() == false
			File myfile = new File(file.getLocationURI());

			generateFile(prettyJsonString, myfile, project);

			try {
				project.refreshLocal(0, new NullProgressMonitor());
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (this.selectedEObject instanceof Class) {
			this.project = getCurrentProject();
			this.UML_mainGrid = (Class) this.selectedEObject;

			try {
				transactionalEditingDomain =ServiceUtilsForHandlers.getInstance().getService(org.eclipse.emf.transaction.TransactionalEditingDomain.class, event);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			transactionalEditingDomain.getCommandStack().execute(new ReorganizeModelCommand(transactionalEditingDomain, selectedEObject));
			//validation
			if(!isValideModel()) {
				return null;
			}

			if (this.project != null) {
				String studyName = this.project.getName();

				this.transformer = new UMLtoNacreMMJob(studyName, this.UML_mainGrid);

				this.gcmFactory = new GCMFactory2();

				generateJSON(gcmFactory, transformer,this.UML_mainGrid, project );

				// To Do extension with progress monitor for best user experience
				//				final GenerateJSONWithProgressMonitor runnable = new GenerateJSONWithProgressMonitor();
				//
				//				try {
				////					wcontainer.run(true, false, runnable);
				////					PlatformUI.getWorkbench().getProgressService().run(true, false, runnable);
				//
				////					wcontainer.run(false, true, runnable);
				//					PlatformUI.getWorkbench().getProgressService().run(false, true, runnable);
				//				} catch (InvocationTargetException e) {
				//					e.printStackTrace();
				//				} catch (InterruptedException e) {
				//					e.printStackTrace();
				//				}
			}
		}

		return null;
	}


	private boolean isValideModel() {
		
//		ValidationRegistry.executeHooks(this.UML_mainGrid.getModel(), HookType.BEFORE);
//		
//		IPapyrusDiagnostician diagnostician = ValidationRegistry.getDiagnostician(this.UML_mainGrid.getModel());
//		
//		AdapterFactory adapterFactory = transactionalEditingDomain instanceof AdapterFactoryEditingDomain ? ((AdapterFactoryEditingDomain) transactionalEditingDomain).getAdapterFactory() : null;
//		diagnostician.initialize(adapterFactory, new NullProgressMonitor());
//		BasicDiagnostic diagnostic = diagnostician.createDefaultDiagnostic(this.UML_mainGrid.getModel());
//		Map<Object, Object> context = diagnostician.createDefaultContext();
//
//		diagnostician.validate(this.UML_mainGrid.getModel(), diagnostic, context);
//		System.err.println(diagnostic);
//		ValidationRegistry.executeHooks(this.UML_mainGrid.getModel(), HookType.AFTER);
		
		ValidateModelCommand command = new ValidateModelCommand(this.UML_mainGrid.getModel());
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		try {
			command.execute(null, null);
			if (command.getDiagnostic().getSeverity()==Diagnostic.ERROR) {
				MessageBox dialog =  new MessageBox(shell, SWT.ERROR | SWT.OK);
				dialog.setText("Model not Valid");
				dialog.setMessage("The model is not valid, the GCM is not generated, Please fix Validation Errors displayed in the Model Validation View and then regenerate the GCM");

				// open dialog and await user selection
				dialog.open();
				return false;
			}
			else {
					MessageBox dialog =  new MessageBox(shell, SWT.OK | SWT.OK);
					dialog.setText("Model Valid");
					dialog.setMessage("The model is valid, the GCM is generated in the Nacre Project");

					// open dialog and await user selection
					dialog.open();
			}
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;

	}

	private static void generateFile(String text, File file, IProject project) {

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				bw.write(text);
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			project.refreshLocal(IResource.DEPTH_ONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}


	private IProject getCurrentProject() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		URI uri = selectedEObject.eResource().getURI();
		IProject project = root.getProject(uri.segment(1));
		return project;
	}

	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		return (selectedEObject instanceof Package || selectedEObject instanceof Classifier);
	}


	// To Do : delete when cleaning the code
	//	private static List<String> format(List<String> result) {
	//
	//		List<String> formattedResults = new ArrayList<>();
	//		if (result != null) {
	//			for (String resultitem : result) {
	//				String formattedResult = resultitem;
	//				formattedResult = resultitem.replace('$', '#');
	//				formattedResult = formattedResult.replace("[", "/");
	//				formattedResult = formattedResult.replace("'", "");
	//				formattedResult = formattedResult.replace("]", "");
	//				formattedResults.add(formattedResult);
	//			}
	//		}
	//		return formattedResults;
	//	}
}
