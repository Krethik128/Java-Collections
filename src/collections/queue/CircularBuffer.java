package collections.queue;

class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            head = (head + 1) % capacity;
        } else {
            size++;
        }
        buffer[tail] = item;
        tail = (tail + 1) % capacity;
    }

    public Integer dequeue() {
        if (size == 0) {
            return null;
        }
        int item = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return item;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }
        System.out.print("Buffer: [");
        int current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[current]);
            if (i < size - 1) {
                System.out.print(", ");
            }
            current = (current + 1) % capacity;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display();
        buffer.enqueue(4);
        buffer.display();
        System.out.println("Dequeue: " + buffer.dequeue());
        buffer.display();
        buffer.enqueue(5);
        buffer.display();
    }
}
