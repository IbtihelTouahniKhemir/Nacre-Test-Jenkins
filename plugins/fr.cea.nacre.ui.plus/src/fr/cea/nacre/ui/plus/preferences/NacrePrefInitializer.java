package fr.cea.nacre.ui.plus.preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import fr.cea.nacre.ui.plus.Activator;

/**
 * The purpose of this class is to initialize the preferences of NACRE.
 */
public class NacrePrefInitializer extends AbstractPreferenceInitializer {

    public NacrePrefInitializer() {
    }

    @Override
    public void initializeDefaultPreferences() {
        ScopedPreferenceStore scopedPreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, Activator.NACRE_PREFERENCE_ID);
        scopedPreferenceStore.setDefault(Activator.LOCAL_CONTROLLER_PREFERENCE, Activator.DEFAULT_LOCAL_CONTROLLER_PREFERENCE);
        scopedPreferenceStore.setDefault(Activator.ZONAL_CONTROLLER_PREFERENCE, Activator.DEFAULT_ZONAL_CONTROLLER_PREFERENCE);
        scopedPreferenceStore.setDefault(Activator.GENERATOR_PREFERENCE, Activator.DEFAULT_GENERATOR_PREFERENCE);
        scopedPreferenceStore.setDefault(Activator.BATTERY_PREFERENCE, Activator.DEFAULT_BATTERY_PREFERENCE);
        scopedPreferenceStore.setDefault(Activator.COMMUNICATION_LATENCY_PREFERENCE, Activator.DEFAULT_COMMUNICATION_LATENCY_PREFERENCE);
        scopedPreferenceStore.setDefault(Activator.COMMUNICATION_CAPACITY__PREFERENCE, Activator.DEFAULT_COMMUNICATION_CAPACITY_PREFERENCE);
        scopedPreferenceStore.setDefault(Activator.SR_ACTIVATION_PERIODE__PREFERENCE, Activator.DEFAULT_SR_ACTIVATION_PERIODE__PREFERENCE);
    }

}