package Week04.Statements;

public class BreakStatement {
    public static void main(String[] args) {

        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5)
                break;
            System.out.println(count + " ");
        }
    }
}

// Output: 1 2 3 4