// Interface
interface Payment {
    void pay(double amount);
}

// UPI Class
class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Credit Card Class
class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// Wallet Class
class Wallet implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}

// Main Class
public class PaymentMain {

    public static void main(String[] args) {

        // Polymorphism
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        Payment[] payments = {p1, p2, p3};

        double amount = 1000;

        for (Payment p : payments) {
            p.pay(amount);
            System.out.println("----------------");
        }
    }
}