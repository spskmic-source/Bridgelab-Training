import java.util.function.Function;

public class StringMain {

    public static void main(String[] args) {

        String message = "Hello this is a long message";
        int limit = 20;

        // Function: String -> Integer (length)
        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds limit");
        } else {
            System.out.println("Message within limit");
        }

        System.out.println("Length: " + length);
    }
}