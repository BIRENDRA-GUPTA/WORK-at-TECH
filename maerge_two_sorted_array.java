import java.util.*;
public class maerge_two_sorted_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // size of array A
            int m = sc.nextInt(); // size of array B
            int[] A = new int[n];
            int[] B = new int[m];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                B[i] = sc.nextInt();
            }
            int[] C = mergeArrays(A, B);
            for (int i = 0; i < n + m; i++) {
                System.out.print(C[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] mergeArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < n) {
            C[k++] = A[i++];
        }

        while (j < m) {
            C[k++] = B[j++];
        }

        return C;
    }
}
