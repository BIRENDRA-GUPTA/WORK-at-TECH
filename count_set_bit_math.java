import java.util.*;
public class count_set_bit_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // input number
            int count = 0;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
