import java.util.*;
public class medium_row_wise_sorted_matrix_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int median = findMedian(matrix, n, m);
            System.out.println(median);
        }
        sc.close();
    }

    private static int findMedian(int[][] matrix, int n, int m) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
            if (matrix[i][m - 1] > max) {
                max = matrix[i][m - 1];
            }
        }
        int desired = (n * m + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0, get = 0;
            for (int i = 0; i < n; i++) {
                get = Arrays.binarySearch(matrix[i], mid);
                if (get < 0) {
                    get = Math.abs(get) - 1;
                } else {
                    while (get < matrix[i].length && matrix[i][get] == mid) {
                        get++;
                    }
                }
                place += get;
            }
            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
}
