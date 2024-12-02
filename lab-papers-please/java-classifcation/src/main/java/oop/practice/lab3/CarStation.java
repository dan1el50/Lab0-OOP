package oop.practice.lab3;

public class CarStation {
    private final Dineable diningService;
    private final Refuelable refuelingService;
    private final Queue<Car> queue;
    private final CarSummary carSummary;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue, CarSummary carSummary) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
        this.carSummary = carSummary;
    }

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null.");
        }
        queue.enqueue(car);
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            System.out.println();
            System.out.println("Served car " + car.getId());

            serveRefueling(car);
            serveDining(car);

            // Add the car to the summary after it's processed
            carSummary.addCar(car);
        }
    }

    private void serveRefueling(Car car) {
        refuelingService.refuel(car.getId()); // Refueling handled in the respective service
    }

    private void serveDining(Car car) {
        diningService.serveDinner(car); // Dining handled in the respective service
    }

    public Refuelable getRefuelingService() {
        return refuelingService;
    }

    public Dineable getDiningService() {
        return diningService;
    }
}
