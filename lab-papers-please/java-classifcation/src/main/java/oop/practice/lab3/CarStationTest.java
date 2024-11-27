package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarStationTest {

    // Helper method to test different Queue implementations
    private void testCarStationWithQueue(Queue<Car> queue, String queueType) {
        System.out.println("Testing with: " + queueType);

        // Mock services
        PeopleDinner diningService = new PeopleDinner();
        ElectricStation refuelingService = new ElectricStation();

        // Create CarStation with DI
        CarStation carStation = new CarStation(diningService, refuelingService, queue);

        // Add cars to the queue
        carStation.addCar(new Car(1, CarType.ELECTRIC, PassengersType.PEOPLE, true, 4.8)); // Wants to dine
        carStation.addCar(new Car(2, CarType.GAS, PassengersType.ROBOTS, false, 6.9));   // Does not want to dine
        carStation.addCar(new Car(3, CarType.ELECTRIC, PassengersType.PEOPLE, true, 10)); // Wants to dine

        // Serve cars
        carStation.serveCars();

        // Assertions for dining service
        assertEquals(2, diningService.getPeopleServed(), "Should have served 2 cars with dining");

        // Assertions for refueling service
        assertEquals(2, refuelingService.getElectricCarsServed(), "Should have recharged 2 cars");

        // Queue should be empty after serving
        assertTrue(queue.isEmpty(), "Queue should be empty after serving all cars");
    }

    @Test
    public void testServeCarsWithArrayQueue() {
        testCarStationWithQueue(new ArrayQueue<>(), "ArrayQueue");
    }

    @Test
    public void testServeCarsWithLinkedListQueue() {
        testCarStationWithQueue(new LinkedListQueue<>(), "LinkedListQueue");
    }

    @Test
    public void testServeCarsWithDequeQueue() {
        testCarStationWithQueue(new DequeQueue<>(), "DequeQueue");
    }
}
