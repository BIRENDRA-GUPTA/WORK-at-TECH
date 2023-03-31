import java.util.Scanner;
public class squaresum {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        //int t = biru.nextInt();
        // this is comment added
      //  while (t-- > 0) 
      {
            int n = biru.nextInt();
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            System.out.println(sum);
        }
        biru.close();
    }
}
