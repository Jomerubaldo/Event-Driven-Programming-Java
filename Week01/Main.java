import java.util.Scanner; // import

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // call scanner

        System.out.print("Enter first number: ");
        int input1 = scanner.nextInt(); // use scanner in variable

        System.out.print("Enter second number: ");
        int input2 = scanner.nextInt();

        // calculation
        int sum = input1 + input2;
        int difference = input1 - input2;
        int product = input1 * input2;
        int quotient = input1 / input2;

        // display
        System.out.println("Sum: " + (sum));
        System.out.println("Difference: " + (difference));
        System.out.println("Product: " + (product));
        System.out.println("Quotient: " + (quotient));

        scanner.close();

    }
}


/* I solved this problem using arithmetic operators. I used the "Scanner" class, which I imported so I could enter numbers through the terminal and perform calculations. I then displayed the results using "System.out.println()" with string concatenation. I also applied data types and variables in the program. */
