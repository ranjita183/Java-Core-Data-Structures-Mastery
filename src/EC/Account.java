package EC;

/**
 * ============================================================================
 * CLASS: Account
 * ============================================================================
 * Description: 
 *   Represents a basic Bank Account. This class serves as the BASE CLASS (Parent)
 *   in a multi-level inheritance hierarchy:
 * 
 *   Account (Base Class)
 *     └── Loan (Derived Class)
 *           └── HomeLoan (Sub-Derived Class)
 * 
 * Concepts Demonstrated:
 *   - Object-Oriented Programming (OOP) Base Class
 *   - Encapsulation (Private fields, Constructors, Accessors)
 *   - Basic Banking Operations (Deposit, Display Details)
 * ============================================================================
 */
public class Account {
    // Encapsulated Member Variables
    private String name;
    private int accountNo;
    private double balance;

    /**
     * Default Constructor
     */
    public Account() {
        this.name = "Unknown";
        this.accountNo = 0;
        this.balance = 0.0;
    }

    /**
     * Parameterized Constructor
     * @param name Name of the account holder
     * @param accountNo Unique account number
     * @param balance Initial account balance
     */
    public Account(String name, int accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Displays complete account details.
     */
    public void displayAccountDetails() {
        System.out.println("========== Account Details ==========");
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number       : " + accountNo);
        System.out.println("Current Balance      : $" + balance);
        System.out.println("-------------------------------------");
    }

    /**
     * Deposits specified amount into the account.
     * @param amount Deposit amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("Updated Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
        System.out.println("-------------------------------------");
    }

    /**
     * Main method to demonstrate standalone Account operations.
     */
    public static void main(String[] args) {
        Account acc = new Account("Virat Kohli", 18, 2025.00);
        acc.displayAccountDetails();
        acc.deposit(500.00);
    }
}
