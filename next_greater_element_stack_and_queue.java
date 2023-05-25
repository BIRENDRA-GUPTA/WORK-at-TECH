import java.util.*;
import java.util.Stack;
public class next_greater_element_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // length of the array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // elements of the array
            }

            int[] result = findNextGreaterNumber(arr);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[] findNextGreaterNumber(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>(); // stack to store indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return result;
    }
}
