import java.util.ArrayList;
import java.util.Arrays;

public class reverse_array_in_group_array {
    public static void reverseInGroups(ArrayList<Long> arr, int N, int K) {
        for (int i = 0; i < N; i += K) {
            int left = i;
            int right = Math.min(i + K - 1, N - 1);

            // Reverse the subarray
            while (left < right) {
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
        int N = arr.size();
        int K = 3;
        reverseInGroups(arr, N, K);
        System.out.println("Reversed Array: " + arr);
    }
}
