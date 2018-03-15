package edu.vehicles;

import edu.options.VihecleEngineType;
import edu.passengers.Policeman;

public class PoliceCar extends Car<Policeman> {
    public PoliceCar(String name, int yearOfIssue, int passengerCapacity, VihecleEngineType engineType) {
        super(name, yearOfIssue, passengerCapacity, engineType);
    }
}
