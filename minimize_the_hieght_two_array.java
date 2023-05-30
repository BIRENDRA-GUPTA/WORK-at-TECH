import java.util.Arrays;

public class minimize_the_hieght_two_array {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr); // Sort the array to get the minimum and maximum elements

        int minDiff = arr[n - 1] - arr[0]; // Initialize the minimum difference with the difference between the largest and smallest elements

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        // Iterate from the second element to the second-to-last element
        for (int i = 1; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            // Check if the operations result in valid heights (non-negative)
            if (subtract >= smallest || add <= largest) {
                if (subtract >= smallest)
                    smallest = subtract;
                if (add <= largest)
                    largest = add;
            } else {
                continue;
            }

            int diff = largest - smallest;
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
