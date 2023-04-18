import java.util.*;
public class prime_upto_n_array {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        // Loop for each test case
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); // Input number for the test case
            // Printing prime numbers between 1 and n
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
