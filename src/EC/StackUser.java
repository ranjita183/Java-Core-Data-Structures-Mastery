package EC;

/**
 * ============================================================================
 * CLASS: StackUser
 * ============================================================================
 * Description:
 *   Driver application demonstrating the Stack data structure defined in `Stack.java`.
 * 
 * Inter-connectivity:
 *   StackUser ---> Stack (Instantiates and tests LIFO operations)
 * ============================================================================
 */
public class StackUser {
    public static void main(String[] args) {
        System.out.println("========== Stack Data Structure Demo ==========");
        Stack stack = new Stack();

        // 1. Pushing elements onto the stack
        System.out.println("--- Pushing Elements ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nTop element (peek): " + stack.peek());
        System.out.println("----------------------------------------------");

        // 2. Popping elements from the stack (LIFO order: 30, 20, 10)
        System.out.println("--- Popping Elements (LIFO Order) ---");
        while (!stack.isEmpty()) {
            System.out.println("Peeked: " + stack.peek() + " | Popped: " + stack.pop());
        }

        // 3. Popping from empty stack
        System.out.println("----------------------------------------------");
        System.out.println("Attempting peek on empty stack: " + stack.peek());
    }
}
