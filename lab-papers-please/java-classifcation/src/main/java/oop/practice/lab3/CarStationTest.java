//package oop.practice.lab3;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//public class CarStationTest {
//
//    @Test
//    public void testMixedCarStation() {
//        Queue<Car> queue = new ArrayQueue<>();
//        Dineable diningService = new PeopleDinner();
//        Refuelable refuelingService = new GasStation();
//        CarStation station = new CarStation(diningService, refuelingService, queue);
//
//        // Add a mix of valid and invalid cars
//        Car car1 = new Car(1, CarType.GAS, PassengersType.PEOPLE, true, 20.0); // Valid for both refueling and dining
//        Car car2 = new Car(2, CarType.ELECTRIC, PassengersType.ROBOTS, false, 15.0); // Invalid for both
//        Car car3 = new Car(3, CarType.GAS, PassengersType.ROBOTS, true, 25.0); // Valid refuel, invalid dining
//        Car car4 = new Car(4, CarType.ELECTRIC, PassengersType.PEOPLE, true, 30.0); // Invalid refuel, valid dining
//        Car car5 = new Car(5, CarType.GAS, PassengersType.PEOPLE, false, 10.0); // Valid refuel, no dining
//
//        // Enqueue cars
//        station.addCar(car1);
//        station.addCar(car2);
//        station.addCar(car3);
//        station.addCar(car4);
//        station.addCar(car5);
//
//        // Serve all cars
//        station.serveCars();
//
//        // Assertions
//        assertTrue(queue.isEmpty(), "Queue should be empty after serving all cars");
//
//        // Verify stats for dining
//        if (diningService instanceof PeopleDinner) {
//            assertEquals(2, ((PeopleDinner) diningService).getPeopleServed(), "Two people should be served");
//        }
//        if (diningService instanceof RobotDinner) {
//            assertEquals(0, ((RobotDinner) diningService).getRobotsServed(), "No robots should be served");
//        }
//
//        // Verify stats for refueling
//        if (refuelingService instanceof GasStation) {
//            assertEquals(3, ((GasStation) refuelingService).getGasCarsServed(), "Three gas cars should be refueled");
//        }
//        if (refuelingService instanceof ElectricStation) {
//            assertEquals(0, ((ElectricStation) refuelingService).getElectricCarsServed(), "No electric cars should be refueled");
//        }
//    }
//}
