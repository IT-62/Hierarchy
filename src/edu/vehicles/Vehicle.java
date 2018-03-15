package edu.vehicles;

import edu.options.VihecleEngineType;
import edu.passengers.Passenger;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehicle<T extends Passenger> {
    protected String name;
    protected int yearOfIssue;
    protected int passengerCapacity;
    protected Set<T> passengers = new HashSet<T>();
    protected VihecleEngineType engineType;
    public Vehicle(String name, int yearOfIssue, int passengerCapacity, VihecleEngineType engineType) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.passengerCapacity = passengerCapacity;
        this.engineType = engineType;
    }

    public void download(){

    }

    @Override
    public abstract String toString();
}
