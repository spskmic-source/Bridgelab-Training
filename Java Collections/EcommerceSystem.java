import java.util.*;

// Order Class
class Order {
    int orderId;
    String product;

    public Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    // Override equals() and hashCode() for duplicate removal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order o = (Order) obj;
        return this.orderId == o.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Product: " + product;
    }
}

// Main System
public class EcommerceSystem {
    public static void main(String[] args) {

        // 1. List to store all orders
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, "Laptop"));
        orderList.add(new Order(2, "Mobile"));
        orderList.add(new Order(1, "Laptop")); // Duplicate
        orderList.add(new Order(3, "Shoes"));

        System.out.println("All Orders:");
        for (Order o : orderList) {
            System.out.println(o);
        }

        // 2. Remove duplicates using Set
        Set<Order> uniqueOrders = new HashSet<>(orderList);

        System.out.println("\nUnique Orders:");
        for (Order o : uniqueOrders) {
            System.out.println(o);
        }

        // 3. Queue for processing orders (FIFO)
        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);

        // 4. Stack for failed orders
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders:");

        while (!orderQueue.isEmpty()) {
            Order current = orderQueue.poll();
            System.out.println("Processing: " + current);

            // Simulate failure condition
            if (current.orderId == 2) {
                System.out.println("Failed: " + current);
                failedOrders.push(current);
            } else {
                System.out.println("Success: " + current);
            }
        }

        // Reprocess failed orders
        System.out.println("\nReprocessing Failed Orders:");

        while (!failedOrders.isEmpty()) {
            Order retry = failedOrders.pop();
            System.out.println("Retrying: " + retry);
            System.out.println("Success: " + retry);
        }
    }
}