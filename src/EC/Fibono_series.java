package EC;

import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: Fibono_series
 * ============================================================================
 * Description:
 *   Generates the Fibonacci Series starting from user-provided seed values (a, b)
 *   up to N terms.
 * 
 * Math Principle:
 *   Fibonacci Sequence: Next term = Previous term + Second Previous term
 *   F(n) = F(n-1) + F(n-2)
 * ============================================================================
 */
public class Fibono_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Fibonacci Series Generator ==========");
        System.out.print("Enter 1st seed value (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd seed value (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter total number of terms to generate: ");
        int count = scanner.nextInt();

        System.out.println("\nGenerated Fibonacci Series:");
        System.out.print(a + " " + b + " ");

        int i = 1;
        while (i <= count) {
            int nextFibonacci = a + b;
            System.out.print(nextFibonacci + " ");
            a = b;
            b = nextFibonacci;
            i++;
        }
        System.out.println();
    }
}
