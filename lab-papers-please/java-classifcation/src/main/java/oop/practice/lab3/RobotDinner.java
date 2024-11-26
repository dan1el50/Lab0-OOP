package oop.practice.lab3;

public class RobotDinner implements Dineable {
    private int robotsServed = 0;
    private int robotsSkipped = 0; // Tracks cars that did not want to dine

    @Override
    public void serveDinner(String carId) {
        if (carId.startsWith("Dine")) {
            System.out.println("Serving dinner to robots in car " + carId);
            robotsServed++;
        } else {
            System.out.println("Skipping dinner for car " + carId);
            robotsSkipped++;
        }
    }

    public int getRobotsServed() {
        return robotsServed;
    }

    public int getRobotsSkipped() {
        return robotsSkipped;
    }
}
