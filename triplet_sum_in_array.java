import java.util.Arrays;

public class triplet_sum_in_array {
     public boolean find3Numbers(int[] arr, int n, int X) {
        Arrays.sort(arr); // Sort the array in ascending order
        
        // Fix the first element of the triplet and use two-pointer approach for the remaining elements
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if (sum == X) {
                    // Triplet found
                    return true;
                } else if (sum < X) {
                    // Sum is smaller than X, move the left pointer to increase the sum
                    left++;
                } else {
                    // Sum is larger than X, move the right pointer to decrease the sum
                    right--;
                }
            }
        }
        
        // No triplet found
        return false;
    }
}
