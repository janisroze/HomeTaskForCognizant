package com.jr.vehiclerental;

import java.util.Arrays;
import java.util.List;


/**
 * Vehicle class represents vehicle in vehicle rental fleet. Possible vehicle types and fuel types ar hardcoded for task purposes.
 * Vehicle should have a unique id but for task purposes it has been omitted
 * Constructor checks if parameters for vehicle type and fuel type are known types and throws exception if these values are not found.
 */
public class Vehicle {

    final List<String> vehicleTypes = Arrays.asList("SUV", "car", "van", "bus");
    private String vehicleType = "";

    final List<String> fuelTypes = Arrays.asList("petrol", "diesel", "hybrid", "be");
    private String fuelType = "";

    private boolean hasAC = false;

    private int seats = 0;

    public Vehicle(String _vehicleType, String _fuelType, boolean _hasAC, int _seats) throws Exception {

        if (vehicleTypes.contains(_vehicleType)) {
            vehicleType = _vehicleType;
        } else {
            throw new Exception("Vehicle type does not exist");
        }

        if (fuelTypes.contains(_fuelType)) {
            fuelType = _fuelType;
        } else {
            throw new Exception("Fuel type does not exist");
        }

        hasAC = _hasAC;

        if (_seats > 0) {
            seats = _seats;
        } else {
            throw new Exception("Seat count must be a positive integer");
        }

    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean hasAC() {
        return hasAC;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSeats() {
        return seats;
    }


}
