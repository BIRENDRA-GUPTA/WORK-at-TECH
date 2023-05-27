import java.util.*;
public class largest_rectangle_in_histogram_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] heights = new int[n];
            
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
            }
            
            int maxArea = findLargestRectangle(heights);
            System.out.println(maxArea);
        }
    }
    
    public static int findLargestRectangle(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Deque<Integer> stack = new LinkedList<>();
        
        for (int i = 0; i <= n; i++) {
            // Process the bars in increasing order of height
            int height = (i == n) ? 0 : heights[i];
            
            // If the current bar is shorter than the bar at the top of the stack,
            // calculate the area of the rectangle with the top of the stack as the
            // smallest bar
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int top = stack.pop();
                int width = (stack.isEmpty()) ? i : (i - stack.peek() - 1);
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
            }
            
            // Push the current bar index onto the stack
            stack.push(i);
        }
        
        return maxArea;
    }
}
