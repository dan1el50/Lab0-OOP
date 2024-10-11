package oop.practice;


import java.util.ArrayList;
import java.util.List;

public class MarvelUniverse {

    public List<Individuals> partOfMarvelUniverse(List<Individuals> individuals ) {
        List<Individuals> partOfMarvelUniverse = new ArrayList<>();

        for(Individuals individual : individuals) {
            if(isAsgardian(individual)){
                individual.setUniverse("Marvel Universe (Asgardian)");
                partOfMarvelUniverse.add(individual);
            }
        }
        return partOfMarvelUniverse;
    }

    public boolean containsSpecificTrait(String[] traits, String trait) {
        for(String i : traits){
            if(i.equals(trait)){
                return true;
            }
        }
        return false;
    }

    public boolean isAsgardian(Individuals individual){
        return individual.isHumanoid() && individual.getPlanet().equals("Asgard") &&
                individual.getAge() <= 5000 && containsSpecificTrait(individual.getTraits(), "BLONDE") &&
                containsSpecificTrait(individual.getTraits(), "TALL");
    }


}
