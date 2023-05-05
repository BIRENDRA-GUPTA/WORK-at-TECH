import java.util.*;
public class greatest_common_divisor_math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int gcd = calculateGCD(a, b);
            System.out.println(gcd);
        }
        
        input.close();
    }
    
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
