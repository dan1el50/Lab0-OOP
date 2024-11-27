package oop.practice.lab3;

public class RobotDinner implements Dineable {
    private int robotsServed = 0;

    @Override
    public void serveDinner(int carId) {
        if (carId <= 0) {
            throw new IllegalArgumentException("Car ID must be positive.");
        }
        System.out.println("Serving dinner to robots in car " + carId);
        robotsServed++;
    }

    public int getRobotsServed() {
        return robotsServed;
    }
}
