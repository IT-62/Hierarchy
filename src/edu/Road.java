package edu;

import edu.vehicles.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class Road {
    public Set<Vehicle> vehicles = new HashSet<Vehicle>();
    public int getCountOfHumans() {
        int res = 0;
        for (Vehicle vehicle:
             vehicles) {
            res += vehicle.getCountOfPassengers();
        }
        return res;
    }

    public void addVehicle(Vehicle vahicle){
        vehicles.add(vahicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
}
