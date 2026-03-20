public class RunnableMain {

    public static void main(String[] args) {

        // Runnable using lambda
        Runnable task = () -> {
            System.out.println("Task started...");
            
            try {
                Thread.sleep(2000); // simulate work (2 sec)
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }

            System.out.println("Task completed!");
        };

        // Run in separate thread
        Thread t = new Thread(task);
        t.start();

        System.out.println("Main thread continues...");
    }
}