/*Write a Java program that asks the user to input a number between 1 and 7 and uses a  switch statement to display the corresponding day of the week. For example, 1 for  Monday, 2 for Tuesday, and so on. */

package Week03;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Output: Monday");
                break;
            case 2:
                System.out.println("Output: Tuesday");
                break;
            case 3:
                System.out.println("Output: Wednesday");
                break;
            case 4:
                System.out.println("Output: Thursday");
                break;
            case 5:
                System.out.println("Output: Friday");
                break;
            case 6:
                System.out.println("Output: Saturday");
                break;
            case 7:
                System.out.println("Output: Sunday");
                break;
        }

        scanner.close();

    }
}

// Explaine Code:

/*
 * Get lang yung inimput ni user tapos sa switch case statement naman is need
 * kolang insert don yung inimput ni user na variable as day tapos ichecheck ng
 * case ko kung anong number from 1-7 ang napili at based sa case na nasa line
 * mismo ng inimput ni user is don mag trutrue ang condition at e print lang
 * niya don yong output
 */