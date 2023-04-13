import java.util.*;
public class pascal_triangle_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); // row number of Pascal's triangle
            int[] row = getPascalRow(n);
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Function to get the nth row of Pascal's triangle
    public static int[] getPascalRow(int n) {
        int[] row = new int[n];
        row[0] = 1;
        for (int i = 1; i < n; i++) {
            row[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                row[j] = row[j] + row[j - 1];
            }
        }
        return row;
    }
}
