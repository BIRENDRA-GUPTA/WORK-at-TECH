import java.util.*;
public class find_the_mising_number_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                sum += sc.nextInt();
            }
            int missingNumber = n * (n + 1) / 2 - sum;
            System.out.println(missingNumber);
        }
    }
}
