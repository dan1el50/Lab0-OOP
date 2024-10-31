package oop.practice.lab2;

public class PumpkinSpiceLatte extends Cappuccino{
    private int mlOfPumpkinLatte;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfPumpkinLatte, int mlOfMilk) {
        super(coffeeIntensity, mlOfMilk, "PumpkinSpiceLatte");
        this.mlOfPumpkinLatte = mlOfPumpkinLatte;
    }
}
