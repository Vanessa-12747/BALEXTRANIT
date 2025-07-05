package com.mycompany.balextranit.u.ltd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    private Company company;

    @BeforeEach
    public void setUp() {
        company = new Company();
    }

    @Test
    public void testScheduleVehicle_Success() {
        Vehicle vehicle = new Vehicle(4);
        company.addVehicle(vehicle);

        Passenger Passenger = new Passenger(new Location(10, 20), new Location(30, 40));
        assertTrue(company.scheduleVehicle(Passenger));
    }

    @Test
    public void testScheduleVehicle_Failure_NoVehicle() {
        Passenger passenger = new Passenger(new Location(10, 10), new Location(20, 20));
        assertFalse(company.scheduleVehicle(passenger));
        assertEquals(1, company.getLostFares());
    }

    private void assertTrue(boolean scheduleVehicle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
