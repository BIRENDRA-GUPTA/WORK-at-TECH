import java.util.*;
public class substring_three_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        scanner.nextLine();
        while (t-- > 0) {
            String s1 = scanner.nextLine(); // input s1
            String s2 = scanner.nextLine(); // input s2
            int index = findSubstring(s1, s2); // find index of s2 in s1
            System.out.println(index); // print result
        }
    }

    public static int findSubstring(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] lps = computeLPS(s2);
        int i = 0; // index for s1
        int j = 0; // index for s2

        while (i < n) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                return i - j;
            } else if (i < n && s1.charAt(i) != s2.charAt(j)) {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
        }
        return -1;
    }

    public static int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0; // length of the longest proper prefix that is also a suffix
        int i = 1;
        lps[0] = 0;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }

        return lps;
    }
}
