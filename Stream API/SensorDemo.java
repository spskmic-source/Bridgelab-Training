import java.util.*;

public class SensorDemo {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(30, 75, 90, 45);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}