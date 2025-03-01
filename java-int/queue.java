import java.util.ArrayDeque;
import java.util.Deque;

public class queue {
    private Deque<Object> deque;
    private int maxSize;

    public queue(int maxSize) {
        this.maxSize = maxSize;
        deque = new ArrayDeque<>(maxSize);
    }

    public void enqueue(Object obj) throws QueueFullException {
        if (deque.size() == maxSize) {
            throw new QueueFullException("Queue is full");
        }
        deque.addLast(obj);
    }

    public Object dequeue() throws QueueEmptyException {
        if (deque.isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return deque.removeFirst();
    }

    public static void main(String[] args) {
        queue queue = new queue(5);

        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        } catch (QueueFullException e) {
            System.out.println("Error adding to queue: " + e.getMessage());
        } catch (QueueEmptyException e) {
            System.out.println("Error removing from queue: " + e.getMessage());
        }
    }
}

class QueueFullException extends Exception {
    public QueueFullException(String message) {
        super(message);
    }
}

class QueueEmptyException extends Exception {
    public QueueEmptyException(String message) {
        super(message);
    }
}