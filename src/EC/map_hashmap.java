package EC;

import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================================
 * CLASS: map_hashmap
 * ============================================================================
 * Description:
 *   Demonstrates Java `HashMap` key-value mapping and iteration operations.
 * 
 * Key Characteristics of HashMap:
 *   - Stores elements in Key-Value pairs (`Map<K, V>`).
 *   - Keys must be unique; duplicate keys overwrite the previous value.
 *   - Unordered collection with fast O(1) retrieval time.
 * ============================================================================
 */
public class map_hashmap {

    public static void main(String[] args) {
        System.out.println("========== HashMap Operations Demo ==========");

        // Creating HashMap: Student Roll No (Integer) -> Student Name (String)
        HashMap<Integer, String> studentMap = new HashMap<>();

        // 1. Insertion (put)
        studentMap.put(101, "Virat");
        studentMap.put(102, "Shivu");
        studentMap.put(103, "Manoj");
        studentMap.put(104, "Sharath");

        System.out.println("Total Records: " + studentMap.size());
        System.out.println("HashMap Content: " + studentMap);
        System.out.println("---------------------------------------------");

        // 2. Access and Lookup
        System.out.println("Student with Roll No 102: " + studentMap.get(102));
        System.out.println("Contains Roll No 105?     : " + studentMap.containsKey(105));
        System.out.println("---------------------------------------------");

        // 3. Iterating using entrySet()
        System.out.println("--- Iterating Key-Value Pairs ---");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}
