// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter for first value
    public T getFirst() {
        return first;
    }

    // Getter for second value
    public U getSecond() {
        return second;
    }
}

// Main Class to Test
public class GenericPairDemo {
    public static void main(String[] args) {

        // Example: String and Integer
        Pair<String, Integer> student = new Pair<>("Amol", 20);

        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        // Another example
        Pair<Integer, Double> data = new Pair<>(10, 5.5);
        System.out.println("First: " + data.getFirst());
        System.out.println("Second: " + data.getSecond());
    }
}