package oop.practice.lab2.task1_2_3;

class Americano extends Coffee{
    private final int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println("Ml of Water: " + mlOfWater);
    }

    public void makeAmericano(){
        super.makeCoffee();
        System.out.println("Adding " + mlOfWater + " ml of water");
    }

    public static int getMlOfWater(Intensity coffeeIntensity) {
        return switch (coffeeIntensity) {
            case LIGHT -> 100;
            case NORMAL -> 50;
            case STRONG -> 25;
        };
    }
}
