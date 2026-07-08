import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator vs Comparable
 * - Compare two values and swap
 */
public class Main {
    public static void main(String[] args) {
        Comparator comp = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1;
                }
                return -1;
            }
        };
        List<String> values = new ArrayList<>();
        values.add("Tolu");
        values.add("Aliya");
        values.add("Ope");
        values.add("Fakunle");

        Collections.sort(values, comp);
        System.out.println(values);

    }
}
