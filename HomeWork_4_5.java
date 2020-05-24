package com.company;

/*  4.5
Create matrix with dimensions 10x15
initialize with random ints in range 10 - 99
print it
find and print the maximum value */

import java.util.Random;

public class HWork_4_5 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        initializeArrayWithRandomInts(matrix);
        printArrayItems(matrix);
        findAndPrintMaxNumInMatrix(matrix);
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

    public static void findAndPrintMaxNumInMatrix(int[][] matrix) {
        int maxNum = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxNum < matrix[i][j]) {
                    maxNum = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number is " + maxNum);
    }
}
