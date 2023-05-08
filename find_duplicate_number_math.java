import java.util.*;
public class find_duplicate_number_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of array
            int[] nums = new int[n + 1]; // array of size n+1
            for (int i = 0; i < n + 1; i++) {
                nums[i] = sc.nextInt();
            }
            int x = findDuplicate(nums); // find the duplicate number
            System.out.println(x);
        }
        sc.close();
    }

    private static int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int sum = (n * (n + 1)) / 2; // sum of numbers from 1 to n
        int actualSum = 0;
        for (int i = 0; i < n + 1; i++) {
            actualSum += nums[i];
        }
        return actualSum - sum; // the difference is the duplicate number
    }
}
