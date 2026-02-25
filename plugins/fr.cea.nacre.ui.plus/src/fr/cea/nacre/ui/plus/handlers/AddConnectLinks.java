package fr.cea.nacre.ui.plus.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
//import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.util.ServiceUtilsForHandlers;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.AbstractionRegistry;
import fr.cea.nacre.model.NACREModelHelper;
import fr.cea.nacre.ui.plus.command.ConnectLinksCommand;
import nacre.CRA;
import nacre.CommunicationMedias;
import nacre.Connect;

public class AddConnectLinks extends CmdHandler {

	private TransactionalEditingDomain transactionalEditingDomain;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		EObject eo = EMFHelper.getEObject(selection.getFirstElement());
		try {
			transactionalEditingDomain =ServiceUtilsForHandlers.getInstance().getService(org.eclipse.emf.transaction.TransactionalEditingDomain.class, event);
		} catch (Exception e) {
			System.err.println("impossible to get the Transactional Editing Domain "+e);
		}

		// get the container for the current element
		if (eo instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class communicationMedia_BaseClass=	(org.eclipse.uml2.uml.Class)eo;

			CommunicationMedia communicationMediaAS=UMLUtil.getStereotypeApplication(communicationMedia_BaseClass, CommunicationMedia.class); 
			if( communicationMediaAS!=null) {
				// look for CRA model
				org.eclipse.uml2.uml.Package communicationPackage= communicationMedia_BaseClass.getNearestPackage();
				if(UMLUtil.getStereotypeApplication(communicationPackage, CommunicationMedias.class)!=null){
					NACREModelHelper helper = new NACREModelHelper();
					org.eclipse.uml2.uml.Package CRA_package= (org.eclipse.uml2.uml.Package)communicationPackage.getOwner();
					if(UMLUtil.getStereotypeApplication(CRA_package, CRA.class)!=null){

						org.eclipse.uml2.uml.Package computingResource_Package=helper.getorCreateComputingResources(CRA_package);

						org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector referenceSelector = new org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector(true);
						referenceSelector.setContentProvider(new org.eclipse.papyrus.infra.widgets.providers.AbstractStaticContentProvider() {
							public Object[] getElements() {
								List<Object> tmp = new ArrayList<>();
								for (PackageableElement potentialCR : computingResource_Package.getPackagedElements()) {
									if(potentialCR instanceof org.eclipse.uml2.uml.Class) {
										if( !helper.isCRConnectedToCM(communicationMedia_BaseClass, potentialCR)){
											if(! tmp.contains(potentialCR)) {
												tmp.add(potentialCR);}
										}
									}
								}
								return tmp.toArray();
							}
						});
						referenceSelector.setLabelProvider(new UMLLabelProvider());
						org.eclipse.papyrus.infra.widgets.editors.MultipleValueSelectionDialog dialog = new org.eclipse.papyrus.infra.widgets.editors.MultipleValueSelectionDialog(new Shell(), referenceSelector);
						dialog.setLabelProvider(new UMLLabelProvider());
						dialog.setContextElement(computingResource_Package);
						dialog.setTitle("Choose ComputingResources to connect");
						if(dialog.open() == org.eclipse.jface.window.Window.OK) {
							ConnectLinksCommand cmd= new ConnectLinksCommand(transactionalEditingDomain,communicationMedia_BaseClass, dialog.getResult());
							transactionalEditingDomain.getCommandStack().execute(cmd);

						}
					}
				}
			}
		}

		return null;
	}

	/**
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
	 * 
	 * @return
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		if( selectedEObject instanceof Element) {
			Element element= (Element) selectedEObject;
			if (UMLUtil.getStereotypeApplication(element, CommunicationMedia.class)!=null) {
				return true;
			}

		}
		return false;
	}


}