import java.util.*;
public class three_sum_two_pointer {
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
            
            // find triplets
            List<List<Integer>> triplets = findTriplets(arr);
            
            // output number of triplets
            System.out.println(triplets.size());
            
            // output each triplet
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
            }
        }
    }
    
    public static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) { // skip duplicates
                int lo = i + 1, hi = nums.length - 1, sum = -nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        triplets.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++; // skip duplicates
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--; // skip duplicates
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        
        return triplets; 
    }
}
