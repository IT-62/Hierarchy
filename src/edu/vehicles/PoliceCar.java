package edu.vehicles;

import edu.options.VehicleEngineType;
import edu.passengers.Policeman;

public class PoliceCar extends Car<Policeman> {
    public PoliceCar(String name, int yearOfIssue, int passengerCapacity, VehicleEngineType engineType) {
        super(name, yearOfIssue, passengerCapacity, engineType);
    }

    @Override
    public String toString() {
        return "Vehicle type: PoliceCar" + "\n" +
                "name: '" + name + '\'' + "\n" +
                "yearOfIssue: " + yearOfIssue + "\n" +
                "passengerCapacity: " + passengerCapacity + "\n" +
                "passengers: " + passengers + "\n" +
                "engineType: " + engineType + "\n";
    }
}
