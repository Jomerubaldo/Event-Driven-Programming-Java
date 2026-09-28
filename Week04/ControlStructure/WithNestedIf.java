package Week04.ControlStructure;

public class WithNestedIf {
    public static void main(String[] args) {

        String grade = "G";

        if (grade == "A") {
            System.out.println("The grade is A.");
        } else if (grade == "B") {
            System.out.println("The grade is B.");
        } else if (grade == "C") {
            System.out.println("The grade is C.");
        } else if (grade == "D") {
            System.out.println("The grade is D.");
        } else if (grade == "F") {
            System.out.println("The grade is F.");
        } else {
            System.out.println("Invalid input grade");
        }
    }
}
