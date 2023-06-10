import java.util.Arrays;

class coin_change_array {
    
    
    long solveMem( int index, int coins[], int target, long dp[][]){
        
        if(target==0){
            return 1;
        }
        
        if(index==0){
            if(target%coins[0]==0){
                return 1;
            }
            return 0;
        }
        
        if(dp[index][target]!=-1){
            return dp[index][target];
        }
        
        //pick
        long pick = 0;
        
        if(coins[index]<=target){
            pick = solveMem(index,coins,target-coins[index],dp);
        }
        
        //not pick
        
        long notPick = solveMem(index-1,coins, target, dp);
        
        
        return dp[index][target]=pick+notPick;
        
        
    }
    
    public long count(int coins[], int n, int sum) {
        // code here.
        long dp[][] = new long[n][sum+1];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        long ans = solveMem(n-1,coins,sum,dp);
        
        return ans;
    }
}

