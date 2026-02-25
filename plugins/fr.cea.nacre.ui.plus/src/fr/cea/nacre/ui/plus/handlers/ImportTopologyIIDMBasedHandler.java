package fr.cea.nacre.ui.plus.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PackageableElement;

import fr.cea.nacre.ui.plus.wizards.ImportCSVWizardIDMBased;

public class ImportTopologyIIDMBasedHandler extends CmdHandler {

	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		return (selectedEObject instanceof Package || selectedEObject instanceof Classifier);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {



		if (selectedEObject instanceof PackageableElement) {
			PackageableElement packageableElement = (PackageableElement) selectedEObject;

			IProject project = getCurrentProject();
			if (project != null) {
				// get the container for the current element
				if (packageableElement instanceof Classifier) {
					Classifier classifier = (Classifier) packageableElement;
					try {
						// Create import CSV wizard
						final ImportCSVWizardIDMBased csvWiz =
								new ImportCSVWizardIDMBased( (Class) classifier);

						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								IWorkbench wb = PlatformUI.getWorkbench();

								Shell shell = wb.getActiveWorkbenchWindow().getShell();
								WizardDialog dialog = new WizardDialog(shell, csvWiz);
								dialog.create();
								dialog.open();

								
								// Naturally reiorganize model after import
								ReorganizeModelHandler reorganizeModelHandler =
										new ReorganizeModelHandler();
								try {
									reorganizeModelHandler.execute(event);
								}
								catch (ExecutionException e) {
									e.printStackTrace();
								}
							}
						});
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}

			}


		}
		return null;
	}

	private IProject getCurrentProject() {
		// TODO Auto-generated method stub
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		URI uri = selectedEObject.eResource().getURI();
		IProject project = root.getProject(uri.segment(1));
		return project;
	}
}