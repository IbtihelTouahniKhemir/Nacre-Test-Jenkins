package fr.cea.nacre.ui.plus.parser;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.PowerType;
import fr.cea.nacre.model.NACREMM.cfa.impl.PowerTypeImpl;

public class PowerTypeDeserializer  implements JsonDeserializer<PowerType>
{
	  @Override
	  public PowerType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	      throws JsonParseException
	  {
	   
	   return context.deserialize(json, PowerTypeImpl.class);
	   
	  }

}
