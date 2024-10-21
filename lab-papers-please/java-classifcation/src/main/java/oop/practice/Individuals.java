package oop.practice;

import java.util.Arrays;

public class Individuals {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private String[] traits;
    private String universe;

    public Individuals(int id, Boolean isHumanoid, String planet, Integer age, String[] traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
    }

    public int getId(){
        return id;
    }

    public boolean isHumanoid() {
        return isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public int getAge() {
        return age;
    }

    public String[] getTraits() {
        return traits;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public void PrintIndividuals(){
        System.out.println("{ID: " + id + ", isHumanoid: " + isHumanoid + ", Planet: " + planet + ", Age: " + age + ", Traits: " + Arrays.toString(traits) + "}");
    }

    public void PrintIndividualsByTheirUniverses() {
        System.out.println("ID: " + id + ", Universe: " + universe);
    }

}
