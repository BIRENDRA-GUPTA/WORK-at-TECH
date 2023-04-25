import java.util.*;
public class substring_four_string {
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
        String concat = s2 + "$" + s1;
        int n = concat.length();
        int[] z = new int[n];
        calculateZArray(concat, z);
        
        for (int i = s2.length() + 1; i < n; i++) {
            if (z[i] == s2.length()) {
                return i - s2.length() - 1;
            }
        }
        
        return -1;
    }

    public static void calculateZArray(String s, int[] z) {
        int n = s.length();
        int l = 0; // left boundary
        int r = 0; // right boundary

        for (int i = 1; i < n; i++) {
            if (i > r) {
                l = i;
                r = i;
                while (r < n && s.charAt(r - l) == s.charAt(r)) {
                    r++;
                }
                z[i] = r - l;
                r--;
            } else {
                int k = i - l;
                if (z[k] < r - i + 1) {
                    z[i] = z[k];
                } else {
                    l = i;
                    while (r < n && s.charAt(r - l) == s.charAt(r)) {
                        r++;
                    }
                    z[i] = r - l;
                    r--;
                }
            }
        }
    }
}
