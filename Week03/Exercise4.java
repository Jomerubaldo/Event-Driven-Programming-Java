/*Write a Java program that generates a random number between 1 and 100, then asks  the user to guess the number. Use a while loop to repeatedly ask the user for input  until they guess the number correctly. After each guess, inform the user if the number is  too high or too low. */

package Week03;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number: ");
        int input = scanner.nextInt();

        int randomNum = (int) (Math.random() * 101);
        int countInput = 0;

        while (input != randomNum) {

            if (input > randomNum) {
                System.out.println("Too high.");

            } else if (input < randomNum) {
                System.out.println("Too low.");
            }

            System.out.print("Guess again the number: ");
            input = scanner.nextInt();

            countInput = countInput + 1; // false count lang sa countInput + 1

        }

        System.out.println("Correct! You guessed it in" + " " + countInput + " " + "tries.");

        scanner.close();

    }
}
