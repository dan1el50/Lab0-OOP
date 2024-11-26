package oop.practice.lab3;
import oop.practice.lab3.Queue; // Ensure this is your custom interface

public class CarStation {
    private final Dineable diningService;
    private final Refuelable refuelingService;
    private final Queue<Car> queue; // Custom Queue<Car>

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void addCar(Car car) {
        queue.enqueue(car); // Your custom enqueue method
        System.out.println("Car added to the queue: " + car.getId());
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue(); // Your custom dequeue method
            System.out.println("Serving car: " + car.getId());

            // Refuel the car
            refuelingService.refuel(car.getId());

            // Serve dinner if the car wants to dine
            if (car.isDining()) {
                diningService.serveDinner(car.getId());
            } else {
                System.out.println("Car " + car.getId() + " does not want to dine.");
            }
        }
    }
}


