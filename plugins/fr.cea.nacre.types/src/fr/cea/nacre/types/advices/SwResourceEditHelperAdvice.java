package fr.cea.nacre.types.advices;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.uml.types.core.commands.ApplyStereotypeCommand;
import org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice;
import org.eclipse.papyrus.uml.types.core.requests.ApplyStereotypeRequest;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

import fr.cea.nacre.types.advices.command.SetValueSwResourcesCommand;

public class SwResourceEditHelperAdvice extends DefaultUMLEditHelperAdvice {
	public static final String NACRE_PREFERENCE_ID = "fr.cea.nacre.ui.plus.preferences";

	@Override
	protected ICommand getAfterApplyStereotypeCommand(ApplyStereotypeRequest req) {

		if (req.getStereotype().getName().equals(SwSchedulableResource.class.getSimpleName())) {
			ScopedPreferenceStore scopedPreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
					NACRE_PREFERENCE_ID);
			String period = scopedPreferenceStore
					.getString("fr.cea.nacre.ui.plus.definedefaultvalues.sractivationperiode");
			ICompositeCommand compositecommand = new CompositeCommand("command");
			SetValueSwResourcesCommand cmd = new SetValueSwResourcesCommand(req.getUmlElement(), req, period);
			compositecommand.add(cmd);

			Element umlElement = req.getUmlElement();
			EObject container = req.getUmlElement().eContainer();

			if (container != null && container instanceof Element) {
				Stereotype stereotype = umlElement
						.getApplicableStereotype("MARTE::MARTE_Foundations::GRM::ResourceUsage");
				if (!(umlElement.getAppliedStereotypes().contains(stereotype))) {
					ApplyStereotypeRequest req2 = new ApplyStereotypeRequest(umlElement, stereotype,
							req.getEditingDomain());
					ApplyStereotypeCommand cmd2 = new ApplyStereotypeCommand(req2, req.getEditingDomain(), "Apply");
					compositecommand.add(cmd2);
				}
			}

			return compositecommand;
		}

		return super.getAfterApplyStereotypeCommand(req);
	}

}
