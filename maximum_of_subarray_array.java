import java.util.*;
public class maximum_of_subarray_array {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k-1;i++)
            max.add(arr[i]);
        
        int j=k-1,i=0;
        while(j<n)
        {
            max.add(arr[j]);
            ans.add(max.peek());
            max.remove(arr[i]);
            i++;
            j++;
        }
        return ans;
}
}
