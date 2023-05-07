import java.util.*;
public class power_of_two_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // input number
            if (n <= 0) { // handle negative numbers and zero
                System.out.println("0");
                continue;
            }
            boolean isPowerOfTwo = (n & (n - 1)) == 0; // check if n is a power of two
            System.out.println(isPowerOfTwo ? "1" : "0");
        }
    }
}
