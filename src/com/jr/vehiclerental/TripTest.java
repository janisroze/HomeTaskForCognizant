package com.jr.vehiclerental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Aditional tests would be needed to test all trip options. This is an example.
 */
class TripTest {

    @Test
    void getTotalTripCost() throws Exception {
        VehicleRental vehicleRental = new VehicleRental();
        Trip trip = new Trip(vehicleRental.fleet.get(1), 3, 1768);
        assertEquals(24752, trip.getTotalTripCost());

    }
}