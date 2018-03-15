package edu.vehicles;

import edu.options.BusAppointmentType;
import edu.options.VihecleEngineType;

public class Bus extends Vehicle {
    private BusAppointmentType appointmentType;
    public Bus(String name, int yearOfIssue, int passengerCapacity, VihecleEngineType engineType,
               BusAppointmentType appointmentType){
        super(name, yearOfIssue, passengerCapacity,engineType);
        this.appointmentType = appointmentType;
    }

    @Override
    public String toString() {
        return null;
    }
}
