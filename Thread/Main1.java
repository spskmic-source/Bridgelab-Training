class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() +
                " | Type: " + type +
                " | Priority: " + Thread.currentThread().getPriority() +
                " | Checking balance (" + i + ")"
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("A", "Premium"), "User-Premium");
        Thread regular = new Thread(new BankAccount("B", "Regular"), "User-Regular");
        Thread basic = new Thread(new BankAccount("C", "Basic"), "User-Basic");

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}