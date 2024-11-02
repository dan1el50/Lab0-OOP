package oop.practice.lab2.task1_2_3;

import java.util.Scanner;

public class Barista {
    private Scanner scanner = new Scanner(System.in);

    private Intensity getIntensity(){
        System.out.println("Choose intensity: LIGHT, NORMAL, STRONG");
        String input = scanner.nextLine().toUpperCase();
        return Intensity.valueOf(input);
    }

    private SyrupType getSyrupType(){
        System.out.println("Choose syrup type: MACADAMIA, VANILLA, COCONUT, CARAMEL, CHOCOLATE, POPCORN");
        String input = scanner.nextLine().toUpperCase();
        return SyrupType.valueOf(input);
    }

    public void makeOrder(){
        System.out.println("Welcome! What would you like to order?");
        System.out.println("Coffee options: Americano, Cappuccino, Pumpkin Spice Latte, Syrup Cappuccino");
        String choice = scanner.nextLine().toLowerCase().replace(" ", "");

        switch (choice) {
            case "americano":
                makeAmericano();
                break;
            case "cappuccino":
                makeCappuccino();
                break;
            case "pumpkinspicelatte":
                makePumpkinSpiceLatte();
                break;
            case "syrupcappuccino":
                makeSyrupCappuccino();
                break;
            default:
                System.out.println("Sorry we do not have this drink.");
        }
    }

    public void makeCappuccino(){
        Intensity coffeeIntensity = getIntensity();
        int mlOfMilk = Cappuccino.getMlOfMilk(coffeeIntensity);
        Cappuccino cappuccino = new Cappuccino(coffeeIntensity, mlOfMilk);
        cappuccino.makeCappuccino();
    }

    public void makeAmericano(){
        Intensity coffeeIntensity = getIntensity();
        int mlOfWater = Americano.getMlOfWater(coffeeIntensity);
        Americano americano = new Americano(coffeeIntensity, mlOfWater);
        americano.makeAmericano();
    }

    public void makePumpkinSpiceLatte(){
        Intensity coffeeIntensity = getIntensity();
        int mlOfMilk = Cappuccino.getMlOfMilk(coffeeIntensity);
        int mlOfPumpkinSpice = PumpkinSpiceLatte.getMlOfPumpkinSpice(coffeeIntensity);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(coffeeIntensity, mlOfMilk, mlOfPumpkinSpice);
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
    }

    public void makeSyrupCappuccino(){
        Intensity coffeeIntensity = getIntensity();
        int mlOfMilk = Cappuccino.getMlOfMilk(coffeeIntensity);
        SyrupType syrupType = getSyrupType();
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(coffeeIntensity, mlOfMilk, syrupType);
        syrupCappuccino.makeSyrupCappuccino();
    }
}
