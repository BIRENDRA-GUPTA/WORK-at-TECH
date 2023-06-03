public class rotate_array {
    static void reverse(int i,int j,int arr[])
    {
        int temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d = d % n;
        d=n-d;
        reverse(0,n-d-1, arr);
        reverse(n-d,n-1, arr);
        reverse(0,n-1, arr);
        
    }
    
}
