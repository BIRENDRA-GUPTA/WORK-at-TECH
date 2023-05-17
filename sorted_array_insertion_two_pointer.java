import java.util.*;
public class sorted_array_insertion_two_pointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
            }

            ArrayList<Integer> intersection = new ArrayList<>();

            int i = 0;
            int j = 0;

            while (i < n && j < m) {
                if (a[i] == b[j]) {
                    intersection.add(a[i]);
                    i++;
                    j++;
                } else if (a[i] < b[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            for (int element : intersection) {
                System.out.print(element + " ");
            }

            System.out.println();
        }
    }
}
