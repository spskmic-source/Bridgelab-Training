import java.util.*;

public class CopyDemo {

    // Method to copy elements
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {

        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {

        // Source lists
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(4.5, 5.5);

        // Destination list
        List<Number> destList = new ArrayList<>();

        // Copy elements
        copyList(destList, intList);
        copyList(destList, doubleList);

        System.out.println("Destination List: " + destList);
    }
}