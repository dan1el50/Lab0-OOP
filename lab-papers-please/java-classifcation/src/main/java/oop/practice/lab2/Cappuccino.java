package oop.practice.lab2;

public class Cappuccino extends Coffee{
    protected int mlOfMilk;

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk, String name) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
        this.name = name;
    }

    public void makeCappuccino(){
        super.makeCoffee();
        System.out.println("Adding " + mlOfMilk + " ml of milk");
    }
}
