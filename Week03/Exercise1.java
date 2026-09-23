/*Write a Java program that takes an integer input from the user and determines if it is
even or odd using an if-else statement.*/
package Week03;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int input = scanner.nextInt();

        // conditional statement
        if (input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }

}

// Explain Code:

/*
 * Using modulo % convert ko lang kung ang tinaype ni user is equal sa 2 at ==
 * zero otherwise kapag may sobra is at hindi divided sa 2 is odd siya
 */