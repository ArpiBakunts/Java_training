package com.company;

/* 4.9
    Create matrix with dimensions 10x15
    initialize with random ints in range 10 - 99
    print it
    Rotate it in 270* clockwise
    Print the rotated matrix */

import java.util.Random;

public class HWork_4_9 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        initializeArrayWithRandomInts(matrix);
        printArrayItems(matrix);
        System.out.println("----------------------");
        printArrayItems(rotateMatrix270Degree(matrix));
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

    public static int[][] rotateMatrix270Degree(int[][] matrixToRotate) {
        int[][] rotatedMatrix = new int[matrixToRotate[0].length][matrixToRotate.length];

        int length = rotatedMatrix.length;

        for (int i = 0; i < rotatedMatrix.length; i++) {
            length--;

            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                rotatedMatrix[i][j] = matrixToRotate[j][length];
            }
        }

        return rotatedMatrix;
    }

}
