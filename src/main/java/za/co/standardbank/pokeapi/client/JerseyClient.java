package za.co.standardbank.pokeapi.client;
import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import za.co.standardbank.pokeapi.constant.Constant;

@Component
public class JerseyClient {
String Json;

	public JerseyClient() {
		
	}
	
	public String play() {
		
		Client client = Client.create();
		WebResource webResource = client.resource(Constant.POKEAPIURL.value());
		ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
		Json= response.getEntity(String.class);
		System.out.println(Json);
		return Json;
	}
	public String playGroup(String group, int id) {
		
		Client client = Client.create();
		WebResource webResource = client.resource(Constant.POKEAPIURL.value()+"/"+group+"/"+id);
		ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
		Json= response.getEntity(String.class);
		System.out.println(Json);
		return Json;
	}

}
