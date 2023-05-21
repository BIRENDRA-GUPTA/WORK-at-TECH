class Stack {
    private int[] stackArray;
    private int top;
    
    public Stack(int size) {
        stackArray = new int[size];
        top = -1;
    }
    
    public int size() {
        return top + 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[top];
    }
    
    public void push(int element) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = element;
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return;
        }
        top--;
    }
}

public class impelement_stack_using_array_stack_queue {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        
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



