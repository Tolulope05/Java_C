/**
 * ENUMS
 * - ordinal is used to get the location of the constsnt in the enum.
 * - values() is used to know all the list in the enum.
 */
public class Main {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal()); // 2
        Status[] statuses = s.values();
        for (Status ss : statuses) {
            System.out.println(s.ordinal() + ". " + ss);
        }
    }
}

enum Status {
    Running, Failed, Pending, Success; // NAMED CONSTANTS
}