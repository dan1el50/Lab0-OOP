package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test2 {


    @Test
    public void testIntegrationScenario() {
        // A scenario that combines all services
        ElectricStation electricStation = new ElectricStation();
        GasStation gasStation = new GasStation();
        PeopleDinner peopleDinner = new PeopleDinner();
        RobotDinner robotDinner = new RobotDinner();

        // Serving electric cars
        electricStation.refuel(1);
        electricStation.refuel(2);

        // Serving gas cars
        gasStation.refuel(3);
        gasStation.refuel(4);

        // Serving dinner
        peopleDinner.serveDinner(2); // People dine
        robotDinner.serveDinner(5); // Robots dine

        // Verify counts
        assertEquals(2, electricStation.getElectricCarsServed(), "Electric cars served count should be 2");
        assertEquals(2, gasStation.getGasCarsServed(), "Gas cars served count should be 2");
        assertEquals(1, peopleDinner.getPeopleServed(), "People served count should be 1");
        assertEquals(1, robotDinner.getRobotsServed(), "Robots served count should be 1");
    }
}
