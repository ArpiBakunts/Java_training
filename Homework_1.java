package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.1 print the sum of two numbers.
        int num1 = 74;
        int num2 = 36;
        System.out.println(num1 + num2);

        //1.2 .Divide two numbers and print on the screen.
        num1 = 50;
        num2 = 3;
        System.out.println(num1 / num2);

        //1.3 print the result of the following operations.
        System.out.println( -5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        //1.4 Write a Java program that takes two numbers as input from console and display the product of two numbers.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int number2 = scanner.nextInt();

        int result = number1 * number2;
        System.out.println("Result is :" + result);

        //1.5 Write a Java program that takes a number as input and prints its multiplication table upto 10.
        System.out.print("Please enter number: ");
        int inputNum = scanner.nextInt();
        int multiplier = 1;
        while (multiplier <=  10) {
            System.out.println(String.format("%s x%2d = ", inputNum, multiplier) + inputNum * multiplier);
            multiplier++;
        }

        //1.6  print the area and perimeter of a circle.
        System.out.print("Please enter radius: ");

        double inputRadius = scanner.nextDouble();
        double perimeter = 3.14 * 2 * inputRadius;
        double area = 3.14 * Math.pow(inputRadius, 2);

        System.out.printf("Perimeter is %.5f %n" , perimeter);
        System.out.printf("Area is %.5f %n", area);

        //1.7 Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        System.out.println("Input a degree in Fahrenheit: ");
        double inputFarenheit = scanner.nextDouble();
        double celsius = (inputFarenheit - 32) * 5/9;

        System.out.printf("%s degree Fahrenheit is equal to %s in Celsius", inputFarenheit, celsius );

        //1.8 Write a Java program that reads a number in inches, converts it to meters.
        //Note: One inch is 0.0254 meter.
        System.out.println(" Input a value for inch: ");
        double inch = scanner.nextDouble();
        double meters = inch  * 0.0254;

        System.out.printf("%s inch is %s meters", inch, meters);

        //1.9 Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.println(" Input a number: ");
        int positiveOrNegative = scanner.nextInt();

        if (positiveOrNegative < 0) {
            System.out.println("Number is negative");
        } else if (positiveOrNegative == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }

        //1.10 Take three numbers from the user and print the greatest number.
        System.out.println("Input 1st number: ");
        int first = scanner.nextInt();

        System.out.println("Input 2nd number: ");
        int second = scanner.nextInt();

        System.out.println("Input 3rd number: ");
        int third = scanner.nextInt();

        if (first >= second && first >= third) {
            System.out.println("The greatest: " + first);
        } else if (second >= first && second >= third){
            System.out.println("The greatest: " + second);
        } else {
            System.out.println("The greatest: " + third);
        }

        //1.11  Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
        System.out.println("Input the 5 numbers: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("The sum of 5 is " + sum);
        System.out.println("The average is " + sum / 5.0);

        //1.12 Write a program Check Whether Number is Even or Odd
        System.out.println("Input a number: ");
        int evenOrOdd = scanner.nextInt();

        if (evenOrOdd % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

