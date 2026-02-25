package fr.cea.nacre.ui.plus.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;
import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.Bus;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.Generator;
import fr.cea.nacre.model.NACREMM.cfa.Load;
import fr.cea.nacre.model.NACREMM.cfa.PowerType;
import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.Zone;
import fr.cea.nacre.model.study.Manifest;
import fr.cea.nacre.model.study.UsingDirectives;
import fr.cea.nacre.ui.plus.Activator;
import fr.cea.nacre.ui.plus.parser.deserializer.BatteryDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.BusDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.CommonTypeDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.ControllerDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.DeserializationExclusionStrategy;
import fr.cea.nacre.ui.plus.parser.deserializer.GeneratorDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.LoadDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.RteInstallationDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.SubstationDeserializer;
import fr.cea.nacre.ui.plus.parser.deserializer.ZoneDeserializer;

public class GCMParserMMBased {

	public class JsonResult {

		private Manifest manifest;

		private UsingDirectives using;

		private fr.cea.nacre.model.NACREMM.cfa.Zone zone;

		private List<fr.cea.nacre.model.NACREMM.cfa.Substation> substations;

		public Manifest getManifest() {
			return manifest;
		}

		public void setManifest(Manifest manifest) {
			this.manifest = manifest;
		}

		public UsingDirectives getUsing() {
			return using;
		}

		public void setUsing(UsingDirectives using) {
			this.using = using;
		}


		public fr.cea.nacre.model.NACREMM.cfa.Zone getZone() {
			return zone;
		}

		public void setZone(fr.cea.nacre.model.NACREMM.cfa.Zone zone) {
			this.zone = zone;
		}

		public List<fr.cea.nacre.model.NACREMM.cfa.Substation> getSubstation() {
			return substations;
		}

		public void setSubstation(List<fr.cea.nacre.model.NACREMM.cfa.Substation> substations) {
			this.substations = substations;
		}


		@Override
		public String toString() {
			String manifestStr = (manifest == null) ? "" : "\n\t" + manifest;
			String usingtStr = (using == null) ? "" : "\n\t" + using;

			String subStr = (substations == null) ? "" :
				"\n\t" + substations.stream().map(fr.cea.nacre.model.NACREMM.cfa.Substation::toString).
				collect(Collectors.joining("\n\t"));

			return "JsonResult {\nmanifest=" + manifestStr
					+ usingtStr + "\n" + zone + subStr + "]";
		}
	}


	public List<fr.cea.nacre.model.NACREMM.cfa.Substation> substations = new ArrayList<>();

	public void parse(String importedFilePath) {
		FileReader reader = null;
		try {
			reader = new FileReader(importedFilePath);
		} catch (FileNotFoundException e) {
			Activator.log.error(e);
			return;
		}

		JsonElement jsonElement = JsonParser.parseReader(reader);

		//		GsonBuilder builder = new GsonBuilder();
		//		builder.disableHtmlEscaping().setPrettyPrinting();
		//		Gson gsonPrettyPrinting = builder.create();
		//		String prettyJsonString = gsonPrettyPrinting.toJson(jsonElement);
		//		System.out.println(prettyJsonString);

		GsonBuilder gsonBuilder = new GsonBuilder();
		//because of EMF we create specific deserializer to create element impl + managment of collection
		gsonBuilder.registerTypeAdapter(Zone.class, new ZoneDeserializer());
		gsonBuilder.registerTypeAdapter(Controller.class, new ControllerDeserializer());
		gsonBuilder.registerTypeAdapter(Bus.class, new BusDeserializer());
		gsonBuilder.registerTypeAdapter(Battery.class, new BatteryDeserializer());
		gsonBuilder.registerTypeAdapter(Generator.class, new GeneratorDeserializer());
		gsonBuilder.registerTypeAdapter(Load.class, new LoadDeserializer());
		gsonBuilder.registerTypeAdapter(RteInstallation.class, new RteInstallationDeserializer());
		gsonBuilder.registerTypeAdapter(Substation.class, new SubstationDeserializer());
		gsonBuilder.registerTypeAdapter(CommonType.class, new CommonTypeDeserializer());
		gsonBuilder.registerTypeAdapter(PowerType.class, new PowerTypeDeserializer());
		gsonBuilder.addDeserializationExclusionStrategy(new DeserializationExclusionStrategy());
		Gson gson =gsonBuilder.create();
		JsonResult jsonResult = gson.fromJson(jsonElement, JsonResult.class);

		System.out.println(jsonResult);

		List<fr.cea.nacre.model.NACREMM.cfa.Substation> importedSubstations = jsonResult.getSubstation();
		if( importedSubstations != null ) {
			substations.addAll(importedSubstations);
		}

		fr.cea.nacre.model.NACREMM.cfa.Zone zone = jsonResult.getZone();
		if( zone != null ) {
			importedSubstations = zone.getSubstations();
			if( importedSubstations != null ) {
				substations.addAll(importedSubstations);
			}
		}

		//substations.addAll(jsonResult.getZone().getSubstation());
	}

	public List<fr.cea.nacre.model.NACREMM.cfa.Substation> getSubstations() {
		return substations;
	}

}
