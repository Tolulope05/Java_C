import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Map (HashMap and Hashtable)
 * - put method
 * - get method
 * Keys are unique and cant be repeated but the values can be changed
 * Keys are a Set
 * - keySet methofs
 */
public class Main {
    public static void main(String[] args) {
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();
        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Harsh", 45);

        System.out.println(students);
        System.out.println(students.get("Harsh"));

        System.out.println(students.keySet());
        System.out.println(students.values());
        for (String n : students.keySet()) {
            System.out.println(students.get(n));
        }

    }
}
