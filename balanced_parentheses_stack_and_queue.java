import java.util.Scanner;
import java.util.Stack;

public class balanced_parentheses_stack_and_queue {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(x, minStack.isEmpty() ? x : minStack.peek()));
    }

    public int pop() {
        int top = stack.pop();
        minStack.pop();
        return top;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            StackWithMin stackWithMin = new StackWithMin();
            for (int i = 0; i < n; i++) {
                String operation = scanner.next();
                if (operation.equals("push")) {
                    int x = scanner.nextInt();
                    stackWithMin.push(x);
                } else if (operation.equals("pop")) {
                    System.out.print(stackWithMin.pop() + " ");
                } else if (operation.equals("top")) {
                    System.out.print(stackWithMin.pop() + " ");
                } else if (operation.equals("getMin")) {
                    System.out.print(stackWithMin.getMin() + " ");
                }
            }
            System.out.println();
        }
    }
}
