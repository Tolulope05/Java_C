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
        // Comparator comp = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if (i.age > j.age) {
        // return 1;
        // }
        // return -1;
        // }
        // };
        Comparator<Student> comp = (i, j) -> i.age > j.age ? 1 : -1;
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "Aliya"));
        studs.add(new Student(18, "Ope"));
        studs.add(new Student(20, "Fakunle"));

        Collections.sort(studs, comp); // Comparator
        Collections.sort(studs); // Comparable
        System.out.println(studs);

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
