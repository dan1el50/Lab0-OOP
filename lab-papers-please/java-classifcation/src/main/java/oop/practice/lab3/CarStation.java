package oop.practice.lab3;

public class CarStation {
    private final Dineable diningService;
    private final Refuelable refuelingService;
    private final Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        if (diningService == null || refuelingService == null || queue == null) {
            throw new IllegalArgumentException("Services and queue cannot be null.");
        }
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null.");
        }
        queue.enqueue(car);
        System.out.println("Car added to the queue: " + car);
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            System.out.println("Serving car: " + car);

            serveRefueling(car);
            serveDining(car);
        }
    }

    private void serveRefueling(Car car) {
        if ((car.getType() == CarType.GAS && refuelingService instanceof GasStation) ||
                (car.getType() == CarType.ELECTRIC && refuelingService instanceof ElectricStation)) {
            refuelingService.refuel(car.getId());
        } else {
            System.out.println("Car " + car.getId() + " cannot be refueled at this station.");
        }
    }

    private void serveDining(Car car) {
        if (car.isDining()) {
            if ((car.getPassengers() == PassengersType.PEOPLE && diningService instanceof PeopleDinner) ||
                    (car.getPassengers() == PassengersType.ROBOTS && diningService instanceof RobotDinner)) {
                diningService.serveDinner(car.getId());
            } else {
                System.out.println("Car " + car.getId() + " cannot dine at this station.");
            }
        } else {
            System.out.println("Car " + car.getId() + " does not want to dine.");
        }
    }
}
