import java.util.Arrays;

class QueueFullException extends Exception {
    public QueueFullException(String s) {
        super(s);
    }
}

class QueueEmptyException extends Exception {
    public QueueEmptyException(String s) {
        super(s);
    }
}

class Queue {
    int[] queue;
    int front, rear, size;

    public Queue(int n) {
        queue = new int[n];
        front = rear = -1;
        size = n;
    }

    public void enqueue(int data) throws QueueFullException {
        if (rear == size - 1) {
            throw new QueueFullException("Queue is full");
        }
        if (front == -1) {
            front++;
        }
        queue[++rear] = data;
    }

    public int dequeue() throws QueueEmptyException {
        if (front == -1) {
            throw new QueueEmptyException("Queue is empty");
        }
        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return data;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class queue1 {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        try {
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);
            q.enqueue(6);
        } catch (QueueFullException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
        } catch (QueueEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
