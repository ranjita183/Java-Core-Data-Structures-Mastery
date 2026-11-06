package EC;

import java.util.Arrays;

/**
 * ============================================================================
 * CLASS: assending_order
 * ============================================================================
 * Description:
 *   Demonstrates Character Array conversion techniques (Constructor, String.valueOf,
 *   manual concatenation) and sorting characters into Ascending Order.
 * 
 * Concepts Demonstrated:
 *   1. Converting char[] array to String:
 *      - Method 1: Using `new String(charArray)`
 *      - Method 2: Using `String.valueOf(charArray)`
 *      - Method 3: Manual concatenation loop
 *   2. Sorting Array elements into Ascending Order (`Arrays.sort()`)
 * ============================================================================
 */
public class assending_order {

    public static void main(String[] args) {
        System.out.println("========== Character Array & Ascending Sort Demo ==========");
        char[] ch = {'H', 'i', 'e', 'e'};

        System.out.println("--- Method 1: Using String Constructor ---");
        String s1 = new String(ch);
        System.out.println("Result: " + s1);

        System.out.println("\n--- Method 2: Using String.valueOf() ---");
        String s2 = String.valueOf(ch);
        System.out.println("Result: " + s2);

        System.out.println("\n--- Method 3: Without Built-in (Manual Loop) ---");
        String s3 = "";
        for (int i = 0; i < ch.length; i++) {
            s3 += ch[i];
        }
        System.out.println("Result: " + s3);

        System.out.println("\n--- Sorting Characters in Ascending Order ---");
        char[] charsToSort = {'d', 'a', 'c', 'b'};
        System.out.println("Before Sorting : " + Arrays.toString(charsToSort));
        Arrays.sort(charsToSort);
        System.out.println("After Sorting  : " + Arrays.toString(charsToSort));
    }
}
