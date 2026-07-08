import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * STEAM API
 * - FOR EACH METHOD
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        // System.out.println(nums);
        // int sum = 0;
        // for (int n : nums) {

        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(sum);

        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));

        // }

        // for (int n : nums) {
        // System.out.println(n);
        // }

        // nums.forEach(n -> System.out.println(n));

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };
        Consumer<Integer> con = (n) -> System.out.println(n);

        nums.forEach(con);

    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        }
        return -1;
    }

}
