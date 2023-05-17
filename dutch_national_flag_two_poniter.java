import java.util.*;
public class dutch_national_flag_two_poniter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int i = 0;
            int j = 0;
            int k = n - 1;

            while (i <= j && j <= k) {
                if (a[i] == 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j++;
                } else if (a[j] == 2) {
                    int temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                    j--;
                    k--;
                } else {
                    j++;
                }
            }

            for (int element : a) {
                System.out.print(element + " ");
            }

            System.out.println();
        }
    }
}
