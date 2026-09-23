/*. Write a program that takes a string input ("true" or "false") and converts it to a boolean  value. The program should handle case insensitivity (e.g., "TRUE", "false"). */

package Week02;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean string: ");
        String input1 = scanner.nextLine().toLowerCase();

        boolean bool = Boolean.parseBoolean(input1);

        System.out.println("Boolean value: " + bool);

        scanner.close();

    }

}

// Code Explanation:

/*
 * Get lang yung inimput ni user at ang ginawa kolang is kiconvert ko lang yung
 * string to boolean using parseBoolean() tapos kung ano lang ang inimput ni
 * user exaple TRUE tapos magiging boolean lang to na totoo like true otherwise
 * false
 */