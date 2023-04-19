import java.util.*;
public class kth_largest_element_array {
    public static int findKthLargest(int[] nums, int k) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int pivotIndex = partition(nums, left, right);
        if (pivotIndex == k - 1) {
            return nums[pivotIndex];
        } else if (pivotIndex < k - 1) {
            left = pivotIndex + 1;
        } else {
            right = pivotIndex - 1;
        }
    }
    return -1; // Return -1 if k is out of range
}

// Helper function to partition the list around a pivot
public static int partition(int[] nums, int left, int right) {
    int pivot = nums[right];
    int i = left - 1;

    for (int j = left; j < right; j++) {
        if (nums[j] >= pivot) {
            i++;
            swap(nums, i, j);
        }
    }

    swap(nums, i + 1, right);
    return i + 1;
}

// Helper function to swap two elements in the list
public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Number of test cases

    while (t > 0) {
        int n = sc.nextInt(); // Length of the list
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); // Elements of the list
        }
        int k = sc.nextInt(); // kth largest element to be found

        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);

        t--;
    }

}
}
