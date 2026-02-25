package fr.cea.nacre.types.advices;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice;
import org.eclipse.papyrus.uml.types.core.requests.ApplyStereotypeRequest;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import fr.cea.nacre.types.advices.command.SetValueCommunicationMediaCommand;

public class  CommunicationMediaAdvice extends DefaultUMLEditHelperAdvice {
	//this constant have been duplicated to avoid a circle dependencies
	public static final String NACRE_PREFERENCE_ID="fr.cea.nacre.ui.plus.preferences";
	public static final String COMMUNICATION_LATENCY_PREFERENCE ="fr.cea.nacre.ui.plus.definedefaultvalues.communicationlatency";
	public static final String COMMUNICATION_CAPACITY__PREFERENCE =	"fr.cea.nacre.ui.plus.definedefaultvalues.communicationcapacity";

@Override
protected ICommand getAfterApplyStereotypeCommand(ApplyStereotypeRequest req) {
	if(req.getStereotype().getName().equals(CommunicationMedia.class.getSimpleName())) {
		 ScopedPreferenceStore scopedPreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,NACRE_PREFERENCE_ID);
		 String latency = scopedPreferenceStore.getString(COMMUNICATION_LATENCY_PREFERENCE);
		 String capacity = scopedPreferenceStore.getString(COMMUNICATION_CAPACITY__PREFERENCE);
		 SetValueCommunicationMediaCommand cmd= new SetValueCommunicationMediaCommand(req.getUmlElement(), req, latency, capacity);
		return cmd;

	}
	return super.getAfterApplyStereotypeCommand(req);
}

}
