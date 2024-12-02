package oop.practice.lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarSummary carSummary = new CarSummary(); // Create a CarSummary instance

        Queue<Car> gasQueueForPeople = new ArrayQueue<>();
        Queue<Car> gasQueueForRobots = new ArrayQueue<>();
        Queue<Car> electricQueueForPeople = new ArrayQueue<>();
        Queue<Car> electricQueueForRobots = new ArrayQueue<>();


        GasStation gasStation = new GasStation();
        ElectricStation electricStation = new ElectricStation();

        // Create the 4 stations
        CarStation gasStationWithPeople = new CarStation(new PeopleDinner(), gasStation, gasQueueForPeople, carSummary);
        CarStation gasStationWithRobots = new CarStation(new RobotDinner(), gasStation, gasQueueForRobots, carSummary);
        CarStation electricStationWithPeople = new CarStation(new PeopleDinner(), electricStation, electricQueueForPeople, carSummary);
        CarStation electricStationWithRobots = new CarStation(new RobotDinner(), electricStation, electricQueueForRobots, carSummary);

        List<CarStation> stations = new ArrayList<>();
        stations.add(gasStationWithPeople);
        stations.add(gasStationWithRobots);
        stations.add(electricStationWithPeople);
        stations.add(electricStationWithRobots);

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
    }
}
