package fr.cea.nacre.ui.plus.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {


	private static final String CLASS_NAME = "fr.cea.nacre.ui.plus.wizards.messages"; //$NON-NLS-1$

	public static String ImportFilePage_SelectTheFileToImport;

	public static String Import_CSV_File;
	
	public static String Import_IIDM_File;
	
	public static String ImportFileWizard_ImportFile;
	
	public static String ImportFileWizard_ImportIDDMFile;

	static {
		
		NLS.initializeMessages(CLASS_NAME, Messages.class);
	}

	private Messages() {
	}
}
