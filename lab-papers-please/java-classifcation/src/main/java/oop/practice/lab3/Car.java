package oop.practice.lab3;

public class Car {
    private int id;
    private CarType type;
    private PassengersType passengers;
    private boolean isDining;
    private double consumption;

    public Car(int id, CarType type, PassengersType passengers, boolean isDining, double consumption) {
        this.id = id;
        this.type = type;
        this.passengers = passengers;
        this.isDining = isDining;
        this.consumption = consumption;
    }

    public int getId() {
        return id;
    }

    public CarType getType() {
        return type;
    }

    public PassengersType getPassengers() {
        return passengers;
    }

    public boolean isDining() {
        return isDining;
    }

    public double getConsumption() {
        return consumption;
    }
}

