package edu;

import edu.exceptions.NoSuchVehicleException;
import edu.vehicles.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class Road {
    public Set<Vehicle> vehicles = new HashSet<Vehicle>();
    public int getCountOfHumans() {
        int res = 0;
        for (Vehicle vehicle : vehicles) {
            res += vehicle.getCountOfPassengers();
        }
        return res;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) throws NoSuchVehicleException {
        if(!vehicles.contains(vehicle))
            throw new NoSuchVehicleException("Такой нет машины на дороге");
        else
            vehicles.remove(vehicle);
    }
}
