package EC;

/**
 * ============================================================================
 * CLASS: NotEligibleException
 * ============================================================================
 * Description:
 *   Custom User-Defined Checked Exception extending standard `java.lang.Exception`.
 * 
 * Inter-connectivity:
 *   NotEligibleException (Custom Exception Definition)
 *     ^
 *     |-- throw_throws (Throws and handles this custom exception)
 * 
 * Concepts Demonstrated:
 *   - Custom Exception Creation (`extends Exception`)
 *   - Method Overriding (`getMessage()`)
 *   - Custom exception messaging for business validation (e.g. Voting Age)
 * ============================================================================
 */
public class NotEligibleException extends Exception {

    /**
     * Default Constructor with predefined error message.
     */
    public NotEligibleException() {
        super("Not Eligible for voting! Minimum required age is 18.");
    }

    /**
     * Parameterized Constructor accepting custom message.
     * @param message Specific failure detail
     */
    public NotEligibleException(String message) {
        super(message);
    }

    /**
     * Overrides standard Throwable getMessage() method.
     * @return Exception detail message
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
