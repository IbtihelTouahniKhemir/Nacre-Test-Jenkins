package fr.cea.nacre.ui.plus.preferences;

import org.eclipse.osgi.util.NLS;

public class PreferenceMessages extends NLS {


	private static final String CLASS_NAME = "fr.cea.nacre.ui.plus.preferences.preferencemessages"; //$NON-NLS-1$

	public static String local_controller;

	public static String zonal_controller;

	public static String generator;
	
	public static String battery;

	public static String communicationcapacity;

	public static String communicationlatency;
	
	public static String activation_periode;

	static {
		
		NLS.initializeMessages(CLASS_NAME, PreferenceMessages.class);
	}

	private PreferenceMessages() {
	}
}