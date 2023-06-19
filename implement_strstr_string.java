public class implement_strstr_string {
     public static int strstr(String s, String x) {
        int n = s.length();
        int m = x.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != x.charAt(j))
                    break;
            }
            if (j == m)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "Fr";
        int result = strstr(s, x);
        System.out.println(result);  // Output: -1

        s = "GeeksForGeeks";
        x = "For";
        result = strstr(s, x);
        System.out.println(result);  // Output: 5
    }
}
