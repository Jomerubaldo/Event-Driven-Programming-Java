/* Write a program that uses a for loop to print the first 10 Fibonacci
numbers and use a switch statement to display a message based on
user input. */

package Week03;

import java.util.Scanner;

public class HandsOnActivity {
    public static void main(String[] args) {

        System.out.println("First 10 Fibonacci numbers: ");

        int a = 0, b = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b; // Kinopya ni a ang value ni b. Hindi nawala o nabago ang value ni b.
            b = next; // Kinopya naman ni b ang value ni next. Hindi nawala o nabago ang value ni
                      // next.
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choices: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("You choice number 1: Hello!");
                break;
            case 2:
                System.out.println("You choice number 2: Have a nice day!");
                break;
            case 3:
                System.out.println("You choice number 3: Congratulation");
                break;
            default:
                System.out.println("Please choose number between 1-3.");
        }

        scanner.close();

    }
}

// Output: 0 1 1 2 3 5 8 13 21 34

// Explain code:

/*
 * inialize lang yung mga variable na a at b tapos papasok na sa loop check kung
 * yung i = 0 is < sa 10 which is true so gagana ang for loop tapos print niya
 * lang yung current value ng a since zero to print niya 0 tapos sa next naman
 * is pinag aadition niya lang yung a at b so current value ni a is zero tapos
 * si b ay one so a + b is 1 diba kasi 0 + 1 = 1 diba tapos yung value ni b is
 * kukunin ni a so si a ngayon ay may value na na 1 tapos si b kukunin niya yung
 * value ni next so yung value ngayon ni b is yung value ni next which is 1 kasi
 * yun yong pinag add niya kanina na a + b = 1 tapos balik lang sa for loop ulit
 * nanaman sa process
 */

// noted!
// kada for loop is need e print si a kasi siya yung nagbibigay ng result talaga
// para sa fibunacci numbers kasi yung b dito is parang ginagamit lang siya pero
// ang ipapalabas talaga is yung a na variable na may laman.