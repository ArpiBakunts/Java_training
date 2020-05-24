package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
4.1
Create array with length 10
Initialize with random ints (10 - 99)
print it
get a number from consol
test if an array contains that number

4.2
Create array with length 10
Initialize with random ints (10 - 99)
print it
sort it in 'asc' order
print the sorted

4.3
Create array with length 10
Initialize with random ints (10 - 99)
print it
sort it in 'desc' order
print the sorted

4.4
Create array with length 10
Initialize with random ints (10 - 99)
print it
Get a number from console
find and print the index  of that number
*/
public class Home_4_From_1_To_4 {
    public static void main(String[] args) {

        int[] lengthTenArray = new int[10];
        int[] initializedArray = initializeArrayWithRandomInts(lengthTenArray);
        printArrayItems(initializedArray);

        // 4.1
        isNumberInArray(initializedArray);

        // 4.2
        System.out.println("Here goes ascending sorted array");
        printArrayItems(sortArrayAscOrder(initializedArray));

        //4.3
        System.out.println("Here goes descending sorted array");
        printArrayItems(sortArrayDescOrder(initializedArray));

        //4.4
        System.out.println("Please, enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int numberToCheckIndex = scanner.nextInt();
        findIndexInArray(initializedArray, numberToCheckIndex);
    }

    public static int[] initializeArrayWithRandomInts(int[] arrayToInt) {
        Random random = new Random();

        for (int i = 0; i < arrayToInt.length; i++) {
            arrayToInt[i] = random.nextInt(89) + 10;
        }

        return arrayToInt;
    }

    public static void printArrayItems(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length ; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }

        System.out.println();
    }

    public static boolean isNumberInArray(int[] inArrayToCheck) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int numberToCheck = scanner.nextInt();

        for (int i = 0; i < inArrayToCheck.length; i++) {
            if (inArrayToCheck[i] == numberToCheck) {
                System.out.println("Yes it is!!!");
                return true;
            }
        }

        System.out.println("No it is not!!!");
        return false;
    }

    public static int[] sortArrayAscOrder(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        return arrayToSort;
    }

    public static int[] sortArrayDescOrder(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        int[] descOrderedArray = new int[arrayToSort.length];
        int index = 0;

        for (int i = arrayToSort.length - 1; i >= 0; i--) {
            descOrderedArray[index] = arrayToSort[i];
            index++;
        }

        return descOrderedArray;
    }

    public static void findIndexInArray(int[] inArrayToFindIndexOfNumber, int numberToCheckIndex ) {
        for (int i = 0; i < inArrayToFindIndexOfNumber.length; i++) {
            if (inArrayToFindIndexOfNumber[i] == numberToCheckIndex) {
                System.out.println("The index of number is " + i);
                return;
            }
        }

        System.out.println("No such number in array");
    }

}
