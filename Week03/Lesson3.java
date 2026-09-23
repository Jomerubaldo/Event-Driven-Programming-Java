package Week03;

public class Lesson3 {
    public static void main(String[] args) {

        // Strings
        String greatings = "Hello World!";

        System.out.println(greatings); // output: Hello World!


        //String Length
        String text = "Count how many words";

        System.out.println(text.length()); // output: 20 including whitespace


        // More String Methods
        String word = "Hello";

        System.out.println(word.toLowerCase()); // output: hello
        System.out.println(word.toUpperCase()); // output: HELLO


        // Finding a character in a String
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

        System.out.println(alphabet.indexOf("j")); // output: 18 including whitespace


        // String concatenation
        String firstName = "Jomer";
        String lastName = "Ubaldo";

        System.out.println(firstName + " " + lastName); // output: Jomer Ubaldo
        System.out.println(firstName.concat(lastName)); // output: JomerUbaldo


        //Number and String
        int w = 30;
        int x = 20;
        String y = "10";
        String z = "5";

        int number = w + x;
        String string = y + z;
        String stringNumber = w + y;

        System.out.println(number); // output: 50 (real number)
        System.out.println(string); // output: 105 (real string)
        System.out.println(stringNumber); // output: 3010 (real string)


        // String - special characters
        String specialChar = "We are the so-called \"Viking\" From the north.";
        String txt = "The character \\ is called backslash.";

        System.out.println(specialChar); // output: We are the so-called "Viking" From the north.
        System.out.println(txt); // output: The character \ is called backslash.


        // Boolean values
        boolean isBSITFun = true;
        boolean isBSITNotFun = false;

        System.out.println(isBSITFun); // output: true
        System.out.println(isBSITNotFun); // output:  false


        // Boolean expression
        int num1 = 18;
        int num2 = 20;

        boolean result = num1 > num2;

        System.out.println(result); // output: false
        System.out.println(20 > 10); // output: true
        System.out.println(num1 == 18); // output: true
        System.out.println(18 == 20); // output: false

        // Boolean Real life example
        int myAge = 24;
        int votingAge = 18;

        System.out.println(myAge >= votingAge); // output: true

        // Boolean with conditional statement
        if (myAge >= votingAge) {
            System.out.println("You can vote now!"); // output: true, You can vote now!
        } else {
            System.out.println("Sorry, you cannot vote!"); // output: false, Sorry you cannot vote!
        }

    }
}