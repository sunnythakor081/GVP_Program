// Subsystem 1: Account Management
public class Account {
    private double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void updateBalance(double amount) {
        this.balance += amount;
        System.out.println("Account balance updated. New balance: $" + balance);
    }
}



