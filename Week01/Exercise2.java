import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int input1 = scanner.nextInt();

    if( input1 % 2 == 0 ) {
      System.out.println((input1) + " is even.");
    } else {
      System.out.println((input1) + " is odd.");
    }

    scanner.close();

  }
}

// na solve ko itong problema nato gamit ang modulo na using conditional statement na kapag divided sa 2 ang number at may sobra sa na 1 condered to na odd pero kapag wala at equal sa zero considered to as even tapos print lang based sa codition na mag mamatch at hindi
