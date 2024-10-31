package oop.practice.lab2;

public class Americano extends Coffee{
    private int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " Water: " + mlOfWater + "mg");
    }
}
