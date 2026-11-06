package EC;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * ============================================================================
 * CLASS: set_non_generic
 * ============================================================================
 * Description:
 *   Demonstrates Java Set implementations (`HashSet` vs `TreeSet`).
 * 
 * Key Characteristics of Sets:
 *   - Sets do NOT allow duplicate elements.
 *   - `HashSet`: Unordered collection, allows null elements, fast O(1) performance.
 *   - `TreeSet`: Automatically sorts elements in natural ascending order, does NOT allow null.
 * ============================================================================
 */
public class set_non_generic {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        System.out.println("========== 1. HashSet Demo (Unordered, Unique) ==========");
        HashSet hashSet = new HashSet();

        hashSet.add(10);
        hashSet.add('a');
        hashSet.add("aa");
        hashSet.add(10);  // Duplicate integer: Ignored!
        hashSet.add('a'); // Duplicate char: Ignored!
        hashSet.add("10.11");

        System.out.println("HashSet Size (Duplicates ignored): " + hashSet.size());
        System.out.println("HashSet Content: " + hashSet);

        System.out.print("HashSet Iteration: ");
        for (Object item : hashSet) {
            System.out.print(item + " | ");
        }
        System.out.println("\n-----------------------------------------------------------");

        System.out.println("========== 2. TreeSet Demo (Sorted Order) ==========");
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(25);
        treeSet.add(100);
        treeSet.add(71);

        System.out.println("TreeSet Size    : " + treeSet.size());
        System.out.println("TreeSet Content (Auto-Sorted) : " + treeSet);

        System.out.print("TreeSet Iteration : ");
        for (int value : treeSet) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
