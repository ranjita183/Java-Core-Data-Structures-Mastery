package EC;

/**
 * ============================================================================
 * CLASS: constructor_chaining
 * ============================================================================
 * Description:
 *   Demonstrates Constructor Chaining within the same class using `this(...)`.
 * 
 * Key Concept:
 *   - Constructor Chaining allows one constructor to invoke another constructor
 *     in the same class, enabling code reuse and organized initialization.
 *   - Calling `this('A')` inside the default constructor delegates execution first.
 * ============================================================================
 */
public class constructor_chaining {
    private static String institutionName = "Alva's Education Foundation";

    /**
     * Default Constructor
     * Chains to the single-char parameterized constructor via `this('A')`
     */
    public constructor_chaining() {
        this('A'); // Invokes overloaded constructor
        System.out.println("Default Constructor Executed: Welcome to " + institutionName);
    }

    /**
     * Parameterized Constructor accepting a char section
     * @param section Section code
     */
    public constructor_chaining(char section) {
        System.out.println("Parameterized Constructor Executed: Section assigned -> " + section);
    }

    public static void main(String[] args) {
        System.out.println("========== Constructor Chaining Demo ==========");
        // Triggers the constructor chain: default -> char constructor -> returns to default
        constructor_chaining demo = new constructor_chaining();
    }
}
