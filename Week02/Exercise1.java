/*Write a program that takes a string input from the user and checks whether the string is  a palindrome or not (i.e., it reads the same forwards and backwards). Return true if it  is a palindrome, otherwise false. */

package Week02;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String input1 = scanner.nextLine();
        // special mention i used the StringBuilder packages
        // ginagawa lang nito convert string to reverse
        String reversed = new StringBuilder(input1).reverse().toString();
        boolean isPalindrome = false;

        if (input1.equalsIgnoreCase(reversed)) {
            isPalindrome = true;
            System.out.println("is palindrome?" + " " + isPalindrome);

        } else {
            isPalindrome = false;
            System.out.print("is palindrome?" + " " + isPalindrome);
        }

        scanner.close();
    }
}

/*
 * Get lang ulit inimput ni user tapos using StringBuilder yung inimput ni user
 * is nireverse kona to string tapos declared lang ako ng boolean na may value
 * na false, ngayon using conditional statement if yung inimput ni user is same
 * sa erereverse ko kahit na capital letter or small tapos, kapag true yung
 * boolean value ko magiging true at e priprint koyong result based sa gusto ko
 * otherwise naman false at meron lang din naka print na based sa false na
 * condition
 */