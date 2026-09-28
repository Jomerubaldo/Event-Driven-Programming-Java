package Week04.ControlStructure;

public class MultipleSelection_NestedIf {
    public static void main(String[] args) {

        int age = 19;

        if (age >= 18) {

            if (age == 18) {
                System.out.println("Starting legal age.");
            } else {
                System.out.println("Legal age.");
            }

        } else {
            System.out.println("Your minor.");
        }
    }
}
