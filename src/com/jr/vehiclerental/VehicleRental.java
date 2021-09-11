package com.jr.vehiclerental;

import java.util.Arrays;
import java.util.List;


/**
 * VehicleRental holds the Vehicle rental service fleet auto filled hardcoded for task purposes.
 */
public class VehicleRental {

    public final List<Vehicle> fleet = Arrays.asList(new Vehicle("SUV", "petrol", true, 7),
            new Vehicle("car", "diesel", false, 5),
            new Vehicle("van", "petrol", false, 12),
            new Vehicle("bus", "diesel", true, 45));

    public VehicleRental() throws Exception {
    }
}
