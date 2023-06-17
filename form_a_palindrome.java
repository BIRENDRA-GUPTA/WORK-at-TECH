public class form_a_palindrome {
     public static int countMin(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        int minInsertions1 = countMin(str1);
        System.out.println("Minimum number of insertions for '" + str1 + "': " + minInsertions1);

        String str2 = "aa";
        int minInsertions2 = countMin(str2);
        System.out.println("Minimum number of insertions for '" + str2 + "': " + minInsertions2);
}
}
