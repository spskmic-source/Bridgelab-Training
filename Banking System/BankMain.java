// Interface
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

// Abstract Class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation (Getters & Setters)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Abstract Method
    public abstract double calculateInterest();

    // Display
    public void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2; // simple logic
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

// Main Class
public class BankMain {

    // Polymorphism Method
    public static void processAccount(BankAccount acc) {
        acc.display();

        double interest = acc.calculateInterest();
        System.out.println("Interest: " + interest);

        if (acc instanceof Loanable) {
            Loanable l = (Loanable) acc;
            System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount(101, "Rahul", 50000);
        BankAccount a2 = new CurrentAccount(102, "Aman", 80000);

        BankAccount[] accounts = {a1, a2};

        for (BankAccount acc : accounts) {
            processAccount(acc);
        }
    }
}