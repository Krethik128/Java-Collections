package collections.queue;
import java.util.*;

class ReverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return queue;
        }
        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(java.util.Arrays.asList(10, 20, 30));
        System.out.println("Original Queue: " + queue);
        Queue<Integer> reversedQueue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}