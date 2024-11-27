package oop.practice.lab3;

public class PeopleDinner implements Dineable {
    private int peopleServed = 0;

    @Override
    public void serveDinner(int carId) {
        if (carId <= 0) {
            throw new IllegalArgumentException("Car ID must be positive.");
        }
        System.out.println("Serving dinner to people in car " + carId);
        peopleServed++;
    }

    public int getPeopleServed() {
        return peopleServed;
    }
}
