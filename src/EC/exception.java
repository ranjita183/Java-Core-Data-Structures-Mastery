package EC;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: exception
 * ============================================================================
 * Description:
 *   Demonstrates built-in exception handling mechanism in Java using
 *   `try`, `catch`, and `finally` blocks.
 * 
 * Concepts Demonstrated:
 *   - Handling `ArithmeticException` (Division by Zero)
 *   - Handling `InputMismatchException` (Non-numeric input)
 *   - Guaranteed code execution using `finally` block
 * ============================================================================
 */
public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Built-in Exception Handling Demo ==========");
        try {
            System.out.print("Enter the numerator (1st number): ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator (2nd number): ");
            int denominator = scanner.nextInt();

            double result = numerator / denominator;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Error: Denominator cannot be zero!");
        } catch (InputMismatchException e) {
            System.err.println("Input Mismatch Error: Please enter valid integer values only!");
        } finally {
            System.out.println("-----------------------------------------------------");
            System.out.println("Finally block executed: Clean up and resource checks complete.");
            scanner.close();
        }
    }
}
