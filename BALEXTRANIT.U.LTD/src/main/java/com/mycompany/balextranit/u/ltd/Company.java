package com.mycompany.balextranit.u.ltd;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> vehicles;
    private int lostFares;

    public Company() {
        vehicles = new ArrayList<>();
        lostFares = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean scheduleVehicle(Passenger passenger) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable() && vehicle.getSeats() >= passenger.getGroupSize()) {
                vehicle.assignPassenger(passenger);
                return true;
            }
        }
        lostFares++;
        return false;
    }

    public int getLostFares() {
        return lostFares;
    }
}
