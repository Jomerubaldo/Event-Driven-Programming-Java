/* Write a program that reads two integers from the keyboard. 
If both numbers are positive or both are negative, then you need to display  their product, otherwise print their sum. 
 */

package Week04.Activities;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter: ");
        int input1 = scanner.nextInt();

        System.out.print("Enter: ");
        int input2 = scanner.nextInt();

        int a = input1;
        int b = input2;

        if (a > 0 && b > 0 || a < 0 && b < 0) {
            System.out.print(a * b);
        } else {
            System.out.print(a + b);
        }

        scanner.close();

    }
}

// Requirements:

/*
 * The program must read two integers from the keyboard.
 * The program should display the product of the read numbers if both are
 * positive or both are negative.
 * The program should display the sum of the read numbers, if both are
 * non-positive or both are non-negative.
 */