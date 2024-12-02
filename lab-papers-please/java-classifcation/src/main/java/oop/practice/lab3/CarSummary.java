package oop.practice.lab3;

public class CarSummary {
    private int electricCars = 0;
    private int gasCars = 0;
    private int peopleCars = 0;
    private int robotsCars = 0;
    private int diningCars = 0;
    private int notDiningCars = 0;
    private double electricConsumption = 0;
    private double gasConsumption = 0;

    public void addCar(Car car) {
        // Count cars based on type and passengers
        if (car.getType() == CarType.ELECTRIC) {
            electricCars++;
            electricConsumption += car.getConsumption();
        } else if (car.getType() == CarType.GAS) {
            gasCars++;
            gasConsumption += car.getConsumption();
        }

        if (car.getPassengers() == PassengersType.PEOPLE) {
            peopleCars++;
        } else if (car.getPassengers() == PassengersType.ROBOTS) {
            robotsCars++;
        }

        // Count cars based on dining status
        if (car.isDining()) {
            diningCars++;
        } else {
            notDiningCars++;
        }
    }

    public String toJson() {
        // Generate a JSON string for the totals
        return String.format("{\"ELECTRIC\": %d, \"GAS\": %d, \"PEOPLE\": %d, \"ROBOTS\": %d, \"DINING\": %d, \"NOT_DINING\": %d, " +
                        "\"CONSUMPTION\": {\"ELECTRIC\": %.0f, \"GAS\": %.0f}}",
                electricCars, gasCars, peopleCars, robotsCars, diningCars, notDiningCars, electricConsumption, gasConsumption);
    }
}
