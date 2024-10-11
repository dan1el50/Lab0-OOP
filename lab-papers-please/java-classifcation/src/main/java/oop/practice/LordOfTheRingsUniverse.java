package oop.practice;

import java.util.ArrayList;
import java.util.List;

public class LordOfTheRingsUniverse {

    public List<Individuals> partOfLordOfTheRingsUniverse(List<Individuals> individuals) {
        
        List<Individuals> partOfLordOfTheRingsUniverse = new ArrayList<Individuals>();
        for (Individuals individual : individuals){
            if(isElf(individual)){
                individual.setUniverse("Lord of the rings (Elf)");
                partOfLordOfTheRingsUniverse.add(individual);
            } else if (isDwarf(individual)) {
                individual.setUniverse("Lord of the rings (Dwarf)");
                partOfLordOfTheRingsUniverse.add(individual);
            }
        }
        return partOfLordOfTheRingsUniverse;
    }

    public boolean containsSpecificTrait(String[] traits, String trait){
        for (String i : traits){
            if (i.equals(trait)){
                return true;
            }
        }
        return false;
    }

    public boolean isElf(Individuals individual) {
        return individual.isHumanoid() && individual.getPlanet().equals("Earth") &&
                individual.getAge() == 0 && containsSpecificTrait(individual.getTraits(), "BLONDE") &&
                containsSpecificTrait(individual.getTraits(), "POINTY_EARS");
    }

    public boolean isDwarf(Individuals individual) {
        return individual.isHumanoid() && individual.getPlanet().equals("Earth") &&
                individual.getAge() < 200 && containsSpecificTrait(individual.getTraits(), "SHORT") &&
                containsSpecificTrait(individual.getTraits(), "BULKY");
    }
}
