import java.util.*;
public class row_coloumn_zero_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns

            int[][] matrix = new int[n][m];

            // Input the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Set rows and columns to 0 if any cell is 0
            boolean[] rowZero = new boolean[n];
            boolean[] colZero = new boolean[m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        rowZero[i] = true;
                        colZero[j] = true;
                    }
                }
            }

            // Update the matrix with 0s in rows and columns
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (rowZero[i] || colZero[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Print the updated matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
