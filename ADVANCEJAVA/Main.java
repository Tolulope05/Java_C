import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * METHOD REFERNCE
 * - passing a method name inside the method to use it
 * 
 */
public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin", "Hush", "John");
        List<String> uNames = names.stream().map((e) -> e.toUpperCase()).toList();
        List<String> lNames = uNames.stream().map(String::toLowerCase).toList(); // Method refernce
        System.out.println(uNames);
        System.out.println(lNames);

        lNames.forEach(System.out::println);

    }
}