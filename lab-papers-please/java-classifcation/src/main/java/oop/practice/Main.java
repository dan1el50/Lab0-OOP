package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args){

    FileReader fileReader = new FileReader();
    List<Individuals> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    StarWarsUniverse starWarsUniverse = new StarWarsUniverse();
    MarvelUniverse marvelUniverse = new MarvelUniverse();
    HitchhikerUniverse hitchhikerUniverse = new HitchhikerUniverse();
    LordOfTheRingsUniverse lordOfTheRingsUniverse = new LordOfTheRingsUniverse();

    for (Individuals individual : individuals){
      if (starWarsUniverse.partOfStarWarsUniverse(individual)){
        individual.setUniverse("Star Wars");
        individual.PrintIndividualsByTheirUniverses();
      } else if (marvelUniverse.partOfMarvelUniverse(individual)) {
        individual.setUniverse("Marvel");
        individual.PrintIndividualsByTheirUniverses();
      } else if (hitchhikerUniverse.partOfHitchhikerUniverse(individual)) {
        individual.setUniverse("Hitchhiker");
        individual.PrintIndividualsByTheirUniverses();
      } else if (lordOfTheRingsUniverse.partOfLordOfTheRingsUniverse(individual)) {
        individual.setUniverse("Lord Of The Rings");
        individual.PrintIndividualsByTheirUniverses();
      } else {
        System.out.println("Could not classify.");
      }
    }
  }
}
