package com.company;

/* 6
Design a class named DistanceConverter
	methods
	- convertMetersToMiles
	- convertMilesToMeters
*/

public class DistanceConverter {

    public void convertMetersToMiles(double meters){
        double miles = meters / 1609.344;
    }

    public void convertMilesToMeters(double miles) {
        double meters = miles * 1609.344;
    }
}
