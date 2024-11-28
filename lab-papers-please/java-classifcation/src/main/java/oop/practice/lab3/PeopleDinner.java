package oop.practice.lab3;

public class PeopleDinner implements Dineable {
    private int peopleServed = 0;
    private int peopleSkipped = 0;

    @Override
    public void serveDinner(Car car) {
        if (car.isDining()) {
            System.out.println("Serving dinner to people in car " + car.getId());
            peopleServed++; // Increment served count
        } else {
            System.out.println("Skipping dinner for people in car " + car.getId());
            peopleSkipped++; // Increment skipped count
        }
    }

    public int getPeopleServed() {
        return peopleServed;
    }

    public int getPeopleSkipped() {
        return peopleSkipped;
    }
}
