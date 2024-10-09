package oop.practice;

import java.util.Arrays;

public class Entity {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private String[] traits;

    public Entity(int id, Boolean isHumanoid, String planet, Integer age, String[] traits){
        this.id = id;
        this.isHumanoid = isHumanoid != null ? isHumanoid : false;
        this.planet = planet != null ? planet : "";
        this.age = age != null ? age : 0;
        this.traits = traits != null ? traits : new String[0];

        HandleNullValues();
    }

    public void HandleNullValues(){
        if(this.isHumanoid == null){
            this.isHumanoid = false;
        }
        if(this.planet == null){
            this.planet = "";
        }
        if(this.age == null){
            this.age = 0;
        }
        if(this.traits == null){
            this.traits = new String[0];
        }
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

    public void PrintEntity(){
        System.out.println("{ID: " + id + ", isHumanoid: " + isHumanoid + ", Planet: " + planet + ", Age: " + age + ", Traits: " + Arrays.toString(traits) + "}");
    }

}
