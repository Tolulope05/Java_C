import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Collection - List, Queue, Set
 * - List : ArrayList, LinkedList
 * - Queue : DeQueue
 * - Set : HashSet, Linked HashSe
 * - SET
 * HashSet supports unique values
 * HashSet doesnt have indexed value
 * if you need a sorted Value, use TreeSet
 * 
 */
public class Main {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>(); // Sorted Value
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        for (int n = 0; n < nums.size(); n++) {
            // System.out.println(nums.toArray()[n]);
            // System.out.println(nums.get(n)); // Same thing is its a list
        }

        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();
        // System.out.println(values.next());
        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
