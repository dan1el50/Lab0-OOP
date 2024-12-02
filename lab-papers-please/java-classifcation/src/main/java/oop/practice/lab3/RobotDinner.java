package oop.practice.lab3;

public class RobotDinner implements Dineable {
    private int robotsServed = 0;
    private int robotsSkipped = 0;

    @Override
    public void serveDinner(Car car) {
        if (car.isDining()) {
            System.out.println("Serving dinner to robots in car " + car.getId());
            robotsServed++; // Increment served count
        } else {
            System.out.println("Skipping dinner for robots in car " + car.getId());
            robotsSkipped++; // Increment skipped count
        }
    }
}
