import java.util.Scanner;
public class maxinmatrics {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int m = biru.nextInt();
        int n = biru.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = biru.nextInt();
            }
        }

        int largest = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println(largest);
        biru.close();
    }
}
