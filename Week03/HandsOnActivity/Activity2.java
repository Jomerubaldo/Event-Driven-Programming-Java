package Week03.HandsOnActivity;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.print("What your favorite number? ");
        int favNumber = scanner.nextInt();

        System.out
                .println("Your name is " + name + " and your age is " + age + " your favorite number is " + favNumber);

        scanner.close();
    }
}

// Explain code:

// Using concatination prints all information fill up using scanner and print it
// with all information