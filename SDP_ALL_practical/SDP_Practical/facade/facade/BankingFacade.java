    // Facade Class
class BankingFacade {
    private Account account1;
    private Account account2;
    private TransactionProcessor transactionProcessor;
    private NotificationService notificationService;
    
    public BankingFacade(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
        this.transactionProcessor = new TransactionProcessor();
        this.notificationService = new NotificationService();
    }
    
    public void performTransaction(double amount) {
        System.out.println("\nStarting the transaction...");
        transactionProcessor.processTransfer(account1, account2, amount);
        notificationService.sendNotification("You transferred $" + amount + " to another account.");
    }
    
    public void checkBalance() {
        System.out.println("\nChecking balances...");
        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());
    }
}
