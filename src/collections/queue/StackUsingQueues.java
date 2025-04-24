package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> queueOne = new LinkedList<>();
    private Queue<Integer> queueTwo = new LinkedList<>();

    public void push(int x) {
        queueTwo.add(x);
        while (!queueOne.isEmpty()) {
            queueTwo.add(queueOne.remove());
        }
        Queue<Integer> temp = queueOne;
        queueOne = queueTwo;
        queueTwo = temp;
    }

    public Integer pop() {
        if (queueOne.isEmpty()) {
            return null;
        }
        return queueOne.remove();
    }

    public Integer top() {
        if (queueOne.isEmpty()) {
            return null;
        }
        return queueOne.peek();
    }

    public boolean isEmpty() {
        return queueOne.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}

