import java.util.*;
public class implement_insertion_sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of array
            int[] arr = new int[n]; // create an array of size n
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // input array elements
            }
            insertionSort(arr); // sort the array using insertion sort
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " "); // print the sorted array
            }
            System.out.println();
        }
        sc.close();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
