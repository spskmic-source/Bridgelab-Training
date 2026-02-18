public class NullPointerDemo {

    // Method to GENERATE NullPointerException
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception here
    }

    // Method to HANDLE NullPointerException
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        
        handleException();
    }
}
