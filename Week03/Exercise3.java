/*Write a Java program to calculate the sum of all integers between 1 and a user-provided  value using a for loop. */

package Week03;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int input = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i; // addition assignment operator
        }

        System.out.println("Output: " + sum);

        scanner.close();

    }
}

// Explain Code:

/*
 * Get lang din input ni user tapis initialize lang muna ng sum na variable na
 * may value na 0 tapos using for loop kada check niya na lessthanequal sa input
 * ni user is mag loloop lang at mag add ng plus 1 pero may twist kasi kada
 * dagdag niya ng plus 1 is nag add din ito ng plus 1 so 1+1 = 2 tapos 2+1=3
 * dahil sa addition assignment operator
 * tapos print lang based sa result
 */