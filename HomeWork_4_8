package com.company;

import java.util.Random;

/* 4.8
Create matrix with dimensions 10x15
initialize with random ints in range 10 - 99
print it
Rotate it in 180* clockwise
Print the rotated matrix  */

public class HWork_4_8 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        initializeArrayWithRandomInts(matrix);
        printArrayItems(matrix);
        System.out.println("----------");
        printArrayItems(rotateMatrix180Degree(matrix));
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

    public static int[][] rotateMatrix180Degree(int[][] matrixToRotate) {
        int[][] rotatedMatrix = new int[matrixToRotate.length][matrixToRotate[0].length];

        int rowLength = matrixToRotate.length;

        for (int i = 0; i < rotatedMatrix.length; i++) {
            int colLength = matrixToRotate[0].length;
            rowLength--;

            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                colLength--;
                rotatedMatrix[i][j] = matrixToRotate[rowLength][colLength];
            }
        }

        return rotatedMatrix;
    }
}
