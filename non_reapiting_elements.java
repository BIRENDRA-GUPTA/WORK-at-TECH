import java.util.*;
public class non_reapiting_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = findNonRepeatingElement(arr);
            System.out.println(result);
        }
    }

    public static int findNonRepeatingElement(int[] arr) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 0) {
                if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (arr[mid] != arr[mid - 1]) {
                    return arr[mid];
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
