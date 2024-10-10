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
        this.isHumanoid = isHumanoid != null ? isHumanoid : false;
        this.planet = planet != null ? planet : "Unknown";
        this.age = age != null ? age : 0;
        this.traits = traits != null ? traits : new String[0];
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

}
