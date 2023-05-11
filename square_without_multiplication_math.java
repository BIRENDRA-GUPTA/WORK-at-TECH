import java.util.*;
public class square_without_multiplication_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int num = scanner.nextInt();
            int square = findSquare(num);
            System.out.println(square);
        }
    }

    private static int findSquare(int num) {
        int square = 0;
        for (int i = 0; i < num; i++) {
            square += num;
        }
        return square;
    }
}
