import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * OPTIONAL CLASS
 * 
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "John", "Kishna");
        Optional<String> name = names.stream().filter((x) -> x.contains("J")).findFirst();
        String name2 = names.stream().filter((x) -> x.contains("Z")).findFirst().orElse(null);

        System.out.println(name.get());
        System.out.println(name.orElse(null));
        System.out.println(name2);

    }
}