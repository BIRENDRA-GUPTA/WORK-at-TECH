import java.util.*;
public class most_significant_bit_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // input number
            int powerOfTwo = 1;
            while (powerOfTwo <= n) {
                powerOfTwo <<= 1; // left shift to get next power of two
            }
            System.out.println(powerOfTwo >> 1); // right shift to get previous power of two
        }
    }
}
