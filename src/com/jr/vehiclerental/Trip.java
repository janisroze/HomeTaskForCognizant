package com.jr.vehiclerental;

public class Trip {
    private Vehicle vehicleUsedForTrip = null;
    private final int standardRate = 15;
    private final int chargeForAC = 2;
    private final int dieselDiscount = 1;
    private final int busDiscountPercentage = 2;
    private final int exceedsPassengerCharge = 1;
    private int passangerCount = 0;
    private double distanceInKilometers = 0;

    /**
     * Trip represents a trip made by a customer using the vehicle rental service. Possible trip arguments for rate changes are stored here for task purposes, but normally
     * would be extracted from database. These arguments should be saved for this exact Trip or Date when trip is being made because rates and discounts can change.
     * Constructor Checks if past numerical values are correct and throws exception if not.
     */
    public Trip(Vehicle _vehicleUsedForTrip, int _passengerCount, double _distanceInKilometers) throws Exception {

        vehicleUsedForTrip = _vehicleUsedForTrip;

        if (_passengerCount > 0) {
            passangerCount = _passengerCount;
        } else {
            throw new Exception("Passenger count must be a positive integer");
        }

        if (_distanceInKilometers > 0) {
            distanceInKilometers = _distanceInKilometers;
        } else {
            throw new Exception("Passenger count must be a positive double variable");
        }
    }

    /**
     * Total Trip expenses depending on distance, passenger count and vehicle type and fuel type and comfort options
     *
     * @return Total Trip expenses
     */
    public double getTotalTripCost() {
        double tripRate = standardRate;

        if (vehicleUsedForTrip.getVehicleType() == "bus") {
            tripRate -= (tripRate * busDiscountPercentage);
        }
        if (vehicleUsedForTrip.hasAC()) {
            tripRate += chargeForAC;
        }
        if (vehicleUsedForTrip.getFuelType() == "diesel") {
            tripRate -= dieselDiscount;
        }

        if (vehicleUsedForTrip.getSeats() < passangerCount) {
            tripRate += exceedsPassengerCharge * (passangerCount - vehicleUsedForTrip.getSeats());
        }
        return tripRate * distanceInKilometers;
    }

}
