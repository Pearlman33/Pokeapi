package za.co.standardbank.pokeapi.constant;

public enum Constant {

	POKEAPIURL("https://pokeapi.co/api/v2");
	
	private String value;

	Constant (String constant) {
		this.value = constant;
	}

	public String value() {
		return value;
	}

}
