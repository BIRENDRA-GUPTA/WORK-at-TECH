import java.util.*;
public class repeat_and_missing_number_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                int index = Math.abs(nums[i]) - 1;
                if (nums[index] > 0) {
                    nums[index] = -nums[index];
                } else {
                    x = Math.abs(nums[i]);
                }
            }
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) {
                    y = i + 1;
                    break;
                }
            }
            System.out.println(x + " " + y);
        }
    }
}
