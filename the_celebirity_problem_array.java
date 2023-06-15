public class the_celebirity_problem_array {
     int celebrity(int M[][], int n)
    {
    	// code here 
    	int count=0;
       for(int i=0;i<n;i++){
           count=0;
           for(int j=0;j<n;j++){
               if(i==j){
                count++;  
               }
               else if(M[i][j]==0 && M[j][i]==1){
                  count++;
               }
               else{
                   break;
               }
           }
           if(count==n){
               return i;
           }
       }
       return -1;
    }
}
