package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl;

public class BatteryDeserializer  implements JsonDeserializer<Battery>
{
	  @Override
	  public Battery deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	      throws JsonParseException
	  {

	   return context.deserialize(json, BatteryImpl.class);

	  }
}

