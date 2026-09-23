import java.math.BigInteger;
import java.util.Scanner;

public abstract class Exercise3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int input = scanner.nextInt();

    BigInteger fact = BigInteger.ONE;

    for (int i = 1; i <= input; i++) {
      fact = fact.multiply(BigInteger.valueOf(i));
    }
    System.out.println("Factorial of " + input + " " + "is: " + fact);

    scanner.close();

  }

}

// na solve ko ito gamit ang for loop pero nag initialize muna ako ng 1 so para
// gumana ang loops ko mag start sa 1 at gamit ang ++; is mag iincrease siya ng
// kada isa so kapag ang i ay naging 2 na at ang fact variable ay 1 multiple
// niya lang ito sa like 1 * 2 tapos mag update nanaman ng value ang factorial
// magiging 2 at ang i na viariable ay magiging 3 at magiging 2 * 3 and soon and
// print lang sa fact na variable para sa final output
