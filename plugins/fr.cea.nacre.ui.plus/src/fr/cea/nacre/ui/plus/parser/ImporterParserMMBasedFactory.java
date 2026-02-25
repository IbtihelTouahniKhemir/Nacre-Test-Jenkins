package fr.cea.nacre.ui.plus.parser;

public class ImporterParserMMBasedFactory {

	public static GCMParserMMBased parse(String importedFilePath) {
		if( importedFilePath.endsWith(".csv") ) {
			System.err.println("!! This import file format is no longer supported !!");
			return null;
		}
		else if( importedFilePath.endsWith(".json") || importedFilePath.endsWith(".gcm") ){
			GCMParserMMBased jsonParser = new GCMParserMMBased();
			jsonParser.parse(importedFilePath);
			return jsonParser;
		}
		
		return null;
	}

}
