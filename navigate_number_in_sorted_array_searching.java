import java.util.Scanner;
public class navigate_number_in_sorted_array_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = countNegativeNumbers(arr);
            System.out.println(count);
        }
        sc.close();
    }

    public static int countNegativeNumbers(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid;
    }
}
