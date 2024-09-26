class Bank {
    private String accountNumber;
    private String accountHolderName;
    private int balance;

    // Constructor to initialize account details
    public Bank(String accountNumber, String accountHolderName, int initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to perform a deposit transaction
    public void performTransaction(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " completed. Current balance: " + balance);
    }

    // Method to perform a withdrawal transaction
    public void performTransaction(int amount, boolean isWithdrawal) {
        if (isWithdrawal) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " completed. Current balance: " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal. Current balance: " + balance);
            }
        } else {
            performTransaction(amount); // Treat as deposit if isWithdrawal is false
        }
    }

    // Method to perform a transfer transaction
    public void performTransaction(String fromAccount, String toAccount, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer of " + amount + " from account " + fromAccount + " to account " + toAccount + " completed.");
            System.out.println("Current balance of " + fromAccount + ": " + balance);
        } else {
            System.out.println("Insufficient balance for transfer. Current balance: " + balance);
        }
    }

    // Method to print account details
    public void performTransaction() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank account1 = new Bank("123456789", "Sitesh Kumar", 5000);

        // Performing deposit
        account1.performTransaction(1000);

        // Performing withdrawal
        account1.performTransaction(2000, true);

        // Performing transfer
        account1.performTransaction("123456789", "987654321", 1500);

        // Printing account details
        account1.performTransaction();
    }
}