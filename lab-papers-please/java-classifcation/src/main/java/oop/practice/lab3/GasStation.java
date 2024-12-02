package oop.practice.lab3;

public class GasStation implements Refuelable {
    private int gasCarsServed = 0;

    @Override
    public void refuel(int carId) {
        if (carId <= 0) {
            throw new IllegalArgumentException("Car ID must be positive.");
        }
        System.out.println("Refueling gas car " + carId);
        gasCarsServed++;
    }
}
