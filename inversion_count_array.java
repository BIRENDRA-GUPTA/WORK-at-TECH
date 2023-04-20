import java.util.*;
public class inversion_count_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // length of the array
            int[] arr = new int[n]; // array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int inversionCount = countInversions(arr); // calculate inversion count
            System.out.println(inversionCount); // print the inversion count
        }
        sc.close();
    }

    public static int countInversions(int[] arr) {
        int n = arr.length;
        int inversionCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) { // check for inversion
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    

    }
}
