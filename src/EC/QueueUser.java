package EC;

/**
 * ============================================================================
 * CLASS: QueueUser
 * ============================================================================
 * Description:
 *   Driver application demonstrating the Queue data structure defined in `Queue.java`.
 * 
 * Inter-connectivity:
 *   QueueUser ---> Queue (Instantiates and tests FIFO operations)
 * ============================================================================
 */
public class QueueUser {
    public static void main(String[] args) {
        System.out.println("========== Queue Data Structure Demo ==========");
        Queue queue = new Queue();

        // 1. Enqueuing elements into the queue
        System.out.println("--- Enqueuing Elements ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("\nFront element (peek): " + queue.peek());
        System.out.println("----------------------------------------------");

        // 2. Dequeuing elements from the queue (FIFO order: 10, 20, 30)
        System.out.println("--- Dequeuing Elements (FIFO Order) ---");
        while (!queue.isEmpty()) {
            System.out.println("Front: " + queue.peek() + " | Dequeued: " + queue.dequeue());
        }

        // 3. Dequeuing from empty queue
        System.out.println("----------------------------------------------");
        System.out.println("Attempting peek on empty queue: " + queue.peek());
    }
}
