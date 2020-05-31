package com.company;

/* 2
Design a class named Rectangle (ուղանկյուն)
	properties
	- height
	- width

	methods
	- calculatePerimeter
	- calculateArea  */

public class Rectangle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (this.height * this.width);
    }

    public void calculateArea() {
        double area = this.height * this.width;
    }
}
