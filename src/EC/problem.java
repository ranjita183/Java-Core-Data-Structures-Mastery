package EC;

import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: problem
 * ============================================================================
 * Description:
 *   Demonstrates solving mathematical and logical problems in Java:
 *   1. Checking if a number is Prime.
 *   2. Calculating the Factorial of a number.
 * ============================================================================
 */
public class problem {

    /**
     * Checks if a given number is Prime.
     * @param n Input integer
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Calculates factorial of a non-negative integer.
     * @param n Non-negative integer
     * @return Factorial value
     */
    public static long calculateFactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial undefined for negative numbers.");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Problem Solving Utility ==========");
        System.out.print("Enter an integer to test Prime & Factorial: ");
        int num = scanner.nextInt();

        System.out.println("--------------------------------------------");
        System.out.println("Is " + num + " a Prime Number? : " + isPrime(num));
        if (num <= 20) {
            System.out.println("Factorial of " + num + "          : " + calculateFactorial(num));
        } else {
            System.out.println("Factorial calculation skipped (number too large for long type).");
        }
        System.out.println("--------------------------------------------");
    }
}
