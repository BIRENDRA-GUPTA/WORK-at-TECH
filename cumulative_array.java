import java.util.Scanner;
public class cumulative_array {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);

        // read the number of test cases
        int t = biru.nextInt();

        for (int i = 0; i < t; i++) {
            // read the input array
            int n = biru.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = biru.nextInt();
            }

            // calculate the cumulative sum
            int[] res = new int[n];
            res[0] = arr[0];
            for (int j = 1; j < n; j++) {
                res[j] = res[j-1] + arr[j];
            }

            // output the result
            for (int j = 0; j < n; j++) {
                System.out.print(res[j] + " ");
            }
            System.out.println();
        }

        biru.close();
    }
}
