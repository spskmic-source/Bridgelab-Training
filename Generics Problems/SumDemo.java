import java.util.*;

public class SumDemo {

    // Generic method using wildcard
    public static double sumNumbers(List<? extends Number> list) {

        double sum = 0;

        for (Number num : list) {
            sum += num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        // Integer list
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        System.out.println("Sum of Integers: " + sumNumbers(intList));

        // Double list
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.0);
        System.out.println("Sum of Doubles: " + sumNumbers(doubleList));
    }
}