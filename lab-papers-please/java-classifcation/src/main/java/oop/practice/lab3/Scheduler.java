package oop.practice.lab3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    private final Semaphore semaphore;
    private final List<CarStation> stations;
    private final String queueFolderPath;
    private final CarSummary carSummary;
    private long lastUpdatedTime = System.currentTimeMillis(); // Time when the folder was last updated

    public Scheduler(Semaphore semaphore, List<CarStation> stations, String queueFolderPath, CarSummary carSummary) {
        this.semaphore = semaphore;
        this.stations = stations;
        this.queueFolderPath = queueFolderPath;
        this.carSummary = carSummary;
    }

    public void start() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Task 1: Monitor the folder for new JSON files every 3 seconds
        executor.scheduleAtFixedRate(() -> {
            try {
                File folder = new File(queueFolderPath);
                File[] jsonFiles = folder.listFiles((dir, name) -> name.endsWith(".json"));

                if (jsonFiles != null && jsonFiles.length > 0) {
                    for (File file : jsonFiles) {
                        Car car = parseJsonToCar(file);
                        if (car != null) {
                            semaphore.routeCar(car);
                            lastUpdatedTime = System.currentTimeMillis();  // Reset the timer whenever a new car is added
                        }
                        file.delete(); // Delete the file after processing
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 3, TimeUnit.SECONDS);

        // Task 2: Serve cars every 5 seconds
        executor.scheduleAtFixedRate(() -> {
            stations.forEach(CarStation::serveCars);  // Serve cars
        }, 0, 5, TimeUnit.SECONDS);

        // Task 3: Check for timeout (no new cars added in the last 5 seconds)
        executor.scheduleAtFixedRate(() -> {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastUpdatedTime > 5000) {  // If 5 seconds have passed without new cars
                //System.out.println("No new cars in the last 5 seconds. Stopping...");
                printSummary();
                executor.shutdown();  // Stop the executor
                System.exit(0);
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    private void printSummary() {
        System.out.println(carSummary.toJson());  // Print the final summary
    }

    private Car parseJsonToCar(File file) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, Car.class);
        } catch (Exception e) {
            return null; // Silent failure for parsing
        }
    }
}
