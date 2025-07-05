package com.mycompany.balextranit.u.ltd;

public class Passenger {
    private Location pickup;
    private Location destination;
    private int groupSize;

    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
        this.groupSize = 1;
    }

    public Location getPickup() {
        return pickup;
    }

    public Location getDestination() {
        return destination;
    }

    public int getGroupSize() {
        return groupSize;
    }
}
