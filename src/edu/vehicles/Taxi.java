package edu.vehicles;

import edu.options.VehicleEngineType;

public class Taxi extends Car {

    public Taxi(String name, int yearOfIssue, int passengerCapacity, VehicleEngineType engineType) {
        super(name, yearOfIssue, passengerCapacity, engineType);
    }

    @Override
    public String toString() {
        return "Vehicle type: Taxi" + "\n" +
                "name: '" + name + '\'' + "\n" +
                "yearOfIssue: " + yearOfIssue + "\n" +
                "passengerCapacity: " + passengerCapacity + "\n" +
                "engineType: " + engineType + "\n";
    }
}
