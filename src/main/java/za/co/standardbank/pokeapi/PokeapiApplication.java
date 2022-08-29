package za.co.standardbank.pokeapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"za.co.standardbank.pokeapi.service","za.co.standardbank.pokeapi.client","za.co.standardbank.pokeapi.controller"})
public class PokeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeapiApplication.class, args);
	}

}
