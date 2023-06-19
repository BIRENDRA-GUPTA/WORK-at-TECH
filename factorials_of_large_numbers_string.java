import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class factorials_of_large_numbers_string {
    public static List<Integer> factorial(int N) {
        List<Integer> digits = new ArrayList<>();
        digits.add(1);

        for (int i = 2; i <= N; i++) {
            int carry = 0;

            for (int j = 0; j < digits.size(); j++) {
                int product = digits.get(j) * i + carry;
                digits.set(j, product % 10);
                carry = product / 10;
            }

            while (carry > 0) {
                digits.add(carry % 10);
                carry /= 10;
            }
        }

        Collections.reverse(digits);
        return digits;
    }

    public static void main(String[] args) {
        int N = 5;
        List<Integer> result = factorial(N);
        System.out.println(result);  // Output: [1, 2, 0]

        N = 10;
        result = factorial(N);
        System.out.println(result);  // Output: [3, 6, 2, 8, 8, 0, 0]
    }
}
