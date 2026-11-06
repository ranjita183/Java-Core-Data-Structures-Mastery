package EC;

import java.util.ArrayList;

/**
 * ============================================================================
 * CLASS: Generic_no_generic
 * ============================================================================
 * Description:
 *   Compares Generic (Type-Safe) vs Non-Generic Collections in Java.
 * 
 * Key Takeaways:
 *   1. Generic Collection `ArrayList<Integer>` enforces strict compile-time type checking,
 *      eliminating `ClassCastException` at runtime.
 *   2. Non-Generic Collection `ArrayList` allows mixed data types, but requires manual casting.
 * ============================================================================
 */
public class Generic_no_generic {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        System.out.println("========== Type-Safe Generic Collection ==========");
        // Generic List restricted strictly to Integer elements
        ArrayList<Integer> genericList = new ArrayList<>();
        genericList.add(100);
        genericList.add(200);
        genericList.add(300);
        // genericList.add("String"); -> Compilation error! Prevents type mismatch.

        for (int num : genericList) { // Direct unboxing without casting
            System.out.println("Generic Integer: " + num);
        }

        System.out.println("\n========== Non-Generic Collection ==========");
        // Non-generic List accepting any Object
        ArrayList rawList = new ArrayList();
        rawList.add(10);
        rawList.add("Java Programming");
        rawList.add(99.99);

        for (Object item : rawList) {
            System.out.println("Raw Item: " + item + " (Type: " + item.getClass().getSimpleName() + ")");
        }
    }
}
