import java.util.*;
public class arithematic_sequence_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        // Loop for each test case
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Number of elements in the array
            int[] arr = new int[n]; // Array to store the elements
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            boolean canFormArithmeticSeq = canFormArithmeticSequence(arr);
            System.out.println(canFormArithmeticSeq);
        }
    }

    public static boolean canFormArithmeticSequence(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        int diff = arr[1] - arr[0]; // Calculate the common difference
        for (int i = 2; i < arr.length; i++) {
            // If the difference between consecutive terms is not equal to the common difference, return false
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
