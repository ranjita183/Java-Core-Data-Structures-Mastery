package EC;

import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: second_largest
 * ============================================================================
 * Description:
 *   Algorithm to find the largest and second largest numbers in an array in O(n)
 *   single pass without sorting.
 * 
 * Logic Breakdown:
 *   1. Initialize `largest` and `secondLargest` to Minimum Value.
 *   2. Iterate through array elements:
 *      - If current element > largest, update `secondLargest = largest` and `largest = current`.
 *      - Else if current element > secondLargest and != largest, update `secondLargest = current`.
 * ============================================================================
 */
public class second_largest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Find Second Largest Element ==========");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array size must be at least 2 to find a second largest element.");
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : numbers) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Largest Element        : " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest Element : None (all elements are equal)");
        } else {
            System.out.println("Second Largest Element : " + secondLargest);
        }
    }
}
