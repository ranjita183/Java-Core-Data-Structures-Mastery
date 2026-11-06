package EC;

/**
 * ============================================================================
 * CLASS: A
 * ============================================================================
 * Description:
 *   Parent class used to demonstrate Member Access and Variable Shadowing
 *   in Single Level Inheritance with Class B (`B extends A`).
 * 
 * Inter-connectivity:
 *   A (Base Class) <--- B (Derived Class extends A)
 * 
 * Concepts Demonstrated:
 *   - Static Member (`static int a = 10` shared across class hierarchy)
 *   - Instance Member (`int c = 30` unique per object instance)
 * ============================================================================
 */
public class A {
    // Static variable: Belongs to Class A (shared memory)
    public static int a = 10;
    
    // Instance variable: Belongs to each object of Class A
    public int c = 30;
}
