class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return;
        }
        top = top.next;
        size--;
    }
}

public class implement_stack_using_linked_list_stack_and_queue {
    public static void main(String[] args) {
        Stack stack = new Stack();

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

