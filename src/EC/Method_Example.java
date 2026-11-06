package EC;

/**
 * ============================================================================
 * CLASS: Method_Example
 * ============================================================================
 * Description:
 *   Demonstrates Java method declaration, parameter passing, return types,
 *   and static method calls.
 * ============================================================================
 */
public class Method_Example {

    /**
     * Static helper method to add two integers.
     * @param a 1st integer
     * @param b 2nd integer
     * @return Sum of a and b
     */
    public static int addTwo(int a, int b) {
        int sum = a + b;
        System.out.println("Calculated Sum inside addTwo(" + a + ", " + b + "): " + sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("========== Method Declaration & Return Value Demo ==========");
        int result = addTwo(10, 10);
        System.out.println("Returned Result stored in main variable: " + result);
    }
}
