import java.util.*;
public class maximum_sub_array_sum_two_ponter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println(maximumSubarraySum(arr, k));
    }
  }

  private static int maximumSubarraySum(int[] arr, int k) {
    int n = arr.length;

    // Kadane's algorithm
    int maxSoFar = arr[0];
    int maxEndingHere = arr[0];
    for (int i = 1; i < n; i++) {
      maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    // Find the maximum subarray sum of size k
    int maxSubarraySum = 0;
    for (int i = 0; i < n - k + 1; i++) {
      maxSubarraySum = Math.max(maxSubarraySum, maxEndingHere - arr[i]);
    }

    return maxSubarraySum;
    }
}
