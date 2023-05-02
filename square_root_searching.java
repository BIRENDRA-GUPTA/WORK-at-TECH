import java.util.*;
public class square_root_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(sqrt(n));
        }
    }

    public static int sqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int start = 1, end = n, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid <= n / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
