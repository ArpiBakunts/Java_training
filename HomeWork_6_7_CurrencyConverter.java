package com.company;

/* 7
Design a class named CurrencyConverter
	methods

	- convertDollarToEuro
	- convertDollarToDram
	- convertDollarToRuble

	- convertEuroToDollar
	- convertEuroToDram
	- convertEuroToRuble

	- convertDramToDollar
	- convertDramToEuro
	- convertDramToRuble

	- convertRubleToDollar
	- convertRubleToEuro
	- convertRubleToRuble
*/

public class CurrencyConverter {
    public void convertDollarToEuro(double dollar) {
        double euro = dollar / 1.4389;
    }

    public void convertDollarToDram(double dollar) {
        double dram = dollar * 490;
    }

    public void convertDollarToRuble(double dollar) {
        double ruble = dollar * 70.14;
    }

    public void convertEuroToDollar(double euro) {
        double dollar = euro * 1.4389;
    }

    public void convertEuroToDram(double euro) {
        double dram = euro * 550;
    }

    public void convertEuroToRuble(double euro) {
        double ruble = euro * 77.89;
    }

    public void convertDramToDollar(double dram) {
        double dollar = dram / 490;
    }

    public void convertDramToEuro(double dram) {
        double euro = dram / 550;
    }

    public void convertDramToRuble(double dram) {
        double ruble = dram / 8;
    }

    public void convertRubleToDollar(double ruble) {
        double dollar = ruble / 70.14;
    }

    public void convertRubleToDram(double ruble) {
        double dram = ruble * 8;
    }

    public void convertRubleToEuro(double ruble) {
        double euro = ruble / 77.89;
    }
}
