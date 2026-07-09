import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * STEAM API
 * PARALLEL STREAM
 * - when values are not independent and its a lot faster.
 * 
 */
public class Main {
    public static void main(String[] args) {
        int size = 10_000;
        // List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for (int index = 0; index < size; index++) {
            nums.add(ran.nextInt(100));

        }
        long startSeq = System.currentTimeMillis();
        // System.out.println(nums);
        int sum1 = nums.stream().map(i -> 1 * 2).reduce(0, (p, b) -> p + b);
        int sum2 = nums.stream().map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();
        long startPara = System.currentTimeMillis();

        int sum3 = nums.parallelStream().map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        // System.out.println("Sum 1: " + sum1 + " Sum 2: " + sum2 + " Sum 3: " + sum3);
        System.out.println(" Sum 2: " + sum2 + " Sum 3: " + sum3);
        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("Para : " + (endPara - startPara));

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
