package com.company;

import java.util.Random;
import java.util.Scanner;

public class Home_2 {
    public static void main(String[] args) {

    /* 2.1
    Generate 2 random int numbers in range 10 - 100
    calculate the sum. cast it to long. print */
    Random random = new Random();
    int randomNumber1 = random.nextInt(91) + 10;
    int randomNumber2 = random.nextInt(91) + 10;
    int sum = randomNumber1 + randomNumber2;
    long sumLong = (long) sum;
    System.out.println(sumLong);


    /* 2.2
    Generate 2 random int numbers in range 10 - 100
    calculate the product.
    in case product is even cast it to long
    in case product is odd cast it to double
    Print the product  */
    int r1 = random.nextInt(91) + 10;
    int r2 = random.nextInt(91) + 10;
    int product = r1 * r2;

    if (product % 2 != 0) {
        double finalProduct = (double) product;
        System.out.println("Odd: " + finalProduct);
    } else {
        long finalProduct = (long) product;
        System.out.println("Even: " + finalProduct);
    }

    /* 2.3
    Generate a random int number in range 10 - 100
    calculate the square of it. (Math.pow())
    cast the result to String,  (String.valueOf())
    print the result */
    int randomInt = random.nextInt(91) + 10;
    String strToInt = String.valueOf(Math.pow(randomInt, 2));
    System.out.println(strToInt);

    /* 2.4
    Get from the user an int number (from console)
    in case number > 100
    Generate a random int in range 50 - number :
    in case number < 100
    Generate a random int in range 0 - 50:
    cast the random number to String
    print */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input your number, please: ");
    int userNum = scanner.nextInt();

    if (userNum > 100) {
        int ranInt = random.nextInt(userNum - 50 + 1) + 50;
        String ranString = String.valueOf(ranInt);
        System.out.println(ranString);
    } else if (userNum < 100) {
        int ranInt = random.nextInt(51);
        String ranString = String.valueOf(ranInt);
        System.out.println(ranString);
    } else {
        System.out.println("Out of range");
    }


    /* 2.5
    Generate 2 random ints
    Take from console an operator (+, -, * or /)
    perform calculation based on operator
            (USING SWITCH)
    print the result */
    int randomInt1 = random.nextInt(1000);
    int randomInt2 = random.nextInt(1000);

    System.out.println("Please enter +, -, * or /:  ");
    String operator = scanner.nextLine();

    switch (operator) {
        case "+":
            System.out.println(randomInt1 + randomInt2);
            break;
        case "-":
            System.out.println(randomInt1 - randomInt2);
            break;
        case "*":
            System.out.println(randomInt1 * randomInt2);
            break;
        case "/":
            System.out.println(randomInt1 / randomInt2);
            break;
        default:
            System.out.println("Incorrect operator");
    }

    /* 2.6
    Write a program to input week number(1-7) from console and print day of week name  (1 - monday …7 - sunday) using switch case. */
    System.out.println("Enter 1-7: ");
    int weekDay = scanner.nextInt();

    switch (weekDay) {
        case 1:
            System.out.println("1 - Monday");
            break;
        case 2:
            System.out.println("2 - Tuesday");
            break;
        case 3:
            System.out.println("3 - Wednesday");
            break;
        case 4:
            System.out.println("4 - Thursday");
            break;
        case 5:
            System.out.println("5 - Friday");
            break;
        case 6:
            System.out.println("6 - Saturday");
            break;
        case 7:
            System.out.println("7 - Sunday");
            break;
        default:
            System.out.println("Input should be from 1-7");
    }


    /* 2.7
    Write  Program to print number of days in month using switch...case
    Input “monthName” from console (you can get string from console by  scanner.nextLine() ) */
    System.out.println("Enter month name: ");
    String monthName = scanner.nextLine();

    switch (monthName) {
        case "January":
            System.out.println("January has 31 days ");
            break;
        case "February":
            System.out.println("February has 28-29 days ");
            break;
        case "March":
            System.out.println("March has 31 days ");
            break;
        case "April":
            System.out.println("April has 30 days ");
            break;
        case "May":
            System.out.println("May has 31 days ");
            break;
        case "June":
            System.out.println("June has 30 days ");
            break;
        case "July":
            System.out.println("July has 31 days ");
            break;
        case "August":
            System.out.println("August has 31 days ");
            break;
        case "September":
            System.out.println("September has 30 days ");
            break;
        case "October":
            System.out.println("October has 31 days ");
            break;
        case "November":
            System.out.println("November has 30 days ");
            break;
        case "December":
            System.out.println("December has 31 days ");
            break;
        default:
            System.out.println("Please enter valid month name ");
    }


   /* 2.8
    Given
    you have a circle with radius 5:

    Display a menu in console
            ------------MENU-----------
            ---> enter 1 for calculating area of the circle
            ---> enter 2 for calculating perimeter of the circle
            ---> enter 3 for exit.

            in case user enters 1 calculate and print area of the circle
    in case user enters 2 calculate and print perimeter of the circle
    in case user enters 3 exit. */
    System.out.println("----- Menu -----");
    System.out.println("---> enter 1 for calculating area of the circle");
    System.out.println("---> enter 2 for calculating perimeter of the circle");
    System.out.println("---> enter 3 for exit.");
    int inputNumber = scanner.nextInt();
    double inputRadius = 5;

    while (inputNumber != 3) {
        if (inputNumber == 1) {
            double area = 3.14 * Math.pow(inputRadius, 2);
            System.out.println("Area is: " + area);
        } else if (inputNumber == 2) {
            double perimeter = 3.14 * 2 * inputRadius;
            System.out.println("Perimeter is: " + perimeter);
        }
        System.out.println("----- Menu -----");
        System.out.println("---> enter 1 for calculating area of the circle");
        System.out.println("---> enter 2 for calculating perimeter of the circle");
        System.out.println("---> enter 3 for exit.");
        inputNumber = scanner.nextInt();
    }

    }
}
