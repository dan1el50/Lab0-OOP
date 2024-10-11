package oop.practice;

import java.util.ArrayList;
import java.util.List;

public class HitchhikerUniverse {

    public List<Individuals> partOfHitchhikerUniverse(List<Individuals> individuals){
        List<Individuals> partOfHitchhikerUniverse = new ArrayList<>();

        for (Individuals individual : individuals){
            if (isBetelgeusian(individual)){
                individual.setUniverse("Hitchhiker's Universe (Betelgeusian)");
                partOfHitchhikerUniverse.add(individual);
            } else if (isVogons(individual)) {
                individual.setUniverse("Hitchhiker's Universe (Vogons)");
                partOfHitchhikerUniverse.add(individual);
            }
        }
        return partOfHitchhikerUniverse;
    }

    public boolean containsSpecificTrait(String[] traits, String trait){
        for(String i : traits){
            if (i.equals(trait)){
                return true;
            }
        }
        return false;
    }

    public boolean isBetelgeusian(Individuals individual){
        return individual.isHumanoid() && individual.getPlanet().equals("Betelgeuse") &&
                individual.getAge() <= 100 && containsSpecificTrait(individual.getTraits(), "EXTRA_ARMS") &&
                containsSpecificTrait(individual.getTraits(), "EXTRA_HEAD");
    }

    public boolean isVogons(Individuals individual){
        return !individual.isHumanoid() && individual.getPlanet().equals("Vogsphere") &&
                individual.getAge() <= 200 && containsSpecificTrait(individual.getTraits(), "GREEN") &&
                containsSpecificTrait(individual.getTraits(), "BULKY");
    }
}
