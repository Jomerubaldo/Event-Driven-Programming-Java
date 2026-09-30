/* Write a program that reads two integers from the keyboard.
If the first number is greater, then you need to display their difference,
otherwise do nothing. */

package Week04.Activities;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter: ");
        int input1 = scanner.nextInt();

        System.out.print("Enter: ");
        int input2 = scanner.nextInt();

        int a = input1;
        int b = input2;

        if (a > b) {
            System.out.println(a - b);
        }
        scanner.close();
    }

}

// Explanation code:

/*
 * kunin lang yung input ni user sa magkaibang number at ilagay sa variable ng a
 * at b based sa variable na naka assign sa kanila at kapag ang unang input ni
 * user which is a is greater than b e print yung total gamit ang arithmetic
 * operator at kapag lessthan naman si a sa b is walang mag priprint end lang
 * condition
 */