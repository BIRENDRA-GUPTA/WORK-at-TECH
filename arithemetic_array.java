import java.util.*;
public class arithemetic_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t > 0) {
            int n = sc.nextInt(); // number of elements in the array
            int[] arr = new int[n]; // array to store the elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // input the array elements
            }

            int maxSum = findLargestContiguousSum(arr); // call the function to find the largest contiguous sum
            System.out.println(maxSum); // print the largest contiguous sum
            t--;
        }

        sc.close();
    }

    // Function to find the largest contiguous sum from an array
    public static int findLargestContiguousSum(int[] arr) {
        int maxSum = arr[0]; // initialize maxSum with the first element of the array
        int currentSum = arr[0]; // initialize currentSum with the first element of the array

        // Traverse the array from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the currentSum is negative, start a new subarray from the current element
            // Otherwise, continue adding the current element to the currentSum
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            
            // Update the maxSum with the maximum between maxSum and currentSum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
