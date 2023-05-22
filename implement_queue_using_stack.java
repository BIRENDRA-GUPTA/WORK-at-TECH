import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int front() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? -1 : stack2.peek();
    }

    public int back() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return stack1.isEmpty() ? -1 : stack1.peek();
    }

    public void push(int element) {
        stack1.push(element);
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }
}

public class implement_queue_using_stack {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());

        queue.push(5);
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());

        queue.push(6);
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());

        queue.push(7);
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());

        queue.pop();
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());

        queue.pop();
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());

        queue.pop();
        System.out.println(queue.front() + " " + queue.back() + " " + queue.isEmpty() + " " + queue.size());
    }
}