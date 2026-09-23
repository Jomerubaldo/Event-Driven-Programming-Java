/*Write a program that accepts a string and a character from the user. Count how many  times the character appears in the string and print the result. */

package Week02;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine().toLowerCase();

        System.out.print("Enter a character to count: ");
        char filter = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == filter) {
                count++;
            }
        }

        System.out.println("The character" + " " + "'" + filter + "'" + " " + "appers" + " " + count + " " + "times.");

        scanner.close();
    }
}

// explain code:

/*
 * need mag input para sa word at filter ngayon is nag initialize lang ako ng
 * count na may value na 0 ngayon using for loop nag loop lang ako sa word na
 * tinitype ni user tapos sa loob ng for loop may condition lang ako na kapag
 * yung word na na type ni user is equal sa filter na tinaype niya before mag
 * cocount lang ang variable na count na may value na 0 magiging 1 tapos
 * hanggang sa ma loop niya lahat at mahanap niya ang mga na filter na letter at
 * print lang ang result kapag tapos na ang loop ng program
 */