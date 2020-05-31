package com.company;

/* 1
Design a class named Circle
	properties
	- radius

	methods
	- calculatePerimeter
	- calculateArea */

public class Circle {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculatePerimeter() {
        double perimeter = 2 * this.radius * Math.PI;
    }

    public void calculateArea() {
        double area = Math.pow(this.radius, 2) * Math.PI;
    }
}
