// Subsystem 2: Transaction Processing
class TransactionProcessor {
    public void processTransfer(Account fromAccount, Account toAccount, double amount) {
        System.out.println("Processing transaction...");
        fromAccount.updateBalance(-amount);
        toAccount.updateBalance(amount);
        System.out.println("Transaction successful: Transferred $" + amount);
    }
}
