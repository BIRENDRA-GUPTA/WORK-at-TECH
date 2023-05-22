


import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public int size() {
        return queue1.size();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return queue1.peek();
    }

    public void push(int element) {
        int size = size();
        queue2.add(element);
        while (size > 0) {
            queue2.add(queue1.remove());
            size--;
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        queue1.remove();
    }
}

public class implement_stack_using_queues {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());

        stack.push(5);
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());

        stack.push(6);
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());

        stack.push(7);
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());

        stack.pop();
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());

        stack.pop();
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());

        stack.pop();
        System.out.println(stack.top() + " " + stack.isEmpty() + " " + stack.size());
    }
}