package com.company;

/* 5
Design a class named TemperatureConverter
	methods
	- convertFarenheitToCelsius
	- convertFarenheitToKelvin

	- convertCelsiusToFarenheit
	- convertCelsiusToKelvin

	- convertKelvinToFarenheit
	- convertKelvinToCelsius
*/

public class TemperatureConverter {

    public void convertFarenheitToCelsius(double farenheit) {
        double celsius = (farenheit - 32) * 5 / 9;
    }

    public void convertFarenheitToKelvin(double farenheit) {
        double kelvin = (farenheit - 32) * 5 / 9 + 273.15;
    }

    public void convertCelsiusToFarenheit(double celsius) {
        double farenheit = (celsius * 9 / 5) + 32;
    }

    public void convertCelsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
    }

    public void convertKelvinToFarenheit(double kelvin) {
        double farenheit = (kelvin - 273.15) * 9 / 5 + 32;
    }

    public void convertKelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
    }
}
