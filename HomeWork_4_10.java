package com.company;

import java.util.Random;
import java.util.Scanner;

/* 4.10
Create matrix with dimensions 5x5
initialize with random ints in range 10 - 99
print it
Display a menu
———————- MENU —————-
1. For rotating 90*
2. For rotating 180*
3. For rotating 270*
4. For Exit
————————————————
In any other case than 4 programm should NOT stop !!! */

public class HWork_4_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        initializeArrayWithRandomInts(matrix);
        printArrayItems(matrix);
        displayMenu(matrix);

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

    public static int[][] rotateMatrix90Degree(int[][] matrixToRotate) {
        int[][] rotatedMatrix = new int[matrixToRotate[0].length][matrixToRotate.length];

        for (int i = 0; i < rotatedMatrix.length; i++) {
            int length = matrixToRotate.length - 1;

            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                rotatedMatrix[i][j] = matrixToRotate[length][i];
                length--;
            }
        }

        return rotatedMatrix;
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

    public static void displayMenu(int[][] matrixToRotate) {
        System.out.println("----- Menu -----");
        System.out.println("1. For rotating 90*");
        System.out.println("2. For rotating 180*");
        System.out.println("3. For rotating 270*");
        System.out.println("4. Exit");
        System.out.println("- - - - - - - - ");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        while (inputNumber != 4) {
            switch (inputNumber) {
                case 1:
                    printArrayItems(rotateMatrix90Degree(matrixToRotate));
                    break;
                case 2:
                    printArrayItems(rotateMatrix180Degree(matrixToRotate));
                    break;
                case 3:
                    printArrayItems(rotateMatrix270Degree(matrixToRotate));
                    break;
                default:
                    System.out.println("Incorrect input, try again ");
            }

            System.out.println("----- Menu -----");
            System.out.println("1. For rotating 90*");
            System.out.println("2. For rotating 180*");
            System.out.println("3. For rotating 270*");
            System.out.println("4. Exit ");
            System.out.println("- - - - - - - - ");
            inputNumber = scanner.nextInt();
        }
    }
}

