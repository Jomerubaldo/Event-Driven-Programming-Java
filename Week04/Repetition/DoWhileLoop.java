package Week04.Repetition;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.print(i + " ");
            i = i + 5;

        } while (i <= 30);
    }
}

// Output: 0 5 10 15 20 30

// Reminders:
// 1. Statements are executed first and then expression is evaluated.
// 2. Statements are executed at least once and then continued if expression is
// true.