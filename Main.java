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

class Queue {
    private int[] data;
    private int front;
    private int rear;

    public Queue(int size) {
        data = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int value) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue is full");
        }
        data[rear++] = value;
    }

    public int dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return data[front++];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == data.length;
    }
}

class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        try {
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60);  // This will throw a QueueFullException
        } catch (QueueFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }
            System.out.println(queue.dequeue());  // This will throw a QueueEmptyException
        } catch (QueueEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
