import java.util.*;

public class NameDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("amit", "ravi", "neha");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}