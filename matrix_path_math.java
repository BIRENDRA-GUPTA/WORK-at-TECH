import java.util.*;
public class matrix_path_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // number of rows
            int m = scanner.nextInt(); // number of columns
            int[][] dp = new int[n][m]; // 2D array to store the number of paths
            dp[0][0] = 1; // there is only one way to reach the starting cell
            // fill the first row
            for (int j = 1; j < m; j++) {
                dp[0][j] = dp[0][j-1];
            }
            // fill the first column
            for (int i = 1; i < n; i++) {
                dp[i][0] = dp[i-1][0];
            }
            // fill the remaining cells
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            System.out.println(dp[n-1][m-1]); // print the number of paths to reach the ending cell
        }
    }

}
