package edu.vehicles;

import edu.options.VehicleEngineType;
import edu.passengers.Passenger;

public class Car<T extends Passenger> extends Vehicle<T> {
    public Car(String name, int yearOfIssue, int passengerCapacity, VehicleEngineType engineType){
        super(name, yearOfIssue, passengerCapacity, engineType);
    }

    @Override
    public String toString() {
        return "Vehicle type: Car" +
                "name: '" + name + '\'' + "\n" +
                "yearOfIssue: " + yearOfIssue + "\n" +
                "passengerCapacity: " + passengerCapacity + "\n" +
                "passengers: " + passengers + "\n" +
                "engineType: " + engineType + "\n";
    }
}
