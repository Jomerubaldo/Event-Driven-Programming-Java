package Week04.Repetition;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int n = 20;
        int number = 0;
        int evens = 0;
        int zeros = 0;
        int odds = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            number = scanner.nextInt();
            System.out.print(number + " ");

            switch (number % 2) {
                case 0:
                    evens++;
                    if (number == 0)
                        zeros++;
                    break;
                case 1:
                case -1:
                    odds++;
            }

        }

        System.out.println("\nEvens: " + evens + ", Zeros: " + zeros + ", Odds" + odds);

        scanner.close();
    }
}

// Reminders:

// 1. Does not execute if loop condition is initially false.
// 2. Update expression changes value of loop control variable, eventually
// making it false.
// 3. If loop condition is always true, result is an infinite loop.
// 4. Infinite loop can be specified by omitting all three control statements.