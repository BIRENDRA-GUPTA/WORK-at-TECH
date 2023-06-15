import java.util.HashSet;

public class key_pair_array {
    boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int target = x - arr[i];
            if (set.contains(target)) {
                return true;
            }
            set.add(arr[i]);
        }

        return false;
}
}
