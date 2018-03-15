package edu.vehicles;

import edu.options.VihecleEngineType;
import edu.passengers.Passenger;

public class Car<T extends Passenger> extends Vehicle<T> {
    public Car(String name, int yearOfIssue, int passengerCapacity, VihecleEngineType engineType){
        super(name, yearOfIssue, passengerCapacity, engineType);
    }

    @Override
    public String toString() {
        return null;
    }
}
