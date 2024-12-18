package oop.practice.lab3;

import java.util.List;

public class Semaphore {
    private final List<CarStation> stations;

    public Semaphore(List<CarStation> stations) {
        if (stations == null || stations.isEmpty()) {
            throw new IllegalArgumentException("Stations list cannot be null or empty.");
        }
        this.stations = stations;
    }

    public void routeCar(Car car) {
        for (CarStation station : stations) {
            if (canRefuelAtStation(station, car)) {
                station.addCar(car);
                //System.out.println("Car " + car + " routed to station.");
                return;
            }
        }

        // If no station matched for refueling, route to the first available station
        System.out.println("No exact match found for car " + car + ". Routing to default station.");
        stations.get(0).addCar(car);
    }

    private boolean canRefuelAtStation(CarStation station, Car car) {
        if (car.getType() == CarType.GAS && station.getRefuelingService() instanceof GasStation) {
            return true;
        } else if (car.getType() == CarType.ELECTRIC && station.getRefuelingService() instanceof ElectricStation) {
            return true;
        }
        return false;
    }
}
