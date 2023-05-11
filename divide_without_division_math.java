import java.util.*;
public class divide_without_division_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int quotient = divide(a, b);
            System.out.println(quotient);
        }
    }

    private static int divide(int a, int b) {
        boolean isNegative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int quotient = 0;
        while (a - b >= 0) {
            a -= b;
            quotient++;
        }
        return isNegative ? -quotient : quotient;
    }
}
