package oop.practice.lab2.task1_2_3;

class Cappuccino extends Coffee{
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

    public static int getMlOfMilk(Intensity coffeeIntensity) {
        return switch (coffeeIntensity) {
            case LIGHT -> 200;
            case NORMAL -> 150;
            case STRONG -> 100;
        };
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " milk: " + mlOfMilk + "ml");
    }

    public void makeCappuccino(){
        super.makeCoffee();
        System.out.println("Adding " + mlOfMilk + " ml of milk");
    }
}
