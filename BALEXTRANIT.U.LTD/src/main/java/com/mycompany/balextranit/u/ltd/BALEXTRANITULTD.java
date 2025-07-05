package com.mycompany.balextranit.u.ltd;
public class BALEXTRANITULTD {
    public static void main(String[] args) {
        Company company = new Company();
        company.addVehicle(new Vehicle(4));
        company.addVehicle(new Vehicle(8));

        PassengerSource source = new PassengerSource(company);

        int successful = 0;
        for (int i = 1; i <= 5; i++) {
            boolean result = source.requestPickup();
            System.out.println("Pickup request #" + i + ": " + (result ? "Success" : "Failed"));
            if (result) successful++;
        }

        System.out.println("Successful pickups: " + successful);
        System.out.println("Lost fares: " + company.getLostFares());
    }
}
