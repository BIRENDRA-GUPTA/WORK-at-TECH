import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class StackWithMin {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public StackWithMin() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int popped = stack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class implement_min_stack_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            StackWithMin stack = new StackWithMin();
            StringBuilder result = new StringBuilder();

            while (n-- > 0) {
                String operation = scanner.next();
                if (operation.equals("push")) {
                    int x = scanner.nextInt();
                    stack.push(x);
                } else if (operation.equals("pop")) {
                    stack.pop();
                } else if (operation.equals("top")) {
                    result.append(stack.top()).append(" ");
                } else if (operation.equals("getMin")) {
                    result.append(stack.getMin()).append(" ");
                }
            }

            System.out.println(result);
        }
    }
}