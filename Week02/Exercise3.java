/* Write a Java program to check if two input strings are anagrams of each other (i.e., they  contain the same characters in different order). Return true if they are anagrams,  otherwise false.  */

package Week02;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine();

        // lowerCase so u can input l small or L capital its okay its a same.
        char[] array1 = input1.toLowerCase().toCharArray();
        char[] array2 = input2.toLowerCase().toCharArray();

    //    make arrays char like ["a", "b", "c"]
        Arrays.sort(array1);
        Arrays.sort(array2);

         // comparing the two arrays if same value inside of it.
        boolean isAnagram = Arrays.equals(array1, array2);

        System.out.println("Are anagrams? " + isAnagram );

        scanner.close();

    }
    
}


//Explation code:

/*first kuha ng input ni user at using toCharArray ginawa lang na array yung inimput ni user at using Arrays.sort Ginawa niya mismong array structure yung value na inimput ni user at using Arrays.equal kinompare niya yung inimput ni user ng una at ang pangalawa if true yung anagram is magiging true otherwise false tapos print lang ng result.  */