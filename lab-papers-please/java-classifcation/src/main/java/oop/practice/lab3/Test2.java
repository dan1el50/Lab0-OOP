package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test2 {

    @Test
    public void test() {
        // Electric Station Test
        ElectricStation electricStation = new ElectricStation();
        electricStation.refuel(1);
        electricStation.refuel(2);
        assertEquals(2, electricStation.getElectricCarsServed(), "Electric cars served count should be 2");

        // Gas Station Test
        GasStation gasStation = new GasStation();
        gasStation.refuel(3);
        gasStation.refuel(4);
        gasStation.refuel(5);
        assertEquals(3, gasStation.getGasCarsServed(), "Gas cars served count should be 3");

        // People Dinner Test
        PeopleDinner peopleDinner = new PeopleDinner();
        peopleDinner.serveDinner(6);
        peopleDinner.serveDinner(7);
        assertEquals(2, peopleDinner.getPeopleServed(), "People served count should be 2");

        // Optional: Uncomment if skip logic is implemented
        // peopleDinner.skipDinner();
        // assertEquals(1, peopleDinner.getPeopleSkipped(), "People skipped count should be 1");

        // Robot Dinner Test
        RobotDinner robotDinner = new RobotDinner();
        robotDinner.serveDinner(8);
        robotDinner.serveDinner(9);
        assertEquals(2, robotDinner.getRobotsServed(), "Robots served count should be 2");

        // Optional: Uncomment if skip logic is implemented
        // robotDinner.skipDinner();
        // assertEquals(1, robotDinner.getRobotsSkipped(), "Robots skipped count should be 1");

        // Edge Cases
        // Test invalid car IDs and ensure proper exception handling
        try {
            electricStation.refuel(-1); // Simulate invalid car ID
            fail("Invalid car ID should throw an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected, do nothing
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }

        try {
            gasStation.refuel(0); // Simulate invalid car ID
            fail("Invalid car ID should throw an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected, do nothing
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }

        try {
            peopleDinner.serveDinner(-100); // Simulate invalid car ID
            fail("Invalid car ID should throw an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected, do nothing
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }

        try {
            robotDinner.serveDinner(-200); // Simulate invalid car ID
            fail("Invalid car ID should throw an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected, do nothing
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}
