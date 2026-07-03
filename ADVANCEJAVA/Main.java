/**
 * ENUMS (Switch and If else)
 * - ordinal is used to get the location of the constsnt in the enum.
 * - values() is used to know all the list in the enum.
 */
public class Main {
    public static void main(String[] args) {

        Status s = Status.Pending;
        if (s == Status.Running) {
            System.out.println("All Good");
        } else if (s == Status.Failed) {

            System.out.println("Try again");

        } else if (s == Status.Pending) {

            System.out.println("Please wait");
        } else {
            System.out.println("Done");
        }

        switch (s) {
            case Success:
                System.out.println("Switch Success");
                break;
            case Pending:
                System.out.println("Switch Pending");
                break;
            case Failed:
                System.out.println("Switch Failed");
                break;
            case Running:
                System.out.println("Switch Running");
                break;

            default:
                break;
        }
    }
}

enum Status {
    Running, Failed, Pending, Success; // NAMED CONSTANTS
}