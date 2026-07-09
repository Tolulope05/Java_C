import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CONSTRUCTOR REFERNCE
 * - passing a method name inside the method to use it
 * 
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Hush", "John");
        List<Student> students = new ArrayList<>();
        // for (String name : names) {
        // students.add(new Student(name));
        // } // option 1
        // students = names.stream().map(n -> new Student(n)).toList(); // option 2
        students = names.stream().map(Student::new).toList(); // option 3 Constructor Refernce
        students.forEach(System.out::println);
    }
}

class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}