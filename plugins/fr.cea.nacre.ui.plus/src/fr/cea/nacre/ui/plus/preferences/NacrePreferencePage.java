package fr.cea.nacre.ui.plus.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import fr.cea.nacre.ui.plus.Activator;

public class NacrePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{


	public NacrePreferencePage() {
	}
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, Activator.NACRE_PREFERENCE_ID));
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(Activator.LOCAL_CONTROLLER_PREFERENCE, 
				PreferenceMessages.local_controller, 
				//SWT.NONE, 
				getFieldEditorParent())); 

		addField(new StringFieldEditor(Activator.ZONAL_CONTROLLER_PREFERENCE, 
				PreferenceMessages.zonal_controller, 
				//SWT.NONE, 
				getFieldEditorParent())); 

		addField(new StringFieldEditor(Activator.GENERATOR_PREFERENCE, 
				PreferenceMessages.generator, 
				//SWT.NONE, 
				getFieldEditorParent())); 

		addField(new StringFieldEditor(Activator.BATTERY_PREFERENCE, 
				PreferenceMessages.battery, 
				//SWT.NONE, 
				getFieldEditorParent())); 

		addField(new StringFieldEditor(Activator.COMMUNICATION_LATENCY_PREFERENCE, 
				PreferenceMessages.communicationlatency, 
				//SWT.NONE, 
				getFieldEditorParent())); 

		addField(new StringFieldEditor(Activator.COMMUNICATION_CAPACITY__PREFERENCE, 
				PreferenceMessages.communicationcapacity, 
				//SWT.NONE, 
				getFieldEditorParent())); 
		addField(new StringFieldEditor(Activator.SR_ACTIVATION_PERIODE__PREFERENCE, 
				PreferenceMessages.activation_periode, 
				//SWT.NONE, 
				getFieldEditorParent())); 
		/*
		//composite_textField << parent
		Composite composite_textField = createComposite(parent, 2);
		Label label_textField = createLabel(composite_textField, MessageUtil.getString("Text_Field"));	 
		textField = createTextField(composite_textField);
		pushButton_textField = createPushButton(composite_textField, MessageUtil.getString("Change")); 

		//composite_tab << parent
		Composite composite_tab = createComposite(parent, 2);
		Label label1 = createLabel(composite_tab, MessageUtil.getString("Radio_Button_Options")); 
		 */
	}

	/**
	 * Performs special processing when this page's Restore Defaults button has 
	 * been pressed.
	 * Sets the contents of the fields to the default values in the preference
	 * store.
	 */
	/*
	protected void performDefaults() {
		colorEditor.loadDefault();
		//StringFieldEditor 
	}
	 */
	/** 
	 * Method declared on IPreferencePage. Save the
	 * preference to the preference store.
	 */
	/*
	public boolean performOk() {
		colorEditor.store();
		return super.performOk();
	}

	 */
}
