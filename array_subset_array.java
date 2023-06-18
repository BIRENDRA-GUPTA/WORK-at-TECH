import java.util.HashSet;

public class array_subset_array {
     public static String isSubset(int[] a1, int[] a2, int n, int m) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of a1[] to the HashSet
        for (int i = 0; i < n; i++) {
            set.add(a1[i]);
        }

        // Check if each element of a2[] is present in the HashSet
        for (int i = 0; i < m; i++) {
            if (!set.contains(a2[i])) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] a2 = {11, 3, 7, 1, 7};
        int n = a1.length;
        int m = a2.length;

        System.out.println(isSubset(a1, a2, n, m));  // Output: Yes
    }
}
