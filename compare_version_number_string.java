import java.util.*;
public class compare_version_number_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            String v1 = sc.next();
            String v2 = sc.next();
            
            String[] arr1 = v1.split("\\.");
            String[] arr2 = v2.split("\\.");
            
            int n = Math.max(arr1.length, arr2.length);
            for (int i = 0; i < n; i++) {
                int num1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
                int num2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
                
                if (num1 < num2) {
                    System.out.println("-1");
                    break;
                } else if (num1 > num2) {
                    System.out.println("1");
                    break;
                } else if (i == n-1) {
                    System.out.println("0");
                }
            }
        }
        sc.close();   
    }
}
