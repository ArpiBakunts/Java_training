package com.company;
 /* 4
Design a class named Point (կետ)
	properties
	- coordinateX
	- coordinateY

	methods
	- distance()  (from 0:0 coordinat)
	- distance(Point point) ( Overloaded method to get the distance between 2 points )
	*/

public class Point {
    private double coordinateX1;
    private double coordinateX2;
    private double coordinateY1;
    private double coordinateY2;

    public double getCoordinateX1() {
        return coordinateX1;
    }

    public void setCoordinateX1(double coordinateX1) {
        this.coordinateX1 = coordinateX1;
    }

    public double getCoordinateX2() {
        return coordinateX2;
    }

    public void setCoordinateX2(double coordinateX2) {
        this.coordinateX2 = coordinateX2;
    }

    public double getCoordinateY1() {
        return coordinateY1;
    }

    public void setCoordinateY1(double coordinateY1) {
        this.coordinateY1 = coordinateY1;
    }

    public double getCoordinateY2() {
        return coordinateY2;
    }

    public void setCoordinateY2(double coordinateY2) {
        this.coordinateY2 = coordinateY2;
    }

    public void distanceOfCoordinates(double coordinateX2, double coordinateY2) {
        double distance = Math.sqrt(Math.pow((this.coordinateX2), 2) + Math.pow((this.coordinateY2), 2));
    }

    public void distanceOfCoordinates(double coordinateX1, double coordinateX2, double coordinateY1, double coordinateY2) {
        double distance = Math.sqrt(Math.pow((this.coordinateX2 - this.coordinateX1), 2) + Math.pow((this.coordinateY2 - this.coordinateY1), 2));
    }
}
