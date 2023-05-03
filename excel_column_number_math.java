import java.util.*;
public class excel_column_number_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String column = sc.next();
            int number = findColumnNumber(column);
            System.out.println(number);
        }
        sc.close();
    }

    private static int findColumnNumber(String column) {
        int number = 0;
        for (int i = 0; i < column.length(); i++) {
            char c = column.charAt(i);
            number = number * 26 + (c - 'A' + 1);
        }
        return number;
    }
}
