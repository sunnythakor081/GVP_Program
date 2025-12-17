// Client code
public class main1 {
    public static void main(String[] args) {
        // Create two accounts with initial balances
        Account account1 = new Account(1000.00);
        Account account2 = new Account(500.00);
        
        // Create the facade object
        BankingFacade bankingFacade = new BankingFacade(account1, account2);
        
        // Perform a transaction using the facade
        bankingFacade.performTransaction(200.00);  // Transfer $200 from account1 to account2
        
        // Check the balances after the transaction
        bankingFacade.checkBalance();
    }
}
