public class CompareDemo {

    // Generic method to compare two values
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        // Integer comparison
        System.out.println("Compare Integers: " + isEqual(10, 10));

        // String comparison
        System.out.println("Compare Strings: " + isEqual("Java", "Java"));

        // Double comparison
        System.out.println("Compare Doubles: " + isEqual(5.5, 6.5));
    }
}