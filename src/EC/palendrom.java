package EC;

import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: palendrom
 * ============================================================================
 * Description:
 *   Algorithm to check whether a number or string is a Palindrome.
 *   A Palindrome is a sequence that reads the same backward as forward (e.g. 121, 12321, "madam").
 * 
 * Concepts Demonstrated:
 *   - Mathematical number reversal algorithm (`reversed = reversed * 10 + remainder`)
 *   - Comparison of original vs reversed values
 * ============================================================================
 */
public class palendrom {

    /**
     * Checks if an integer is a palindrome.
     * @param number Input integer
     * @return true if number is palindrome, false otherwise
     */
    public static boolean isPalindromeNumber(int number) {
        int original = number;
        int reversed = 0;

        int temp = Math.abs(number);
        while (temp > 0) {
            int remainder = temp % 10;
            reversed = (reversed * 10) + remainder;
            temp /= 10;
        }

        return Math.abs(original) == reversed;
    }

    /**
     * Reverses an integer and returns the reversed value.
     * @param number Input integer
     * @return Reversed integer
     */
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = (reversed * 10) + remainder;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Palindrome Number Checker ==========");
        System.out.print("Enter a number to check: ");

        int num = scanner.nextInt();
        int rev = reverseNumber(num);

        System.out.println("Original Number : " + num);
        System.out.println("Reversed Number : " + rev);

        if (isPalindromeNumber(num)) {
            System.out.println("Result: " + num + " is a PALINDROME!");
        } else {
            System.out.println("Result: " + num + " is NOT a palindrome.");
        }
    }
}
