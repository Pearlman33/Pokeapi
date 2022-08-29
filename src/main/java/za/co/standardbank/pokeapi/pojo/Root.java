package za.co.standardbank.pokeapi.pojo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Root{
	
    private String ability;
    private String berry;
    @JsonProperty("berry-firmness") 
    private String berryFirmness;
    @JsonProperty("berry-flavor") 
    private String berryFlavor;
    private String characteristic;
    @JsonProperty("contest-effect") 
    private String contestEffect;
    @JsonProperty("contest-type") 
    private String contestType;
    @JsonProperty("egg-group") 
    private String eggGroup;
    @JsonProperty("encounter-condition") 
    private String encounterCondition;
    @JsonProperty("encounter-condition-value") 
    private String encounterConditionValue;
    @JsonProperty("encounter-method") 
    private String encounterMethod;
    @JsonProperty("evolution-chain") 
    private String evolutionChain;
    @JsonProperty("evolution-trigger") 
    private String evolutionTrigger;
    private String gender;
    private String generation;
    @JsonProperty("growth-rate") 
    private String growthRate;
    private String item;
    @JsonProperty("item-attribute") 
    private String itemAttribute;
    @JsonProperty("item-category") 
    private String itemCategory;
    @JsonProperty("item-fling-effect") 
    private String itemFlingEffect;
    @JsonProperty("item-pocket") 
    private String itemPocket;
    private String language;
    private String location;
    @JsonProperty("location-area") 
    private String locationArea;
    private String machine;
    private String move;
    @JsonProperty("move-ailment") 
    private String moveAilment;
    @JsonProperty("move-battle-style") 
    private String moveBattleStyle;
    @JsonProperty("move-category") 
    private String moveCategory;
    @JsonProperty("move-damage-class") 
    private String moveDamageClass;
    @JsonProperty("move-learn-method") 
    private String moveLearnMethod;
    @JsonProperty("move-target") 
    private String moveTarget;
    private String nature;
    @JsonProperty("pal-park-area") 
    private String palParkArea;
    @JsonProperty("pokeathlon-stat") 
    private String pokeathlonStat;
    private String pokedex;
    private String pokemon;
    @JsonProperty("pokemon-color") 
    private String pokemonColor;
    @JsonProperty("pokemon-form") 
    private String pokemonForm;
    @JsonProperty("pokemon-habitat") 
    private String pokemonHabitat;
    @JsonProperty("pokemon-shape") 
    private String pokemonShape;
    @JsonProperty("pokemon-species") 
    private String pokemonSpecies;
    private String region;
    private String stat;
    @JsonProperty("super-contest-effect") 
    private String superContestEffect;
    private String type;
    private String version;
    @JsonProperty("version-group") 
    private String versionGroup;
    
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public String getBerry() {
		return berry;
	}
	public void setBerry(String berry) {
		this.berry = berry;
	}
	public String getBerryFirmness() {
		return berryFirmness;
	}
	public void setBerryFirmness(String berryFirmness) {
		this.berryFirmness = berryFirmness;
	}
	public String getBerryFlavor() {
		return berryFlavor;
	}
	public void setBerryFlavor(String berryFlavor) {
		this.berryFlavor = berryFlavor;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	public String getContestEffect() {
		return contestEffect;
	}
	public void setContestEffect(String contestEffect) {
		this.contestEffect = contestEffect;
	}
	public String getContestType() {
		return contestType;
	}
	public void setContestType(String contestType) {
		this.contestType = contestType;
	}
	public String getEggGroup() {
		return eggGroup;
	}
	public void setEggGroup(String eggGroup) {
		this.eggGroup = eggGroup;
	}
	public String getEncounterCondition() {
		return encounterCondition;
	}
	public void setEncounterCondition(String encounterCondition) {
		this.encounterCondition = encounterCondition;
	}
	public String getEncounterConditionValue() {
		return encounterConditionValue;
	}
	public void setEncounterConditionValue(String encounterConditionValue) {
		this.encounterConditionValue = encounterConditionValue;
	}
	public String getEncounterMethod() {
		return encounterMethod;
	}
	public void setEncounterMethod(String encounterMethod) {
		this.encounterMethod = encounterMethod;
	}
	public String getEvolutionChain() {
		return evolutionChain;
	}
	public void setEvolutionChain(String evolutionChain) {
		this.evolutionChain = evolutionChain;
	}
	public String getEvolutionTrigger() {
		return evolutionTrigger;
	}
	public void setEvolutionTrigger(String evolutionTrigger) {
		this.evolutionTrigger = evolutionTrigger;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getGrowthRate() {
		return growthRate;
	}
	public void setGrowthRate(String growthRate) {
		this.growthRate = growthRate;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getItemAttribute() {
		return itemAttribute;
	}
	public void setItemAttribute(String itemAttribute) {
		this.itemAttribute = itemAttribute;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getItemFlingEffect() {
		return itemFlingEffect;
	}
	public void setItemFlingEffect(String itemFlingEffect) {
		this.itemFlingEffect = itemFlingEffect;
	}
	public String getItemPocket() {
		return itemPocket;
	}
	public void setItemPocket(String itemPocket) {
		this.itemPocket = itemPocket;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocationArea() {
		return locationArea;
	}
	public void setLocationArea(String locationArea) {
		this.locationArea = locationArea;
	}
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMoveAilment() {
		return moveAilment;
	}
	public void setMoveAilment(String moveAilment) {
		this.moveAilment = moveAilment;
	}
	public String getMoveBattleStyle() {
		return moveBattleStyle;
	}
	public void setMoveBattleStyle(String moveBattleStyle) {
		this.moveBattleStyle = moveBattleStyle;
	}
	public String getMoveCategory() {
		return moveCategory;
	}
	public void setMoveCategory(String moveCategory) {
		this.moveCategory = moveCategory;
	}
	public String getMoveDamageClass() {
		return moveDamageClass;
	}
	public void setMoveDamageClass(String moveDamageClass) {
		this.moveDamageClass = moveDamageClass;
	}
	public String getMoveLearnMethod() {
		return moveLearnMethod;
	}
	public void setMoveLearnMethod(String moveLearnMethod) {
		this.moveLearnMethod = moveLearnMethod;
	}
	public String getMoveTarget() {
		return moveTarget;
	}
	public void setMoveTarget(String moveTarget) {
		this.moveTarget = moveTarget;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getPalParkArea() {
		return palParkArea;
	}
	public void setPalParkArea(String palParkArea) {
		this.palParkArea = palParkArea;
	}
	public String getPokeathlonStat() {
		return pokeathlonStat;
	}
	public void setPokeathlonStat(String pokeathlonStat) {
		this.pokeathlonStat = pokeathlonStat;
	}
	public String getPokedex() {
		return pokedex;
	}
	public void setPokedex(String pokedex) {
		this.pokedex = pokedex;
	}
	public String getPokemon() {
		return pokemon;
	}
	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	public String getPokemonColor() {
		return pokemonColor;
	}
	public void setPokemonColor(String pokemonColor) {
		this.pokemonColor = pokemonColor;
	}
	public String getPokemonForm() {
		return pokemonForm;
	}
	public void setPokemonForm(String pokemonForm) {
		this.pokemonForm = pokemonForm;
	}
	public String getPokemonHabitat() {
		return pokemonHabitat;
	}
	public void setPokemonHabitat(String pokemonHabitat) {
		this.pokemonHabitat = pokemonHabitat;
	}
	public String getPokemonShape() {
		return pokemonShape;
	}
	public void setPokemonShape(String pokemonShape) {
		this.pokemonShape = pokemonShape;
	}
	public String getPokemonSpecies() {
		return pokemonSpecies;
	}
	public void setPokemonSpecies(String pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getSuperContestEffect() {
		return superContestEffect;
	}
	public void setSuperContestEffect(String superContestEffect) {
		this.superContestEffect = superContestEffect;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(String versionGroup) {
		this.versionGroup = versionGroup;
	}

    
    
    
}
