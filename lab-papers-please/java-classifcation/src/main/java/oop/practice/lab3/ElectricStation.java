package oop.practice.lab3;

public class ElectricStation implements Refuelable {
    private int electricCarsServed = 0; // Tracks how many electric cars were refueled

    @Override
    public void refuel(int carId) {
        System.out.println("Recharging electric car " + carId);
        electricCarsServed++;
    }

    public int getElectricCarsServed() {
        return electricCarsServed;
    }
}
