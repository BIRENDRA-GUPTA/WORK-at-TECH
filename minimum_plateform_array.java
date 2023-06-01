import java.util.ArrayList;
import java.util.Arrays;

class minimum_plateform_array
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int maxCount = 0;
        ArrayList<Pair> temp = new ArrayList<>();
        Pair[] time = new Pair[n];
        for(int i=0; i<n; i++){
            time[i] = new Pair(arr[i], dep[i]);
        }
        Arrays.sort(time);
        for(int i=0; i<n; i++){
            if(temp.size()!=0){
                boolean isAdded = false;
                for(int j=0; j<temp.size(); j++){
                    if(temp.get(j).dep<time[i].arr){
                        temp.remove(j);
                        temp.add(time[i]);
                        isAdded = true;
                        break;
                    }
                }
                if(!isAdded){
                    temp.add(time[i]);
                }
            }
            else{
                temp.add(time[i]);
            }
            maxCount = Math.max(maxCount, temp.size());
        }
        return maxCount;
    }
    
    static class Pair implements Comparable<Pair>{
        int arr;
        int dep;
        Pair(int arr, int dep){
            this.arr = arr;
            this.dep = dep;
        }
        
        public int compareTo(Pair p){
            return this.arr - p.arr;
        }
    }
    
}
