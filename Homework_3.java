import java.util.Scanner;

public class Home_3 {
    public static void main(String[] args) {
        /* 3.1
        Write a program to display the first 20 natural numbers. */
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        /* 3.2
        Write a program to display the first 20 natural numbers
        but exclude the ones that are divisible by 3. (using continue) */
        for (int i = 1; i <= 20 ; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }

        /* 3.3
        Write a program to print the even numbers in range  {-20, +60} */
        for (int i = -20; i <= 60 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /* 3.4
        Write a program to print the odd numbers in range  {-20,  -60} */
        for (int i = -60; i <= -20 ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        /* 3.5
        Write a program to find the sum of the first 100 natural numbers. */
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        /* 3.6
        Write a program to find the sum of odd numbers of the first 100 natural numbers. */
        int sumOfOdd = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0) {
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd);

        /* 3.7
        Write a program to find the average of even numbers of the first 100 natural numbers. */
        int average = 0;
        int counter = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {
                average += i;
                counter++;
            }
        }
        System.out.println(average / counter);

        /* 3.8
        Write a program to read 10 numbers from keyboard (console) and find their sum and average */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        int sumOfTen = 0;

        for (int i = 0; i < 10 ; i++) {
            int userNums = scanner.nextInt();
            sumOfTen += userNums;
        }
        System.out.println("Sum is: " + sumOfTen);
        System.out.println("Average is: " + sumOfTen / 10);

        /* 3.9
        Write a program to display the cube of the number upto given integer.
        Test Data :
        Input number of terms : 5 */
        System.out.println("Please enter any integer: ");
        int enteredInt = scanner.nextInt();

        for (int i = 1; i <= enteredInt; i++) {
            System.out.printf("Number is : %d and cube of the %d is : %s %n", i, i, (int) Math.pow(i, 3));
        }

        /* 3.10
        Write a program to display the multiplication table of a given integer */
        System.out.println("Input your integer: ");
        int multipliedInteger = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d %n", multipliedInteger, i, multipliedInteger * i);
        }

        /* 3.11
        Write a program to determine whether a given number is prime or not. */
        System.out.println("Input your number: ");
        int yourNumber = scanner.nextInt();
        int num = 0;

        for (int i = 2; i < Math.sqrt(yourNumber) + 1; i++) {
            if (yourNumber % i == 0) {
                System.out.printf("%d is not a prime number. ", yourNumber);
                num++;
                break;
            }
        }

        if (num == 0) {
            System.out.printf("%d is a prime number. ", yourNumber);
        }

        /* 3.12
        Write a program to display the first n Fibonacci series.
        (Fibonacci series 0 1 1 2 3 5 8 13 .....) */
        System.out.println("Enter n number ");
        int fNum = scanner.nextInt();
        int f1 = 0,
            f2 = 1;

        if (fNum >= 1) {
            for (int i = 1; i <= fNum; i++) {
                System.out.print(f1 + " ");
                int f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
        } else {
            System.out.println("Number can't be smaller than one. ");
        }

        /* 3.13
        Write a program to print a string  "ROBOTS_WILL_KILL_ALL_HUMANZ" in reverse order
        (you can use myString.charAt(x) - google it) */
        String robot = "ROBOTS_WILL_KILL_ALL_HUMANZ";
        String result = "";

        for (int i = robot.length() - 1; i >= 0; i--) {
            result += robot.charAt(i);
        }
        System.out.println(result);
    }
}
