package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;
import fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl;

public class RteInstallationDeserializer implements JsonDeserializer<RteInstallation>
{
	  @Override
	  public RteInstallation deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	      throws JsonParseException
	  {

	   return context.deserialize(json, RteInstallationImpl.class);

	  }
}
