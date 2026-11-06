package EC;

/**
 * ============================================================================
 * CLASS: Loan
 * ============================================================================
 * Description:
 *   Represents a Loan account extending the basic Account class.
 * 
 * Hierarchy:
 *   Account (Parent Class)
 *     └── Loan (Derived Child Class)
 *           └── HomeLoan (Sub-Derived Class)
 * 
 * Concepts Demonstrated:
 *   - Single Level Inheritance ('Loan extends Account')
 *   - Constructor Chaining via 'super()'
 *   - Method Inheritance (inherits displayAccountDetails() from Account)
 * ============================================================================
 */
public class Loan extends Account {
    // Additional Loan Specific Member Variable
    private double loanAmount;

    /**
     * Default Constructor
     */
    public Loan() {
        super();
        this.loanAmount = 0.0;
    }

    /**
     * Parameterized Constructor
     * @param loanAmount Loan amount allocated
     */
    public Loan(double loanAmount) {
        // Calls the superclass (Account) constructor
        super("Shivu", 18, 2025.00);
        this.loanAmount = loanAmount;
    }

    /**
     * Parameterized Constructor with full account details
     */
    public Loan(String name, int accountNo, double balance, double loanAmount) {
        super(name, accountNo, balance);
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Displays loan specific details.
     */
    public void displayLoanDetails() {
        System.out.println("========== Loan Details ==========");
        System.out.println("Monthly Loan Amount  : $" + loanAmount);
        System.out.println("----------------------------------");
    }

    /**
     * Main method to demonstrate Loan inheritance functionality.
     */
    public static void main(String[] args) {
        Loan loan = new Loan(500.00);
        loan.displayAccountDetails(); // Inherited method from Account
        loan.displayLoanDetails();    // Method defined in Loan
    }
}
