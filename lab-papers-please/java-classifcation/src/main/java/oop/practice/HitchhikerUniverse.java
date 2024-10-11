package oop.practice;

public class HitchhikerUniverse {

    public boolean partOfHitchhikerUniverse(Individuals individual){
        return isBetelgeusian(individual) || isVogons(individual);
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
        return (individual.isHumanoid() || !individual.isHumanoid())&&
                ("Betelgeuse".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown")) &&
                (individual.getAge() <= 100 || individual.getAge() == 0) &&
                (containsSpecificTrait(individual.getTraits(), "EXTRA_ARMS") ||
                containsSpecificTrait(individual.getTraits(), "EXTRA_HEAD"));
    }

    public boolean isVogons(Individuals individual){
        return !individual.isHumanoid() &&
                ("Vogsphere".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown")) &&
                (individual.getAge() <= 200 || individual.getAge() == 0) &&
                (containsSpecificTrait(individual.getTraits(), "GREEN") ||
                containsSpecificTrait(individual.getTraits(), "BULKY"));
    }
}
