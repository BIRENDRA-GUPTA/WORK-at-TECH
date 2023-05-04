import java.util.*;
public class trailing_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            
            // Count the number of multiples of 5 in the factorial
            for (int i = 5; i <= n; i *= 5) {
                count += n / i;
            }
            
            System.out.println(count);
        }
    }
}
