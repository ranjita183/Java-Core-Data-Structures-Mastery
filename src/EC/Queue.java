package EC;

import java.util.ArrayList;

/**
 * ============================================================================
 * CLASS: Queue
 * ============================================================================
 * Description:
 *   Custom implementation of a Queue Data Structure using an ArrayList backend.
 * 
 * Inter-connectivity:
 *   Queue (Data Structure implementation)
 *     ^
 *     |-- QueueUser (Demonstrates enqueue, dequeue, peek operations)
 * 
 * Key Data Structure Principles:
 *   - FIFO (First-In, First-Out): The first element enqueued is the first element dequeued.
 *   - Operations: enqueue(data), dequeue(), peek(), isEmpty()
 * ============================================================================
 */
public class Queue {
    // Internal storage using dynamic ArrayList
    private ArrayList<Integer> list = new ArrayList<>();

    /**
     * Checks if the queue contains no elements.
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Inserts an element at the rear of the queue (Enqueue).
     * @param data Integer element to insert
     */
    public void enqueue(int data) {
        list.add(data);
        System.out.println("Enqueued: " + data);
    }

    /**
     * Removes and returns the front element of the queue (Dequeue).
     * @return Front element integer, or -1 if queue is empty
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty.");
            return -1;
        }
        return list.remove(0);
    }

    /**
     * Retrieves the front element of the queue without removing it.
     * @return Front element integer, or -1 if queue is empty
     */
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(0);
    }

    /**
     * Returns the current size of the queue.
     * @return Number of elements in queue
     */
    public int size() {
        return list.size();
    }
}
