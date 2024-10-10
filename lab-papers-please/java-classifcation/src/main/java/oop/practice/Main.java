package oop.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){

    FileReader fileReader = new FileReader();
    List<Individuals> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    StarWars starWarsIndividuals = new StarWars();
    List<Individuals> classifiedAsStarWars = starWarsIndividuals.partOfStarWars(individuals);

    System.out.println("Individuals from Earth: ");
    for (Individuals individual : individuals){
      if(individual.getPlanet().equals("Earth")){
        individual.PrintIndividuals();
      }
    }

    System.out.println("Individuals with age up to 500: ");
    for (Individuals individual : individuals){
      if (individual.getAge() <= 100){
        individual.PrintIndividuals();
      }
    }

    System.out.println("Individuals that are not humanoids and have the age up tp 100: ");
    for (Individuals individual : individuals){
      if (individual.getAge() <= 100 && !individual.isHumanoid()){
        individual.PrintIndividuals();
      }
    }

    // Print classified individuals
    System.out.println("Classified Star Wars Individuals: ");
    for (Individuals individual : classifiedAsStarWars) {
      individual.PrintIndividuals();
    }
  }
}
