package ExceptionHandling.ThrowDemo;

public class AccountManager {
    private double balance;

    public void deposite(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException {
        if (amount <= balance)
            balance -= amount;
        else
            throw new BalanceInsufficientException("Insufficient balance...");
    }

    public double getBalance() {
        return balance;
    }
}
