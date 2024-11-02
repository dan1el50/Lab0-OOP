package oop.practice.lab2;

public class Americano extends Coffee{
    private final int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    public void makeAmericano(){
        super.makeCoffee();
        System.out.println("Adding " + mlOfWater + " ml of water");
    }
}
