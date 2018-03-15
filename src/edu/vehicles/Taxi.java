package edu.vehicles;

import edu.options.VihecleEngineType;

public class Taxi extends Car {

    public Taxi(String name, int yearOfIssue, int passengerCapacity, VihecleEngineType engineType) {
        super(name, yearOfIssue, passengerCapacity, engineType);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", passengerCapacity=" + passengerCapacity +
                ", engineType=" + engineType +
                '}';
    }
}
