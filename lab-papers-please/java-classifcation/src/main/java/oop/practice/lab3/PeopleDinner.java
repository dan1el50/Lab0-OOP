package oop.practice.lab3;

public class PeopleDinner implements Dineable {
    private int peopleServed = 0;
    private int peopleSkipped = 0; // Tracks cars that did not want to dine

    @Override
    public void serveDinner(String carId) {
        if (carId.startsWith("Dine")) {
            System.out.println("Serving dinner to people in car " + carId);
            peopleServed++;
        } else {
            System.out.println("Skipping dinner for car " + carId);
            peopleSkipped++;
        }
    }

    public int getPeopleServed() {
        return peopleServed;
    }

    public int getPeopleSkipped() {
        return peopleSkipped;
    }
}
