public class ShoppingCart {
    public static void main(String[] args) {

        String[] prices = {"250", "499", "99", "abc"};

        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            try {
                int value = Integer.parseInt(prices[i]);
                total += value;
            } catch (Exception e) {
                System.out.println("Invalid price: " + prices[i]);
            }
        }

        System.out.println("Total price = " + total);
    }
}