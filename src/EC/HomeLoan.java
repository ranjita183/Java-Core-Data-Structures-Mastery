package EC;

/**
 * ============================================================================
 * CLASS: HomeLoan
 * ============================================================================
 * Description:
 *   Represents a specialized Home Loan extending the Loan class.
 * 
 * Hierarchy (Multilevel Inheritance):
 *   Account (Grandparent Class)
 *     └── Loan (Parent Class)
 *           └── HomeLoan (Child Class)
 * 
 * Concepts Demonstrated:
 *   - Multilevel Inheritance ('HomeLoan extends Loan')
 *   - Passing parameters up the inheritance chain using 'super()'
 *   - Accessing inherited methods across multi-level class hierarchies
 * ============================================================================
 */
public class HomeLoan extends Loan {
    // Specialized field for EMI (Equated Monthly Installment)
    private double emiAmount;

    /**
     * Default Constructor
     */
    public HomeLoan() {
        super();
        this.emiAmount = 0.0;
    }

    /**
     * Parameterized Constructor
     * @param emiAmount Monthly EMI for the home loan
     */
    public HomeLoan(double emiAmount) {
        // Invokes Loan constructor, which in turn invokes Account constructor
        super(50000.00); // Pass loan amount to Loan superclass
        this.emiAmount = emiAmount;
    }

    /**
     * Full Parameterized Constructor
     */
    public HomeLoan(String name, int accountNo, double balance, double loanAmount, double emiAmount) {
        super(name, accountNo, balance, loanAmount);
        this.emiAmount = emiAmount;
    }

    public double getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(double emiAmount) {
        this.emiAmount = emiAmount;
    }

    /**
     * Displays home loan specific details.
     */
    public void displayHomeLoanDetails() {
        System.out.println("========== Home Loan Details ==========");
        System.out.println("Monthly EMI Amount   : $" + emiAmount);
        System.out.println("----------------------------------------");
    }

    /**
     * Main method demonstrating Multilevel Inheritance execution.
     */
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan(500.00);
        
        // Demonstrating access to methods from all levels of inheritance hierarchy:
        homeLoan.displayAccountDetails();  // Level 1: inherited from Account
        homeLoan.displayLoanDetails();     // Level 2: inherited from Loan
        homeLoan.displayHomeLoanDetails(); // Level 3: defined in HomeLoan
    }
}
