package EC;

import java.util.ArrayList;

/**
 * ============================================================================
 * CLASS: Collection_non_generic
 * ============================================================================
 * Description:
 *   Demonstrates Java `ArrayList` usage without Generics (Raw Types).
 * 
 * Key Characteristics of Non-Generic Collections:
 *   - Can store heterogeneous objects (Integer, Character, String) in the same list.
 *   - Disadvantage: Lack of compile-time type safety; requires manual type casting.
 * 
 * Operations Demonstrated:
 *   - `add()`, `size()`, `isEmpty()`, `get()`, `remove()`, `contains()`, `addAll()`, `removeAll()`
 * ============================================================================
 */
public class Collection_non_generic {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        System.out.println("========== Non-Generic ArrayList Demo ==========");

        // Raw Type ArrayList (Stores any Object type)
        ArrayList list1 = new ArrayList();

        list1.add(10);  // Autoboxed Integer
        list1.add('a'); // Autoboxed Character
        list1.add(10);  // Duplicates allowed

        System.out.println("List Size          : " + list1.size());
        System.out.println("Is List Empty?     : " + list1.isEmpty());
        System.out.println("List Elements      : " + list1);
        System.out.println("----------------------------------------------");

        System.out.println("Element at index 2 : " + list1.get(2));
        list1.remove(2); // Removes element at index 2
        System.out.println("List after removal : " + list1);
        System.out.println("Contains 'a'?      : " + list1.contains('a'));
        System.out.println("----------------------------------------------");

        ArrayList list2 = new ArrayList();
        list2.addAll(list1);
        System.out.println("List2 (after addAll)  : " + list2);

        list2.removeAll(list2);
        System.out.println("List2 (after removeAll): " + list2);
    }
}
