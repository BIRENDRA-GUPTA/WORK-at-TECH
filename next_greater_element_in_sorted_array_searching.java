import java.util.Scanner;
public class next_greater_element_in_sorted_array_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int key = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = findNextGreaterElement(arr, key);
            System.out.println(result);
        }
        sc.close();
    }

    public static int findNextGreaterElement(int[] arr, int key) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                result = arr[mid];
                high = mid - 1;
            }
        }
        if (result == -1) {
            result = key;
        }
        return result;
    }
}
