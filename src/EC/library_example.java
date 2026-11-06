package EC;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * ============================================================================
 * CLASS: library_example
 * ============================================================================
 * Description:
 *   Simulates a Library Management System using `java.util.TreeMap` to map
 *   Book IDs (Key) to Book Titles (Value).
 * 
 * Concepts Demonstrated:
 *   - Map Interface (`TreeMap<Integer, String>`)
 *   - Key-Value Pair Storage (`put(key, value)`)
 *   - Key Lookup (`containsKey(key)`, `get(key)`)
 * ============================================================================
 */
public class library_example {

    public static void main(String[] args) {
        // TreeMap maintains keys in sorted order
        TreeMap<Integer, String> bookCatalog = new TreeMap<>();

        // Populating Library Catalog: Book ID -> Book Title
        bookCatalog.put(1, "Embedded Systems Design (ESD)");
        bookCatalog.put(2, "VLSI Design & Technology");
        bookCatalog.put(3, "Microcontrollers & Microprocessors (MMC)");
        bookCatalog.put(4, "Java Programming & Data Structures");

        System.out.println("========== Library Catalog System ==========");
        System.out.println("Available Book IDs: " + bookCatalog.keySet());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID to search: ");
        int searchId = scanner.nextInt();

        System.out.println("--------------------------------------------");
        if (bookCatalog.containsKey(searchId)) {
            System.out.println("SUCCESS: Book Found!");
            System.out.println("Book ID   : " + searchId);
            System.out.println("Book Title: " + bookCatalog.get(searchId));
        } else {
            System.out.println("ERROR: Book ID " + searchId + " was not found in the library database.");
        }
        System.out.println("--------------------------------------------");
    }
}
