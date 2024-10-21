package oop.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    FileReader fileReader = new FileReader();
    List<Individuals> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    if (individuals == null || individuals.isEmpty()) {
      System.out.println("No individuals found");
      return;
    }

    Map<String, List<Individuals>> classifiedIndividuals = classifyIndividuals(individuals);

    if (classifiedIndividuals == null || classifiedIndividuals.isEmpty()) {
      System.out.println("No classified individuals found");
      return;
    }

    View view = new View(); // Create an instance of the View class

    for (Map.Entry<String, List<Individuals>> entry : classifiedIndividuals.entrySet()) {
      String universe = entry.getKey();
      List<Individuals> universeIndividuals = entry.getValue();
      view.writeOutput(universe, universeIndividuals); // Write output for each universe
    }
  }

  public static Map<String, List<Individuals>> classifyIndividuals(List<Individuals> individuals) {
    StarWarsUniverse starWarsUniverse = new StarWarsUniverse();
    MarvelUniverse marvelUniverse = new MarvelUniverse();
    HitchhikerUniverse hitchhikerUniverse = new HitchhikerUniverse();
    LordOfTheRingsUniverse lordOfTheRingsUniverse = new LordOfTheRingsUniverse();

    Map<String, List<Individuals>> classifiedIndividuals = new HashMap<>();
    classifiedIndividuals.put("Star Wars", new ArrayList<>());
    classifiedIndividuals.put("Marvel", new ArrayList<>());
    classifiedIndividuals.put("Hitchhiker", new ArrayList<>());
    classifiedIndividuals.put("Lord of the Rings", new ArrayList<>());

    for (Individuals individual : individuals) {
      if (starWarsUniverse.partOfStarWarsUniverse(individual)) {
        individual.setUniverse("Star Wars");
      } else if (marvelUniverse.partOfMarvelUniverse(individual)) {
        individual.setUniverse("Marvel");
      } else if (hitchhikerUniverse.partOfHitchhikerUniverse(individual)) {
        individual.setUniverse("Hitchhiker");
      } else if (lordOfTheRingsUniverse.partOfLordOfTheRingsUniverse(individual)) {
        individual.setUniverse("Lord of the Rings");
      } else {
        System.out.println("Could not classify individual with ID: " + individual.getId());
        continue; // Skip to the next iteration if not classified
      }

      // Add classified individuals to their respective lists
      classifiedIndividuals.get(individual.getUniverse()).add(individual);
    }
    return classifiedIndividuals;
  }
}
