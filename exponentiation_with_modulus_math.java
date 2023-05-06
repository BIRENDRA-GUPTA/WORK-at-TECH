import java.util.*;
public class exponentiation_with_modulus_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int result = 1;
            // calculate (x^y) % z using modular exponentiation
            while (y > 0) {
                if (y % 2 == 1) {
                    result = (result * x) % z;
                }
                x = (x * x) % z;
                y = y / 2;
            }
            System.out.println(result);
        }
    }
}
