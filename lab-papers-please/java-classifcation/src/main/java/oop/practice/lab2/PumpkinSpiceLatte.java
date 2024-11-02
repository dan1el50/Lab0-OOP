package oop.practice.lab2;

public class PumpkinSpiceLatte extends Cappuccino{
    private final int mlOfPumpkinLatte;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfPumpkinLatte, int mlOfMilk) {
        super(coffeeIntensity, mlOfMilk, "PumpkinSpiceLatte");
        this.mlOfPumpkinLatte = mlOfPumpkinLatte;
    }

    public void makePumpkinSpiceLatte(){
        super.makeCappuccino();
        System.out.println("Adding " + mlOfPumpkinLatte + " ml of pumpkin spice");
    }
}
