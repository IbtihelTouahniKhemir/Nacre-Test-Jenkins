package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.Bus;
import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Generator;
import fr.cea.nacre.model.NACREMM.cfa.Load;
import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;
import fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl;

public class BusDeserializer implements JsonDeserializer<Bus>
{
	@Override
	public Bus deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException
	{
		Bus newBus= context.deserialize(json, BusImpl.class);
		JsonObject currentObject=json.getAsJsonObject();

		JsonElement jelement=currentObject.get(CfaPackage.eINSTANCE.getBus_RteInstallations().getName());
		if (jelement!=null) {
			RteInstallation[] reInstallations=context.deserialize(jelement, RteInstallation[].class);
			if(reInstallations!=null) {
				newBus.getRteInstallations().addAll(Arrays.asList(reInstallations));
			}
		}

		JsonElement jelemenGenerator=currentObject.get(CfaPackage.eINSTANCE.getBus_Generators().getName());
		if (jelement!=null) {
			Generator[] generators=context.deserialize(jelemenGenerator, Generator[].class);
			if(generators!=null) {
				newBus.getGenerators().addAll(Arrays.asList(generators));
			}
		}
		JsonElement jelementBat=currentObject.get(CfaPackage.eINSTANCE.getBus_Batteries().getName());
		if (jelement!=null) {
			Battery[] batteries=context.deserialize(jelementBat, Battery[].class);
			if(batteries!=null) {
				newBus.getBatteries().addAll(Arrays.asList(batteries));
			}
		}
		JsonElement jelementLoad=currentObject.get(CfaPackage.eINSTANCE.getBus_Loads().getName());
		if (jelement!=null) {
			Load[] Loads =context.deserialize(jelementLoad, Load[].class);
			if(Loads!=null) {
				newBus.getLoads().addAll(Arrays.asList(Loads));
			}
		}
		return newBus;

	}
}
