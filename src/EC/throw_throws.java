package EC;

import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: throw_throws
 * ============================================================================
 * Description:
 *   Demonstrates Java exception handling using `throw` (explicitly raising an exception)
 *   and `throws` (declaring an exception in a method signature).
 * 
 * Inter-connectivity:
 *   throw_throws ---> NotEligibleException (Instantiates and throws custom exception)
 * 
 * Key Concepts:
 *   - `throw`: Used to explicitly throw an exception object (`throw new NotEligibleException()`).
 *   - `throws`: Used in method signature to declare that method may propagate an exception.
 * ============================================================================
 */
public class throw_throws {

    /**
     * Validates voter age. Throws NotEligibleException if age < 18.
     * @param age Age of applicant
     * @throws NotEligibleException If age is under 18
     */
    public static void checkVotingEligibility(int age) throws NotEligibleException {
        if (age >= 18) {
            System.out.println("Eligibility Status: Eligible for voting!");
        } else {
            throw new NotEligibleException("Underage: Age " + age + " is below 18. Not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Voting Eligibility Validator ==========");
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        try {
            checkVotingEligibility(age);
        } catch (NotEligibleException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed. Thank you!");
        }
    }
}
