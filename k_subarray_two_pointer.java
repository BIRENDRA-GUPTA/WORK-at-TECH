import java.util.*;
public class k_subarray_two_pointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] result = subarraySum(a, k);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] subarraySum(int[] a, int k) {
        int n = a.length;
        int[] result = new int[n - k + 1];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        result[0] = sum;
        for (int i = k; i < n; i++) {
            sum += a[i] - a[i - k];
            result[i - k + 1] = sum;
        }
        return result;
    }
}
