import java.util.*;
public class anagram_string{
    public static int areAnagrams(int n, int m, String A, String B) {
        // If lengths of A and B are not equal, they cannot be anagrams
        if (n != m) {
            return 0;
        }
        
        // Convert strings to char arrays
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        
        // Sort the char arrays
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        // Compare sorted char arrays
        for (int i = 0; i < n; i++) {
            if (arrA[i] != arrB[i]) {
                return 0;
            }
        }
        
        return 1;
    }

    public static void main(String[] args) {
        int T = 4;
        int[] n = {5, 5, 4, 10};
        int[] m = {5, 4, 4, 10};
        String[] A = {"apple", "learn", "abcd", "workattech"};
        String[] B = {"pplae", "nerd", "dabc", "worktattch"};
        
        for (int i = 0; i < T; i++) {
            System.out.println(areAnagrams(n[i], m[i], A[i], B[i]));
        }
    
}
}