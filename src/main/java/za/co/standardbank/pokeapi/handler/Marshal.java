package za.co.standardbank.pokeapi.handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import za.co.standardbank.pokeapi.pojo.Root;

public class Marshal {
	@SuppressWarnings("deprecation")
	public Root play(String myJsonString) throws JsonMappingException, JsonProcessingException
	{
		ObjectMapper om = new ObjectMapper();
		om.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		Root root = om.readValue((myJsonString), Root.class);
		return root;
	}
}
