package com.company;

/* 3
Design a class named Triangle (Եռանկյուն)
	properties
	- sideA
	- sideB
	- sideC

	methods
	- calculatePerimeter
	- calculateArea  */

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double calculatePerimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }

    public void calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - this.firstSide) * (halfPerimeter - this.secondSide) * (halfPerimeter - this.thirdSide));
    }
}
