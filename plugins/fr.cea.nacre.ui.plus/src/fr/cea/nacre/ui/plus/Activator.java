package fr.cea.nacre.ui.plus;

import org.eclipse.core.runtime.Plugin;
//import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.core.log.LogHelper;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.cea.nacre.ui.plus.preferences.NacrePrefInitializer;

public class Activator extends AbstractUIPlugin implements IStartup{
	// The plug-in ID
		public static final String PLUGIN_ID = "fr.cea.nacre.ui.plus"; //$NON-NLS-1$

		// The shared instance
		private static Activator plugin;

		public static LogHelper log;

		/**
		 * Storage for preferences.
		 */
		//protected IPreferenceStore papyrusPreferenceStore;
		public static final String NACRE_PREFERENCE_ID="fr.cea.nacre.ui.plus.preferences";

		//The identifiers for the preferences
		public static final String LOCAL_CONTROLLER_PREFERENCE =
			"fr.cea.nacre.ui.plus.definedefaultvalues.localcontroller";
		public static final String ZONAL_CONTROLLER_PREFERENCE =
			"fr.cea.nacre.ui.plus.definedefaultvalues.zonalcontroller";
		public static final String GENERATOR_PREFERENCE =
			"fr.cea.nacre.ui.plus.definedefaultvalues.generator";
		public static final String BATTERY_PREFERENCE =
			"fr.cea.nacre.ui.plus.definedefaultvalues.battery";
		public static final String COMMUNICATION_LATENCY_PREFERENCE =
			"fr.cea.nacre.ui.plus.definedefaultvalues.communicationlatency";
		public static final String COMMUNICATION_CAPACITY__PREFERENCE =
				"fr.cea.nacre.ui.plus.definedefaultvalues.communicationcapacity";
		public static final String SR_ACTIVATION_PERIODE__PREFERENCE =
				"fr.cea.nacre.ui.plus.definedefaultvalues.sractivationperiode";

		//The default values for the preferences
		public static final String DEFAULT_LOCAL_CONTROLLER_PREFERENCE = "10";
		public static final String DEFAULT_ZONAL_CONTROLLER_PREFERENCE = "15";
		public static final String DEFAULT_GENERATOR_PREFERENCE = "45,s";
		public static final String DEFAULT_BATTERY_PREFERENCE = "1,s";
		public static final String DEFAULT_COMMUNICATION_LATENCY_PREFERENCE = "30,ms";
		public static final String DEFAULT_COMMUNICATION_CAPACITY_PREFERENCE = "250,kb/s";
		public static final String DEFAULT_SR_ACTIVATION_PERIODE__PREFERENCE = "periodic(period=15, jitter=0)";
		  

		/**
		 * The constructor
		 */
		public Activator() {
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			System.out.println("Hello fr.cea.nacre.ui.plus runs");
			super.start(context);
			plugin = this;
			log = new LogHelper(this);
			new NacrePrefInitializer().initializeDefaultPreferences();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			plugin = null;
			super.stop(context);
		}

		/**
		 * Returns the shared instance
		 *
		 * @return the shared instance
		 */
		public static Activator getDefault() {
			return plugin;
		}

		public static Plugin getInstance() {
			return plugin;
		}

		@Override
		public void earlyStartup() {
			// TODO Auto-generated method stub

		}


	}

