package EC;

import java.util.Scanner;

/**
 * ============================================================================
 * CLASS: C
 * ============================================================================
 * Description:
 *   Demonstrates dynamic array creation and finding the maximum element
 *   entered by the user.
 * 
 * Inter-connectivity:
 *   C (Concrete Base Class) <--- D (Abstract Class extending C)
 * 
 * Concepts Demonstrated:
 *   - User input via Scanner
 *   - Array initialization and element iteration
 *   - Linear search logic to find the largest value in an array
 * ============================================================================
 */
public class C {

    /**
     * Finds and returns the maximum value in an integer array.
     * @param arr Array of integers
     * @return Largest integer in the array
     */
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxVal = findLargest(numbers);
        System.out.println("The largest element in the array is: " + maxVal);
    }
}