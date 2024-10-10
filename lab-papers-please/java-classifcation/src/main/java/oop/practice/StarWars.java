package oop.practice;

import java.util.ArrayList;
import java.util.List;

public class StarWars {

    public List<Individuals> partOfStarWars(List<Individuals> individuals) {
        List<Individuals> partOfStarWars = new ArrayList<>();

        for(Individuals individual : individuals) {
            if (isWookie(individual)) {
                individual.setUniverse("Star Wars Universe (Wookie)");
                partOfStarWars.add(individual);
            } else if (isEwok(individual)) {
                individual.setUniverse("Star Wars Universe (Ewok)");
                partOfStarWars.add(individual);
            }
        }
        return partOfStarWars;
    }

    private boolean containsSpecificTrait(String[] traits, String trait) {
        for(String i : traits){
            if(i.equals(trait)){
                return true;
            }
        }
        return false;
    }

    private boolean isWookie(Individuals individual) {
        return !individual.isHumanoid() && individual.getPlanet().equals("Kashyyyk") &&
                individual.getAge() <= 400 && containsSpecificTrait(individual.getTraits(), "TALL") &&
                containsSpecificTrait(individual.getTraits(), "HAIRY");
    }

    private boolean isEwok(Individuals individual) {
        return !individual.isHumanoid() && individual.getPlanet().equals("Endor") &&
        individual.getAge() <= 60 && containsSpecificTrait(individual.getTraits(), "SHORT") &&
                containsSpecificTrait(individual.getTraits(), "HAIRY");
    }
}