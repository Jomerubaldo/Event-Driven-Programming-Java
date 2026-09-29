package Week04.Statements;

public class ContinueStatement {
    public static void main(String[] arg) {

        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5)
                continue;
            System.out.print(count + " ");
        }
    }
}

// Output: 1 2 3 4 6 7 8 9 10