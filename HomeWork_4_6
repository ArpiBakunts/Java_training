package com.company;

import java.util.Random;
import java.util.Scanner;

/* 4.6
Create matrix with dimensions 10x15
initialize with random ints in range 10 - 99
print it
Get the row number from console
Print the sum of the elements in that row of the matrix */

public class HWork_4_6 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        initializeArrayWithRandomInts(matrix);
        printArrayItems(matrix);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row number(1 - 10) ");
        int rowNumber = scanner.nextInt();

        printSumOfMatrixRow(matrix, rowNumber);
    }

    public static void initializeArrayWithRandomInts(int[][] arrayToInt) {
        Random random = new Random();
        for (int i = 0; i < arrayToInt.length; i++) {
            for (int j = 0; j < arrayToInt[i].length; j++) {
                arrayToInt[i][j] = random.nextInt(89) + 10;
            }
        }
    }

    public static void printArrayItems(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length ; i++) {
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                System.out.print(arrayToPrint[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSumOfMatrixRow(int[][] matrix, int rowNumber) {
        if (rowNumber < 1 || rowNumber > 10) {
            System.out.println("Row number should be from 1 to 10 ");
            return;
        }

        int rowElementsSum = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            rowElementsSum += matrix[rowNumber - 1][i];
        }

        System.out.println("Sum of whole row is " + rowElementsSum);
    }
}
