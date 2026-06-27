// BankAccount.java - Demonstrates Encapsulation in Java OOP

public class BankAccount {

    // ---------- Private Attributes (Encapsulation) ----------
    // Attributes are private so they cannot be accessed directly from outside this class
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // ---------- Getter and Setter Methods ----------

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance - validates that balance cannot be set to a negative value
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid: Balance cannot be negative.");
        }
    }

    // ---------- deposit(double amount) ----------
    // Adds money to the balance; rejects negative or zero deposit amounts
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.printf("Deposit successful! Amount deposited: Rs. %.2f%n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // ---------- withdraw(double amount) ----------
    // Subtracts money from balance only if sufficient funds are available
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed! Insufficient balance.");
            System.out.printf("Available balance: Rs. %.2f%n", balance);
        } else {
            balance = balance - amount;
            System.out.printf("Withdrawal successful! Amount withdrawn: Rs. %.2f%n", amount);
        }
    }

    // ---------- displayAccountDetails() ----------
    // Displays all account information in a formatted layout
    public void displayAccountDetails() {
        System.out.println("=============================");
        System.out.println("       Account Details       ");
        System.out.println("=============================");
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Account Holder  : " + accountHolderName);
        System.out.printf( "Balance         : Rs. %.2f%n", balance);
        System.out.println("=============================");
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        // Step 1: Create a BankAccount object
        BankAccount account = new BankAccount();

        // Step 2: Set account details using setter methods
        account.setAccountNumber("ACC-2024-001");
        account.setAccountHolderName("John Perera");
        account.setBalance(0.00);

        System.out.println("\n--- Initial Account Details ---");
        account.displayAccountDetails();

        // Step 3: Deposit Rs. 5000 into the account
        System.out.println("\n--- Depositing Rs. 5000 ---");
        account.deposit(5000);
        account.displayAccountDetails();

        // Step 4: Withdraw Rs. 2000 from the account
        System.out.println("\n--- Withdrawing Rs. 2000 ---");
        account.withdraw(2000);
        account.displayAccountDetails();

        // Step 5: Attempt an invalid withdrawal (more than available balance)
        System.out.println("\n--- Attempting to Withdraw Rs. 10000 (Insufficient Funds) ---");
        account.withdraw(10000);
    }
}
