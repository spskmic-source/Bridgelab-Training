public class CartExample {
    public static void main(String[] args) {

        String[] items = {"100", "200", "xyz", "50"};

        int sum = 0;

        for (String item : items) {
            try {
                sum = sum + Integer.parseInt(item);
            } catch (Exception e) {
                System.out.println("Skipped invalid item");
            }
        }

        System.out.println("Final amount = " + sum);
    }
}