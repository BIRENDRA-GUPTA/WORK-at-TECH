import java.util.ArrayList;
public class subarray_with_given_sum_array {
    ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0;
        int currentSum = 0;

        while (right < n) {
            currentSum += arr[right];

            while (currentSum > sum) {
                currentSum -= arr[left];
                left++;
            }

            if (currentSum == sum) {
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }

            right++;
        }

        result.add(-1);
        return result;
}
}
