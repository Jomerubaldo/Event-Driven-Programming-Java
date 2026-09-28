package Week04.SwitchCaseStructure;

public class SwitchCaseWithBreakAndDefault {
    public static void main(String[] args) {

        String grade = "C";

        switch (grade) {
            case "A":
                System.out.println("The grade is A.");
                break;
            case "B":
                System.out.println("The grade is B.");
                break;
            case "C":
                System.out.println("The grade is C.");
                break;
            case "D":
                System.out.println("The grade is D.");
                break;
            case "F":
                System.out.println("The grade is F.");
            default:
                System.out.println("The grade is invalid.");
        }
    }
}
