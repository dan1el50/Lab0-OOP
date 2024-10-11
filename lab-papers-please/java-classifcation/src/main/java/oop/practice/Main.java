package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args){

    FileReader fileReader = new FileReader();
    List<Individuals> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    StarWarsUniverse starWarsUniverseIndividuals = new StarWarsUniverse();
    List<Individuals> classifiedAsStarWars = starWarsUniverseIndividuals.partOfStarWars(individuals);

    MarvelUniverse marvelUniverseIndividuals = new MarvelUniverse();
    List<Individuals> classifiedAsMarvel = marvelUniverseIndividuals.partOfMarvelUniverse(individuals);

    HitchhikerUniverse hitchhikerUniverseIndividuals = new HitchhikerUniverse();
    List<Individuals> classifiedAsHitchhker = hitchhikerUniverseIndividuals.partOfHitchhikerUniverse(individuals);

    LordOfTheRingsUniverse lordOfTheRingsUniverseIndividuals = new LordOfTheRingsUniverse();
    List<Individuals> classifiedAsLordOfTheRings = lordOfTheRingsUniverseIndividuals.partOfLordOfTheRingsUniverse(individuals);
    // Print classified individuals
    System.out.println("Classified Star Wars Universe Individuals: ");
    for (Individuals individual : classifiedAsStarWars) {
      individual.PrintIndividuals();
    }

    System.out.println("Classified Marvel Universe Individuals: ");
    for (Individuals individual : classifiedAsMarvel) {
      individual.PrintIndividuals();
    }

    System.out.println("Classified Hitchhiker's Universe Individuals: ");
    for (Individuals individual : classifiedAsHitchhker) {
      individual.PrintIndividuals();
    }

    System.out.println("Classified Lord of the rings Universe Individuals: ");
    for (Individuals individual : classifiedAsLordOfTheRings) {
      individual.PrintIndividuals();
    }
  }
}
