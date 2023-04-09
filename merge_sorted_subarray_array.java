import java.util.*;
public class merge_sorted_subarray_array {
    public static void merge(int[] arr, int endIndex) {
        int[] mergedArr = new int[arr.length];
        int i = 0, j = endIndex + 1, k = 0;
        while (i <= endIndex && j < arr.length) {
            if (arr[i] < arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }
        while (i <= endIndex) {
            mergedArr[k++] = arr[i++];
        }
        while (j < arr.length) {
            mergedArr[k++] = arr[j++];
        }
        for (i = 0; i < arr.length; i++) {
            arr[i] = mergedArr[i];
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int endIndex = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            merge(arr, endIndex);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    }

