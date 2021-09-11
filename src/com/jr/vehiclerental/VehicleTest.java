package com.jr.vehiclerental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {

    @Test
    void getVehicleType() throws Exception {
        Vehicle vehicle = new Vehicle("bus", "diesel", true, 34);
        assertEquals("bus", vehicle.getVehicleType());
    }

    @Test
    void hasAC() throws Exception {
        Vehicle vehicle = new Vehicle("bus", "diesel", true, 34);
        assertEquals(true, vehicle.hasAC());
    }

    @Test
    void getFuelType() throws Exception {
        Vehicle vehicle = new Vehicle("bus", "diesel", true, 34);
        assertEquals("diesel", vehicle.getFuelType());
    }

    @Test
    void getSeats() throws Exception {
        Vehicle vehicle = new Vehicle("bus", "diesel", true, 34);
        assertEquals(34, vehicle.getSeats());
    }
}