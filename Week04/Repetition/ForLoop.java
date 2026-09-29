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


// For loop programming classify numbers