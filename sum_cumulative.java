import java.util.Scanner;
public class sum_cumulative {
    public static void main(String[] args) {
            Scanner biru = new Scanner(System.in);
            int t = biru.nextInt();
            while (t-- > 0) {
                int n = biru.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = biru.nextInt();
                }
                int[] cumSum = new int[n];
                cumSum[0] = arr[0];
                for (int i = 1; i < n; i++) {
                    cumSum[i] = cumSum[i-1] + arr[i];
                }
                for (int i = 0; i < n; i++) {
                    if (cumSum[i] > 0) {
                        System.out.print(cumSum[i] + " ");
                    }
                }
                System.out.println();
    }
    biru.close();
}
}
