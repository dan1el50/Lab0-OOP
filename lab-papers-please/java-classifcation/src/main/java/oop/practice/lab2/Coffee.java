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

}
