class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        try {
            System.out.println("Order " + orderId + " picked up by " + Thread.currentThread().getName());
            Thread.sleep(deliveryTime * 500);

            System.out.println("Order " + orderId + " in transit by " + Thread.currentThread().getName());
            Thread.sleep(deliveryTime * 500);

            System.out.println("Order " + orderId + " delivered by " + Thread.currentThread().getName());

            long end = System.currentTimeMillis();
            System.out.println("Total time for Order " + orderId + ": " + (end - start) + " ms\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 2), "Agent-1");
        Thread o2 = new Thread(new Order(2, "Dominos", 3), "Agent-2");
        Thread o3 = new Thread(new Order(3, "McD", 1), "Agent-3");
        Thread o4 = new Thread(new Order(4, "PizzaHut", 4), "Agent-4");
        Thread o5 = new Thread(new Order(5, "BurgerKing", 2), "Agent-5");

        o1.setPriority(10); // Express
        o2.setPriority(5);  // Standard
        o3.setPriority(3);  // Economy
        o4.setPriority(5);
        o5.setPriority(10);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}