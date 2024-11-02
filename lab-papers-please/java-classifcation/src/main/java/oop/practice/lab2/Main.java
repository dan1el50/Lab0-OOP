package oop.practice.lab2;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(Intensity.STRONG);
        Cappuccino cappuccino = new Cappuccino(Intensity.LIGHT, 50);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 10, SyrupType.CHOCOLATE );
        Americano americano = new Americano(Intensity.STRONG, 50);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 15, 100);

        coffee.makeCoffee();
        System.out.println();
        cappuccino.makeCappuccino();
        System.out.println();
        syrupCappuccino.makeSyrupCappuccino();
        System.out.println();
        americano.makeAmericano();
        System.out.println();
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
    }
}