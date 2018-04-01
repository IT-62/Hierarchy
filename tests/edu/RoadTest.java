package edu;

import edu.exceptions.NoSuchPassengerException;
import edu.exceptions.NoSuchVehicleException;
import edu.options.PoliceRanks;
import edu.options.VehicleEngineType;
import edu.passengers.Passenger;
import edu.passengers.Policeman;
import edu.vehicles.PoliceCar;
import edu.vehicles.Taxi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoadTest {
    Road road;
    @Before
    public void setUp() throws Exception {
        road = new Road();
        PoliceCar policeCar1 = new PoliceCar("ford", 1999, 6, VehicleEngineType.DIESEL);
        policeCar1.download(new Policeman("Alex", "Ilyin", (byte)25, 2, PoliceRanks.COLONEL));
        policeCar1.download(new Policeman("Vova", "Ol", (byte)25, 3, PoliceRanks.GENERAL));
        Taxi taxi1 = new Taxi("zaz", 1232, 4, VehicleEngineType.PETROL);
        taxi1.download(new Passenger("Rita", "Siriak", (byte)19));
        road.addVehicle(policeCar1);
        road.addVehicle(taxi1);
    }

    @After
    public void tearDown() throws Exception {
        road = null;
    }

    @Test
    public void testGetCountOfHumans() {
        assertEquals(3, road.getCountOfHumans());
        assertNotEquals(4, road.getCountOfHumans());
    }

    @Test
    public void testAddVehicle() {
    }

    @Test(expected = NoSuchVehicleException.class)
    public void testRemoveVehicle() throws Exception {
        road.removeVehicle(new Taxi("zaz", 1232, 5, VehicleEngineType.PETROL));
    }
}