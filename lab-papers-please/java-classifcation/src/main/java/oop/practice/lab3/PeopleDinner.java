package oop.practice.lab3;

public class PeopleDinner implements Dineable {
    private int peopleServed = 0;
    private int peopleSkipped = 0; // Tracks cars that did not want to dine

    @Override
    public void serveDinner(int carId) {
        System.out.println("Serving dinner to people in car " + carId);
        peopleServed++;
    }

    public int getPeopleServed() {
        return peopleServed;
    }

    public int getPeopleSkipped() {
        return peopleSkipped;
    }
}
