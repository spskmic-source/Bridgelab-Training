public class MaximumDemo {

    // Generic method with bounded type
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        // Integer
        System.out.println("Max Integer: " + maximum(10, 25, 15));

        // Double
        System.out.println("Max Double: " + maximum(5.5, 2.2, 9.8));

        // String (lexicographical comparison)
        System.out.println("Max String: " + maximum("Apple", "Mango", "Banana"));
    }
}