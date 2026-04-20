import java.util.*;

// Account Class
class Account {
    int accountId;
    String name;

    public Account(int accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;
        Account a = (Account) obj;
        return this.accountId == a.accountId;
    }
}

// Transaction Class
class Transaction {
    int transactionId;
    int accountId;
    double amount;

    public Transaction(int transactionId, int accountId, double amount) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TxnID: " + transactionId + ", AccID: " + accountId + ", Amount: " + amount;
    }
}

// Main System
public class BankingSystem {
    public static void main(String[] args) {

        // 1. List to record all transactions
        List<Transaction> transactionHistory = new ArrayList<>();

        // 2. Queue for pending transactions
        Queue<Transaction> transactionQueue = new LinkedList<>();

        transactionQueue.add(new Transaction(1, 101, 500));
        transactionQueue.add(new Transaction(2, 102, 1000));
        transactionQueue.add(new Transaction(3, 999, 300)); // Invalid account

        // 3. Set for valid accounts
        Set<Account> validAccounts = new HashSet<>();
        validAccounts.add(new Account(101, "Amit"));
        validAccounts.add(new Account(102, "Ravi"));

        // 4. Stack for rollback
        Stack<Transaction> rollbackStack = new Stack<>();

        System.out.println("Processing Transactions:");

        while (!transactionQueue.isEmpty()) {
            Transaction txn = transactionQueue.poll();

            // Validate account
            boolean isValid = false;
            for (Account acc : validAccounts) {
                if (acc.accountId == txn.accountId) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                transactionHistory.add(txn);
                rollbackStack.push(txn);
                System.out.println("Success: " + txn);
            } else {
                System.out.println("Failed (Invalid Account): " + txn);
            }
        }

        // Rollback last transaction
        System.out.println("\nRolling Back Last Transaction:");

        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            transactionHistory.remove(last);
            System.out.println("Rolled Back: " + last);
        }

        // Final Transaction History
        System.out.println("\nFinal Transaction History:");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}