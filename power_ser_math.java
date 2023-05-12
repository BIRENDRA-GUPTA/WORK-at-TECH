import java.util.*;
public class power_ser_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            List<List<Integer>> result = generatePowerSet(nums);
            for (List<Integer> subset : result) {
                for (int num : subset) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static List<List<Integer>> generatePowerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int powerSetSize = (int) Math.pow(2, n);
        for (int i = 0; i < powerSetSize; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}
