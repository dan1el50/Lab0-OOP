package oop.practice.lab2;

public class Coffee {
    protected Intensity coffeeIntensity;
    protected String name;

    public Coffee(Intensity coffeeintensity) {
        this.coffeeIntensity = coffeeintensity;
        this.name = "Coffee";
    }

    public Coffee(Intensity coffeeintensity, String name) {
        this.coffeeIntensity = coffeeintensity;
        this.name = name;
    }

    public void printCoffeeDetails(){
        System.out.println("Coffee Name: " + name);
        System.out.println("Coffee Intensity: " + coffeeIntensity);
    }

    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }

    public void setCoffeeIntensity(Intensity coffeeIntensity) {
        this.coffeeIntensity = coffeeIntensity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
