public class sum_of_two_large_number{
public static void main(String[] args) {
        String X = "2500";
        String Y = "23";
        String sum = findSum(X, Y);
        System.out.println(sum);
    }

    public static String findSum(String X, String Y) {
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        int sum = x + y;
        String sumString = String.valueOf(sum);
        return sumString.replaceFirst("^0+(?!$)", "");
    }
}