import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] fib = new int[n];
            fib[0] = 0;
            if (n > 1) {
                fib[1] = 1;
                for (int i = 2; i < n; i++) {
                    fib[i] = fib[i-1] + fib[i-2];
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(fib[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
