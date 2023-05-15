import java.util.*;
public class unique_element_two_pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // size of the array
            int[] arr = new int[n];
            
            // input array elements
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            // remove duplicates
            int len = removeDuplicates(arr);
            
            // output length of resultant array
            System.out.println(len);
        }
    }
    
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
