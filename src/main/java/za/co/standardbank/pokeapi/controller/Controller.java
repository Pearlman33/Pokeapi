package za.co.standardbank.pokeapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.standardbank.pokeapi.service.PokeImpl;

@RestController
@RequestMapping(value = "/Pokemon", produces = { MediaType.APPLICATION_JSON_VALUE })
public class Controller {
	
	@Autowired
	private PokeImpl poke;
	String Json;
	@RequestMapping(value="/All", method = RequestMethod.GET)
	@ResponseBody
	public String getPoke() {
		Json = poke.getPoke();
		return Json;
		
	}
	@RequestMapping(value="/Group/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getGroup(@RequestParam(name="GroupName")String group,@PathVariable(name="id")int id) {
		Json = poke.getGroup(group, id);
		return Json;
		
	}


}
