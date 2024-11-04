package oop.practice.lab2.task1_2_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {
    private Scanner scanner = new Scanner(System.in);
    private List<Coffee> orders = new ArrayList<>();

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

    public void makeOrder() {
        boolean ordering = true;
        System.out.println("Welcome to Coffee Shop!");
        while (ordering) {
            System.out.println("What would you like to order?");
            System.out.println("Coffee options: Americano, Cappuccino, Pumpkin Spice Latte, Syrup Cappuccino");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");

            Coffee coffee = null;
            switch (choice) {
                case "americano":
                    coffee = makeAmericano();
                    break;
                case "cappuccino":
                    coffee = makeCappuccino();
                    break;
                case "pumpkinspicelatte":
                    coffee = makePumpkinSpiceLatte();
                    break;
                case "syrupcappuccino":
                    coffee = makeSyrupCappuccino();
                    break;
                default:
                    System.out.println("Sorry, we do not have this drink.");
            }

            if (coffee != null) {
                orders.add(coffee);  // Add to the list of orders
                System.out.println("Your order has been added!");
            }

            System.out.println("Would you like to order another coffee? (yes/no)");
            String anotherOrder = scanner.nextLine().toLowerCase();
            if (!anotherOrder.equals("yes")) {
                ordering = false;
            }
        }
    }

    public Coffee makeCappuccino() {
        Intensity coffeeIntensity = getIntensity();
        int mlOfMilk = Cappuccino.getMlOfMilk(coffeeIntensity);
        Cappuccino cappuccino = new Cappuccino(coffeeIntensity, mlOfMilk);
        cappuccino.printCoffeeDetails();
        System.out.println();
        cappuccino.makeCappuccino();
        return cappuccino;
    }

    public Coffee makeAmericano() {
        Intensity coffeeIntensity = getIntensity();
        int mlOfWater = Americano.getMlOfWater(coffeeIntensity);
        Americano americano = new Americano(coffeeIntensity, mlOfWater);
        americano.printCoffeeDetails();
        System.out.println();
        americano.makeAmericano();
        return americano;
    }

    public Coffee makePumpkinSpiceLatte() {
        Intensity coffeeIntensity = getIntensity();
        int mlOfMilk = Cappuccino.getMlOfMilk(coffeeIntensity);
        int mlOfPumpkinSpice = PumpkinSpiceLatte.getMlOfPumpkinSpice(coffeeIntensity);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(coffeeIntensity, mlOfMilk, mlOfPumpkinSpice);
        pumpkinSpiceLatte.printCoffeeDetails();
        System.out.println();
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
        return pumpkinSpiceLatte;
    }

    public Coffee makeSyrupCappuccino() {
        Intensity coffeeIntensity = getIntensity();
        int mlOfMilk = Cappuccino.getMlOfMilk(coffeeIntensity);
        SyrupType syrupType = getSyrupType();
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(coffeeIntensity, mlOfMilk, syrupType);
        syrupCappuccino.printCoffeeDetails();
        System.out.println();
        syrupCappuccino.makeSyrupCappuccino();
        return syrupCappuccino;
    }

    public void printAllOrders() {
        System.out.println("Here are all the orders:");
        for (Coffee coffee : orders) {
            coffee.printCoffeeDetails();
            System.out.println();
        }
    }
}
