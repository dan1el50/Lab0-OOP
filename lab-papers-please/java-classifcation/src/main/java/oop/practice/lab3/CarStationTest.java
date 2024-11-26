package oop.practice.lab3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarStationTest {

    @Test
    public void testServeCarsWithArrayQueue() {
        // Mock services and queue
        PeopleDinner diningService = new PeopleDinner();
        ElectricStation refuelingService = new ElectricStation();
        Queue<Car> queue = new ArrayQueue<>(); // Use ArrayQueue implementation

        CarStation carStation = new CarStation(diningService, refuelingService, queue);

        carStation.addCar(new Car("DineCar1", true)); // Wants to dine
        carStation.addCar(new Car("Car2", false));   // Does not want to dine
        carStation.addCar(new Car("DineCar3", true)); // Wants to dine

        carStation.serveCars();
        assertEquals(2, diningService.getPeopleServed(), "Should have served 2 cars with dining");
        assertEquals(3, refuelingService.getElectricCarsServed(), "Should have refueled 3 cars");
        assertTrue(queue.isEmpty(), "Queue should be empty after serving all cars");
    }

    @Test
    public void testServeCarsWithLinkedListQueue() {
        // Mock services and queue
        PeopleDinner diningService = new PeopleDinner();
        ElectricStation refuelingService = new ElectricStation();
        Queue<Car> queue = new LinkedListQueue<>(); // Use LinkedListQueue implementation

        // Create CarStation with DI
        CarStation carStation = new CarStation(diningService, refuelingService, queue);

        carStation.addCar(new Car("DineCar1", true)); // Wants to dine
        carStation.addCar(new Car("Car2", false));   // Does not want to dine
        carStation.addCar(new Car("DineCar3", true)); // Wants to dine

        carStation.serveCars();
        assertEquals(2, diningService.getPeopleServed(), "Should have served 2 cars with dining");
        assertEquals(3, refuelingService.getElectricCarsServed(), "Should have refueled 3 cars");
        assertTrue(queue.isEmpty(), "Queue should be empty after serving all cars");
    }

    @Test
    public void testServeCarsWithDequeQueue() {
        // Mock services and queue
        PeopleDinner diningService = new PeopleDinner();
        ElectricStation refuelingService = new ElectricStation();
        Queue<Car> queue = new DequeQueue<>(); // Use DequeQueue implementation

        // Create CarStation with DI
        CarStation carStation = new CarStation(diningService, refuelingService, queue);

        // Add cars to the queue
        carStation.addCar(new Car("DineCar1", true)); // Wants to dine
        carStation.addCar(new Car("Car2", false));   // Does not want to dine
        carStation.addCar(new Car("DineCar3", true)); // Wants to dine

        carStation.serveCars();
        assertEquals(2, diningService.getPeopleServed(), "Should have served 2 cars with dining");
        assertEquals(3, refuelingService.getElectricCarsServed(), "Should have refueled 3 cars");
        assertTrue(queue.isEmpty(), "Queue should be empty after serving all cars");
    }
}