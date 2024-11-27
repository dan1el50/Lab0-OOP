package oop.practice.lab3;

public class CarStation {
    private final Dineable diningService;
    private final Refuelable refuelingService;
    private final Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void addCar(Car car) {
        queue.enqueue(car);
        System.out.println("Car added to the queue: " + car);
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            System.out.println("Serving car: " + car);

            // Validate car type and refuel
            if ((car.getType() == CarType.GAS && refuelingService instanceof GasStation) ||
                    (car.getType() == CarType.ELECTRIC && refuelingService instanceof ElectricStation)) {
                refuelingService.refuel(car.getId());
            } else {
                System.out.println("Car " + car.getId() + " cannot be refueled at this station.");
            }

            // Serve dinner if dining service matches passenger type
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
}
