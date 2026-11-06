package EC;

/**
 * ============================================================================
 * CLASS: B
 * ============================================================================
 * Description:
 *   Subclass extending Class A (`B extends A`) to demonstrate access control,
 *   static member inheritance, and instance member accessibility.
 * 
 * Inter-connectivity:
 *   A (Superclass)
 *    └── B (Subclass)
 * 
 * Key Inheritance Rules Demonstrated:
 *   1. Direct static variable access (`a` inherited from A, `b` defined in B).
 *   2. Class name static variable access (`B.a` and `B.b`).
 *   3. Superclass object reference cannot access subclass members (`ob1.d` is invalid).
 *   4. Subclass object reference can access both superclass and subclass members.
 * ============================================================================
 */
public class B extends A {
    public static int b = 20;
    public int d = 40;

    public static void main(String[] args) {
        System.out.println("========== Static Variable Inheritance ==========");
        // Direct access to inherited static variable 'a' and subclass static 'b'
        System.out.println("Static 'a' (from A): " + a);
        System.out.println("Static 'b' (from B): " + b);
        System.out.println("---------------------------------------------");

        // Class-name access to static members
        System.out.println("B.a: " + B.a);
        System.out.println("B.b: " + B.b);
        System.out.println("---------------------------------------------");

        System.out.println("========== Parent Reference Object Access ==========");
        A ob1 = new A();
        System.out.println("Superclass instance 'ob1.c': " + ob1.c);
        // Note: System.out.println(ob1.d); -> Not possible! Parent cannot access Child members.
        System.out.println("---------------------------------------------");

        System.out.println("========== Child Reference Object Access ==========");
        B ob2 = new B();
        System.out.println("Subclass instance accessing parent member 'ob2.c': " + ob2.c);
        System.out.println("Subclass instance accessing child member 'ob2.d' : " + ob2.d);
    }
}
