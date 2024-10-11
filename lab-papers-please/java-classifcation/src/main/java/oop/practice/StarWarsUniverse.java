package oop.practice;

public class StarWarsUniverse {

    public boolean partOfStarWarsUniverse(Individuals individual) {
        return isWookie(individual) || isEwok(individual);
    }

    private boolean containsSpecificTrait(String[] traits, String trait) {
        if (traits == null || traits.length == 0) {
            return false; // Handle empty or null traits array
        }
        for (String i : traits) {
            if (i.equals(trait)) {
                return true;
            }
        }
        return false; // Return false if trait is not found
    }

    private boolean isWookie(Individuals individual) {
        boolean hasTraits = individual.getTraits().length > 0;
        return !individual.isHumanoid() &&
                ("Kashyyyk".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown")) &&
                (individual.getAge() <= 400 || individual.getAge() == 0) &&
                (containsSpecificTrait(individual.getTraits(), "TALL") ||
                containsSpecificTrait(individual.getTraits(), "HAIRY") || !hasTraits);
    }

    private boolean isEwok(Individuals individual) {
        boolean hasTraits = individual.getTraits().length > 0;
        return !individual.isHumanoid() &&
                ("Endor".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown")) &&
                (individual.getAge() <= 60 || individual.getAge() == 0)  &&
                (containsSpecificTrait(individual.getTraits(), "SHORT") ||
                containsSpecificTrait(individual.getTraits(), "HAIRY") || !hasTraits);
    }
}
