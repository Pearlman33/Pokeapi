package za.co.standardbank.pokeapi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.standardbank.pokeapi.client.JerseyClient;

@Service
public class PokeImpl implements PokeService{
	@Autowired
	private JerseyClient client;
	
	@Override
	public String getPoke() {
		return client.play();
	}

	@Override
	public String getGroup(String group,int id) {
		return client.playGroup(group, id);
	}

}
