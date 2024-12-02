package oop.practice.lab3;

public class ElectricStation implements Refuelable {
    private int electricCarsServed = 0;

    @Override
    public void refuel(int carId) {
        if (carId <= 0) {
            throw new IllegalArgumentException("Car ID must be positive.");
        }
        System.out.println("Recharging electric car " + carId);
        electricCarsServed++;
    }

}
