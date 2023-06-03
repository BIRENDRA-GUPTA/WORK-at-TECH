import java.util.HashSet;

public class find_triplet_with_zero_sum_array {
    public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        boolean found=false;
        for(int i=0;i<n-1;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int x=-(arr[i]+arr[j]);
                if(hs.contains(x)){
                    return true;
                }else{
                    hs.add(arr[j]);
                }
            }
        }
        return false;
    }
}
