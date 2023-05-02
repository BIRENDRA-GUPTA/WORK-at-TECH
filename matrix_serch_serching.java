import java.util.*;
public class matrix_serch_serching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int key = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println(searchMatrix(matrix, key));
        }
    }

    public static boolean searchMatrix(int[][] matrix, int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int midVal = matrix[mid / m][mid % m];
            if (midVal == key) {
                return true;
            } else if (midVal < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
