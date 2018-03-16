package edu.vehicles;

import edu.options.VehicleEngineType;
import edu.passengers.Fireman;

public class FireEngine extends Car<Fireman> {

    public FireEngine(String name, int yearOfIssue, int passengerCapacity, VehicleEngineType engineType) {
        super(name, yearOfIssue, passengerCapacity, engineType);
    }

    @Override
    public String toString() {
        return null;
    }
}
