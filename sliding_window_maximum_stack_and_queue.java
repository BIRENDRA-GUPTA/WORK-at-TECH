import java.util.*;
public class sliding_window_maximum_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int k = scanner.nextInt();
            
            int[] result = findMaxElements(arr, k);
            
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[] findMaxElements(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int resultIndex = 0;
        
        // Process the first k elements separately
        for (int i = 0; i < k; i++) {
            // Remove all elements smaller than the current element
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        
        // Process the remaining elements
        for (int i = k; i < n; i++) {
            result[resultIndex++] = arr[deque.peek()];
            
            // Remove elements outside the current window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.removeFirst();
            }
            
            // Remove all elements smaller than the current element
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        
        // Add the maximum element of the last window
        result[resultIndex] = arr[deque.peek()];
        
        return result;
    }
}
