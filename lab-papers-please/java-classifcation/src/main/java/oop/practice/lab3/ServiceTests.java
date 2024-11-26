package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTests {

    @Test
    public void testPeopleDinner() {
        PeopleDinner peopleDinner = new PeopleDinner();

        // Serve cars with "Dine" in their ID
        peopleDinner.serveDinner("DineCar1");
        peopleDinner.serveDinner("DineCar2");

        // Skip cars without "Dine" in their ID
        peopleDinner.serveDinner("Car3");
        peopleDinner.serveDinner("Car4");

        // Assertions for served cars
        assertEquals(2, peopleDinner.getPeopleServed(), "Should have served 2 cars with 'Dine' in their ID");

        // Assertions for skipped cars
        assertEquals(2, peopleDinner.getPeopleSkipped(), "Should have skipped 2 cars without 'Dine' in their ID");
    }

    @Test
    public void testRobotDinner() {
        RobotDinner robotDinner = new RobotDinner();

        // Serve cars with "Dine" in their ID
        robotDinner.serveDinner("DineCar5");
        robotDinner.serveDinner("DineCar6");

        // Skip cars without "Dine" in their ID
        robotDinner.serveDinner("Car7");
        robotDinner.serveDinner("Car8");

        // Assertions for served cars
        assertEquals(2, robotDinner.getRobotsServed(), "Should have served 2 cars with 'Dine' in their ID");

        // Assertions for skipped cars
        assertEquals(2, robotDinner.getRobotsSkipped(), "Should have skipped 2 cars without 'Dine' in their ID");
    }

    @Test
    public void testElectricStation() {
        ElectricStation electricStation = new ElectricStation();

        // Refuel electric cars
        electricStation.refuel("ElectricCar1");
        electricStation.refuel("ElectricCar2");
        electricStation.refuel("ElectricCar3");

        // Assertions for refueled cars
        assertEquals(3, electricStation.getElectricCarsServed(), "Should have refueled 3 electric cars");
    }

    @Test
    public void testGasStation() {
        GasStation gasStation = new GasStation();

        // Refuel gas cars
        gasStation.refuel("GasCar1");
        gasStation.refuel("GasCar2");

        // Assertions for refueled cars
        assertEquals(2, gasStation.getGasCarsServed(), "Should have refueled 2 gas cars");
    }
}
