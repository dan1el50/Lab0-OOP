package oop.practice.lab0;

public class MarvelUniverse {

    public boolean partOfMarvelUniverse(Individuals individual){
        return isAsgardian(individual);
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
        return individual.isHumanoid() &&
                ("Asgard".equals(individual.getPlanet()) || individual.getPlanet().equals("Unknown"))&&
                (individual.getAge() <= 5000 || individual.getAge() == 0) &&
                (containsSpecificTrait(individual.getTraits(), "BLONDE") ||
                containsSpecificTrait(individual.getTraits(), "TALL"));
    }


}
