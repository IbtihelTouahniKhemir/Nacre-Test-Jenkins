package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.impl.ControllerImpl;

public class ControllerDeserializer implements JsonDeserializer<Controller>
{
	  @Override
	  public Controller deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	      throws JsonParseException
	  {

	   return context.deserialize(json, ControllerImpl.class);

	  }
}
