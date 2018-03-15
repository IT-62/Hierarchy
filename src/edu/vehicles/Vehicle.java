package edu.vehicles;

import edu.options.VihecleEngineType;

public abstract class Vehicle {
    protected String name;
    protected int yearOfIssue;
    protected int passengerCapacity;
    protected VihecleEngineType engineType;
    public Vehicle(String name, int yearOfIssue, int passengerCapacity, VihecleEngineType engineType) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.passengerCapacity = passengerCapacity;
        this.engineType = engineType;
    }
}
