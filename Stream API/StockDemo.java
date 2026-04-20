import java.util.*;

public class StockDemo {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(101.5, 102.3, 99.8);

        prices.forEach(System.out::println);
    }
}