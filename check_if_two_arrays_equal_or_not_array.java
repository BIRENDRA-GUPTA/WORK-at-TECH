import java.util.*;
public class check_if_two_arrays_equal_or_not_array {
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
       // Scanner biru = new Scanner(System.in);
        int array1 [] = {1,5,8,3,9};
        int array2 []  = {5,8,1,9,3};
        System.out.println(array1);
        System.out.println(array2);
         Arrays.sort(A);
        Arrays.sort(B);
        return ( Arrays.equals(A,B) );
    }
}
