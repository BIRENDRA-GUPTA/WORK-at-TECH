import java.util.*;
public class max_consecutive_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        // Loop for each test case
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Size of the array
            int[] arr = new int[n]; // Array to store the elements
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int maxConsecutiveOnes = findMaxConsecutiveOnes(arr);
            System.out.println(maxConsecutiveOnes);
        }
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is 1, increment currentConsecutiveOnes
            if (arr[i] == 1) {
                currentConsecutiveOnes++;
            } else {
                // If current element is not 1, update maxConsecutiveOnes if necessary
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
                currentConsecutiveOnes = 0; // Reset currentConsecutiveOnes
            }
        }

        // Update maxConsecutiveOnes again after the loop ends
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);

        return maxConsecutiveOnes;
    }
}
