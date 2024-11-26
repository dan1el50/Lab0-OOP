package oop.practice.lab3;

public class Car {
    private final String id;
    private final boolean isDining;

    public Car(String id, boolean isDining) {
        this.id = id;
        this.isDining = isDining;
    }

    public String getId() {
        return id;
    }

    public boolean isDining() {
        return isDining;
    }
}

