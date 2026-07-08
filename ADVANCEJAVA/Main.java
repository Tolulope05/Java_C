import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Collection - List, Queue, Set
 * - List : ArrayList, LinkedList
 * - Queue : DeQueue
 * - Set : HashSet, Linked HashSe
 */
public class Main {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
        for (int n = 0; n < nums.size(); n++) {
            // System.out.println(nums.toArray()[n]);
            // System.out.println(nums.get(n)); // Same thing is its a list
            System.out.println(nums.indexOf(6));
        }

        System.out.println(nums);
    }
}
