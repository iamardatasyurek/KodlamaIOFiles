package ExceptionHandling.ThrowDemo;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Balance : " + accountManager.getBalance());
        accountManager.deposite(100);
        System.out.println("Balance : " + accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance : " + accountManager.getBalance());
        try {
            accountManager.withdraw(20);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance : " + accountManager.getBalance());

    }
}
