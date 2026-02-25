package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;
import java.util.Arrays;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.Bus;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.impl.SubstationImpl;

public class SubstationDeserializer implements JsonDeserializer<Substation>
{
	@Override
	public Substation deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException
	{

		Substation newSubstation= context.deserialize(json, SubstationImpl.class);
		JsonObject currentObject=json.getAsJsonObject();

		JsonElement jelement=currentObject.get("bus");
		if (jelement!=null) {
			Bus[] reInstallations=context.deserialize(jelement, Bus[].class);
			if(reInstallations!=null) {
				newSubstation.getBus().addAll(Arrays.asList(reInstallations));
			}
		}
		return newSubstation;

	}

}
