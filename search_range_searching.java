import java.util.*;
public class search_range_searching {
    public static int[] findRange(int[] arr, int key) {
        int n = arr.length;
        int left = -1, right = -1;
        int start = 0, end = n - 1;

        // Finding the leftmost occurrence of the key
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                left = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Finding the rightmost occurrence of the key
        start = 0;
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                right = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{left, right};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int key = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] result = findRange(arr, key);
            System.out.println(result[0] + " " + result[1]);
        }
        
    }
    
}
