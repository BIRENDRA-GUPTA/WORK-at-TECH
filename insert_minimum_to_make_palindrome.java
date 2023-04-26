import java.util.*;
public class insert_minimum_to_make_palindrome {
    
    public static int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Initialize the diagonal with 0s as single characters are already palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // Fill the rest of the dp table in bottom-up manner
        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1]; // The minimum number of insertions at the beginning
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            String s = scanner.next(); // Input string
            int minInsertions = minInsertions(s); // Calculate minimum insertions
            System.out.println(minInsertions); // Print the result
        }

        scanner.close();
    }
}
