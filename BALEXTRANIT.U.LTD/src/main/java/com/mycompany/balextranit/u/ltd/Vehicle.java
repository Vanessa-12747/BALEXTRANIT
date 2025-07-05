package com.mycompany.balextranit.u.ltd;

public class Vehicle {
    private int seats;
    private boolean available;

    public Vehicle(int seats) {
        this.seats = seats;
        this.available = true;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignPassenger(Passenger passenger) {
        this.available = false;
    }

    public void release() {
        this.available = true;
    }
}
