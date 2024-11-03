package oop.practice.lab2.task1_2_3;

class PumpkinSpiceLatte extends Cappuccino {
    private final int mlOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mlOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk, "PumpkinSpiceLatte");
        this.mlOfPumpkinSpice = mlOfPumpkinSpice;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println("Ml of Pumpkin Spice: " + mlOfPumpkinSpice);
    }

    public void makePumpkinSpiceLatte() {
        super.makeCappuccino();
        System.out.println("Adding " + mlOfPumpkinSpice + " ml of pumpkin spice");
    }

    public static int getMlOfPumpkinSpice(Intensity coffeeIntensity) {
        return switch (coffeeIntensity) {
            case LIGHT -> 10;
            case NORMAL -> 15;
            case STRONG -> 25;
        };
    }
}
