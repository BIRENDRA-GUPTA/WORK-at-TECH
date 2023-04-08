import java.util.*;
public class identical_twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = nums[i];
                if (map.containsKey(num)) {
                    count += map.get(num);
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
