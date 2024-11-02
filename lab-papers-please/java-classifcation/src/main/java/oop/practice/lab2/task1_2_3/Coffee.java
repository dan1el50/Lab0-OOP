package oop.practice.lab2.task1_2_3;

class Coffee {
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

    public void makeCoffee(){
        System.out.println("Making " + name);
        System.out.println("Intensity set to " + coffeeIntensity);
    }

    public String getName() {
        return name;
    }
}
