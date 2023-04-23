import java.util.*;
public class substring_two_string {
    public static final int PRIME = 101; // prime number for hash calculation

    public static int findSubstringIndex(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return -1;
        }

        int s1Length = s1.length();
        int s2Length = s2.length();
        int s1Hash = 0; // hash value of s1
        int s2Hash = 0; // hash value of s2
        int hashPower = 1; // to store PRIME^(s2Length-1)

        // Calculate the initial hash values of s1 and s2
        for (int i = 0; i < s2Length; i++) {
            s2Hash = (s2Hash * PRIME + s2.charAt(i)) % Integer.MAX_VALUE;
            s1Hash = (s1Hash * PRIME + s1.charAt(i)) % Integer.MAX_VALUE;
            if (i < s2Length - 1) {
                hashPower = (hashPower * PRIME) % Integer.MAX_VALUE;
            }
        }

        // Iterate through s1 and compare hash values with s2
        for (int i = 0; i <= s1Length - s2Length; i++) {
            if (s1Hash == s2Hash) {
                boolean found = true;
                for (int j = 0; j < s2Length; j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
            if (i < s1Length - s2Length) {
                // Update the hash value of s1 for the next iteration
                s1Hash = (PRIME * (s1Hash - s1.charAt(i) * hashPower) + s1.charAt(i + s2Length)) % Integer.MAX_VALUE;
                if (s1Hash < 0) {
                    s1Hash += Integer.MAX_VALUE;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        sc.nextLine(); // consume the newline after integer input

        while (t > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int index = findSubstringIndex(s1, s2);
            System.out.println(index);

            t--;
        }

        sc.close();
    }
}
