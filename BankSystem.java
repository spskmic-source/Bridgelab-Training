// Custom Exception (public मत बनाना)
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// BankAccount class (public नहीं)
class BankAccount {
    double balance = 1000;

    public void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// ONLY this class should be public
public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(1500); // test cases बदल सकते हो

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}