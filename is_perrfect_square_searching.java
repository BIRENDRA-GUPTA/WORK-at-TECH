import java.util.*;
public class is_perrfect_square_searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int num = scanner.nextInt();
            boolean isPerfectSquare = isPerfectSquare(num);
            System.out.println(isPerfectSquare);
        }
    }

    // function to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0 || num == 1) {
            return true;
        }
        int left = 1;
        int right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
