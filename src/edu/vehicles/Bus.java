package edu.vehicles;

import edu.options.BusAppointmentType;
import edu.options.VehicleEngineType;

public class Bus extends Vehicle {
    private BusAppointmentType appointmentType;
    public Bus(String name, int yearOfIssue, int passengerCapacity, VehicleEngineType engineType,
               BusAppointmentType appointmentType){
        super(name, yearOfIssue, passengerCapacity,engineType);
        this.appointmentType = appointmentType;
    }

    @Override
    public String toString() {
        return "Vegicle type: Bus\n" +
                "appointmentType: " + appointmentType + "\n" +
                "name: '" + name + '\'' + "\n" +
                "yearOfIssue: " + yearOfIssue + "\n" +
                "passengerCapacity: " + passengerCapacity + "\n" +
                "passengers: " + passengers + "\n" +
                "engineType: " + engineType + "\n";
    }
}
