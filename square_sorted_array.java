import java.util.*;
public class square_sorted_array {
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];

        for (int i = 0; i < n; i++) {
            squares[i] = arr[i] * arr[i]; // Square each element
        }

        Arrays.sort(squares); // Sort the squares array in non-decreasing order

        return squares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of elements in array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Array elements
            }

            int[] squares = sortedSquares(arr); // Get sorted squares of the array

            for (int i = 0; i < n; i++) {
                System.out.print(squares[i] + " "); // Print sorted squares array
            }
            System.out.println();
        }

        scanner.close();
        
    }
}
