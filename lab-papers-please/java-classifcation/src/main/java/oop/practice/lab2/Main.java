package oop.practice.lab2;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(Intensity.STRONG);
        Cappuccino cappuccino = new Cappuccino(Intensity.LIGHT, 50);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 10, SyrupType.CHOCOLATE );
        Americano americano = new Americano(Intensity.STRONG, 50);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 15, 100);

        coffee.printCoffeeDetails();
        System.out.println();
        cappuccino.printCoffeeDetails();
        System.out.println();
        syrupCappuccino.printCoffeeDetails();
        System.out.println();
        americano.printCoffeeDetails();
        System.out.println();
        pumpkinSpiceLatte.printCoffeeDetails();

    }
}