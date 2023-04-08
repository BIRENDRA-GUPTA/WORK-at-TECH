import java.util.*;
public class even_number_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                if (hasEvenDigits(num)) {
                    result.add(num);
                }
            }
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean hasEvenDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count % 2 == 0;
      
    }
}
