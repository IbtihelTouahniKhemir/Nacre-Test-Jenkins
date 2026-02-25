package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;
import java.util.Arrays;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.Zone;
import fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl;

public class ZoneDeserializer implements JsonDeserializer<Zone>
{
	@Override
	public Zone deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException
	{

		Zone newZone= context.deserialize(json, ZoneImpl.class);
		JsonObject currentObject=json.getAsJsonObject();

		JsonElement jelement=currentObject.get(CfaPackage.eINSTANCE.getZone_Substations().getName());
		if (jelement!=null) {
			Substation[] substations=context.deserialize(jelement, Substation[].class);
			if( substations!=null) {
				newZone.getSubstations().addAll(Arrays.asList(substations));
			}
		}
		return newZone;

	}

}
