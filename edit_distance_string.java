public class edit_distance_string {
    public int editDistance(String s, String t) {
        // Code here
        int m=s.length();
        int n=t.length();
        int d[][]=new int[m+1][n+1];
        for(int i=0 ; i<=n ; i++)
        {
            d[0][i]=i;
        }
        for(int i=0 ; i<=m ; i++)
        {
            d[i][0]=i;
        }
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))d[i][j]=d[i-1][j-1];
                else
                d[i][j]=1+Integer.min(d[i-1][j-1],Integer.min(d[i][j-1],d[i-1][j]));
            }
        }
        return d[m][n];
}
}
