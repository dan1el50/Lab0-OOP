package oop.practice.lab3;

public class GasStation implements Refuelable {
    private int gasCarsServed = 0; // Tracks how many gas cars were refueled

    @Override
    public void refuel(String carId) {
        System.out.println("Refueling gas car " + carId);
        gasCarsServed++;
    }

    public int getGasCarsServed() {
        return gasCarsServed;
    }
}