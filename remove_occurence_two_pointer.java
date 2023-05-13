import java.util.*;
public class remove_occurence_two_pointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int remainingSize = removeElements(arr, k);
            System.out.println(remainingSize);
        }
    }

    public static int removeElements(int[] arr, int k) {
        int n = arr.length;
        int remainingSize = n;
        int i = 0;
        while (i < remainingSize) {
            if (arr[i] == k) {
                remainingSize--;
                for (int j = i; j < remainingSize; j++) {
                    arr[j] = arr[j + 1];
                }
            } else {
                i++;
            }
        }
        return remainingSize;
    }
}
