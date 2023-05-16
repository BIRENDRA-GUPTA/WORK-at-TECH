import java.util.*;
public class kth_element_two_pointer {
    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        int count = 0;
        int kthElement = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                kthElement = arr1[i];
                i++;
            } else {
                kthElement = arr2[j];
                j++;
            }
            count++;

            if (count == k)
                break;
        }

        while (i < n) {
            kthElement = arr1[i];
            i++;
            count++;

            if (count == k)
                break;
        }

        while (j < m) {
            kthElement = arr2[j];
            j++;
            count++;

            if (count == k)
                break;
        }

        return kthElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // length of array A
            int m = sc.nextInt(); // length of array B
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt(); // elements of array A
            }

            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt(); // elements of array B
            }

            int k = sc.nextInt(); // kth element

            int kthSmallest = findKthElement(arr1, arr2, k);
            System.out.println(kthSmallest);
        }

        sc.close();
}
}
