package oop.practice.lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarSummary carSummary = new CarSummary(); // Create a CarSummary instance

        Queue<Car> gasQueue = new ArrayQueue<>();
        Queue<Car> electricQueue = new ArrayQueue<>();

        GasStation gasStation = new GasStation();
        ElectricStation electricStation = new ElectricStation();

        CarStation gasStationHandler = new CarStation(new PeopleDinner(), gasStation, gasQueue, carSummary);
        CarStation electricStationHandler = new CarStation(new RobotDinner(), electricStation, electricQueue, carSummary);

        List<CarStation> stations = new ArrayList<>();
        stations.add(gasStationHandler);
        stations.add(electricStationHandler);

        Semaphore semaphore = new Semaphore(stations);

        // Pass the carSummary to the scheduler constructor
        Scheduler scheduler = new Scheduler(semaphore, stations, "src/main/java/oop/practice/lab3/queue", carSummary);

        System.out.println("Program started. You can now run generator.py.");
        scheduler.start();

        // Wait for all cars to be served
        try {
            Thread.sleep(30000); // Adjust time as needed for testing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After serving all cars, print the final summary
        System.out.println(carSummary.toJson());
    }
}
