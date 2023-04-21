import java.util.*;
public class longest_pallundram_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t > 0) {
            String s = scanner.next(); // input string
            String longestPalindrome = findLongestPalindrome(s);
            System.out.println(longestPalindrome);
            t--;
        }

        scanner.close();
    }

    private static String findLongestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String longestPalindrome = "";
        int maxLength = 0;

        // All substrings of length 1 are palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            longestPalindrome = s.substring(i, i + 1);
            maxLength = 1;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                longestPalindrome = s.substring(i, i + 2);
                maxLength = 2;
            }
        }

        // Check for substrings of length greater than 2
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1; // ending index of substring
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (k > maxLength) {
                        maxLength = k;
                        longestPalindrome = s.substring(i, i + k);
                    }
                }
            }
        }

        return longestPalindrome;
    }
}
