package oop.practice.lab3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    private final int id;
    private final CarType type;
    private final PassengersType passengers;
    private final boolean isDining;
    private final double consumption;

    @JsonCreator
    public Car(
            @JsonProperty("id") int id,
            @JsonProperty("type") CarType type,
            @JsonProperty("passengers") PassengersType passengers,
            @JsonProperty("isDining") boolean isDining,
            @JsonProperty("consumption") double consumption) {
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

    @Override
    public String toString() {
        return String.format("Car{id=%d, type=%s, passengers=%s, isDining=%b, consumption=%.2f}",
                id, type, passengers, isDining, consumption);
    }
}
