package oop.practice.lab0;

public class LordOfTheRingsUniverse {

    public boolean partOfLordOfTheRingsUniverse(Individuals individual){
        return isElf(individual) || isDwarf(individual);
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
        boolean hasTraits = individual.getTraits().length > 0;
        return individual.isHumanoid() &&
                ("Earth".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown")) &&
                individual.getAge() >= 0 &&
                (containsSpecificTrait(individual.getTraits(), "BLONDE") &&
                containsSpecificTrait(individual.getTraits(), "POINTY_EARS") || !hasTraits);
    }

    public boolean isDwarf(Individuals individual) {
        return (individual.isHumanoid() || !individual.isHumanoid())&&
                ("Earth".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown"))&&
                (individual.getAge() < 200 || individual.getAge() == 0) &&
                (containsSpecificTrait(individual.getTraits(), "SHORT") ||
                containsSpecificTrait(individual.getTraits(), "BULKY"));
    }
}
