public class BankAccount {
    // Attributes for the bank account
    private double balance;

    // Constructor to initialize the account with a balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method for depositing money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    // Method for withdrawing money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000);

        // Perform deposit, withdrawal, and balance check
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}
