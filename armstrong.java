import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (isArmstrong(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }

    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum == n;  
    }
}
