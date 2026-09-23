/*Write a program that checks whether a given string starts with a vowel (a, e, i, o, u).  Return true if the string starts with a vowel, otherwise false.  */

package Week02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input1 = scanner.nextLine().toLowerCase();

        String[] vowel = { "a", "e", "i", "o", "u" };
        boolean isVowel = false;

        if (Arrays.asList(vowel).contains(input1)) {
            isVowel = true;
            System.out.println("Starts with " + "'" + input1 + "'" + " " + "vowel?" + " " + isVowel);
        }

        scanner.close();

    }

}

// Explain

/*
 * First kuha din ng input1 ni user tapos declared na array list na may value na
 * vowel at declared din ng boolean ito yung magsasabi kung true or false ba ang
 * inimput ni user based sa mga value na naka stored sa arraylist tapos
 * conditional statement lang na kung yung array.asList yung mismong list ng
 * array na may value which is yung vowel na variable is may contains or may
 * laman na inimput ni user na based sa naka stored sa arraylist tapos kapag
 * true mapapalitan yung value ng isVowel na boolean to true if otherwise false
 * tapos print lang ang result
 */