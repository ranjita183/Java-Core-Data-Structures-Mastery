package EC;

/**
 * ============================================================================
 * CLASS: D
 * ============================================================================
 * Description:
 *   Abstract class demonstrating Class Abstraction and Inheritance from Class C.
 * 
 * Inter-connectivity:
 *   C (Concrete Base Class with Array Utilities)
 *    └── D (Abstract Subclass extending C)
 * 
 * Concepts Demonstrated:
 *   - Abstract Class declaration (`abstract public class D extends C`)
 *   - Abstract classes cannot be directly instantiated, but can contain concrete methods
 *   - Concrete methods inside an abstract class
 * ============================================================================
 */
public abstract class D extends C {

    /**
     * Concrete method in abstract class D
     */
    public void printGreeting() {
        System.out.println("Greeting from Abstract Class D (Subclass of C)");
        System.out.println("----------------------------------------------");
    }
}
