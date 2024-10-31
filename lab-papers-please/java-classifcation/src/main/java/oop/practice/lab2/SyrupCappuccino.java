package oop.practice.lab2;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk,  SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk, "SyrupCappuccino");
        this.syrup = syrup;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println("Cappuccino syrup name: " + syrup);
    }
}
