package EC;

import java.util.ArrayList;

/**
 * ============================================================================
 * CLASS: Stack
 * ============================================================================
 * Description:
 *   Custom implementation of a Stack Data Structure using an ArrayList backend.
 * 
 * Inter-connectivity:
 *   Stack (Data Structure implementation)
 *     ^
 *     |-- StackUser (Demonstrates push, pop, peek operations)
 * 
 * Key Data Structure Principles:
 *   - LIFO (Last-In, First-Out): The last element pushed is the first element popped.
 *   - Operations: push(data), pop(), peek(), isEmpty()
 * ============================================================================
 */
public class Stack {
    // Internal storage using dynamic ArrayList
    private ArrayList<Integer> list = new ArrayList<>();

    /**
     * Checks if the stack contains no elements.
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Pushes an integer onto the top of the stack.
     * @param data Integer element to push
     */
    public void push(int data) {
        list.add(data);
        System.out.println("Pushed: " + data);
    }

    /**
     * Removes and returns the top element of the stack.
     * @return Top element integer, or -1 if stack is empty
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    /**
     * Retrieves the top element of the stack without removing it.
     * @return Top element integer, or -1 if stack is empty
     */
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    /**
     * Returns the current size of the stack.
     * @return Number of elements in stack
     */
    public int size() {
        return list.size();
    }
}
