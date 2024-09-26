class Bank {
    private String accountNumber;
    private String accountHolderName;
    private int balance;


    public Bank(String accountNumber, String accountHolderName, int initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }


    public void performTransaction(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " completed. Current balance: " + balance);
    }


    public void performTransaction(int amount, boolean isWithdrawal) {
        if (isWithdrawal) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " completed. Current balance: " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal. Current balance: " + balance);
            }
        } else {
            performTransaction(amount);
        }
    }


    public void performTransaction(String fromAccount, String toAccount, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer of " + amount + " from account " + fromAccount + " to account " + toAccount + " completed.");
            System.out.println("Current balance of " + fromAccount + ": " + balance);
        } else {
            System.out.println("Insufficient balance for transfer. Current balance: " + balance);
        }
    }


    public void performTransaction() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }


}
