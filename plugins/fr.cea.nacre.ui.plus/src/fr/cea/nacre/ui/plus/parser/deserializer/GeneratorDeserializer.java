package fr.cea.nacre.ui.plus.parser.deserializer;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import fr.cea.nacre.model.NACREMM.cfa.Generator;
import fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl;

public class GeneratorDeserializer implements JsonDeserializer<Generator>
{
	  @Override
	  public Generator deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	      throws JsonParseException
	  {

	   return context.deserialize(json, GeneratorImpl.class);

	  }
}
