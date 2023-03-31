import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();
        for(int i = 0; i<n; i++){
        for(int j = 0; j<=i; j++){
        System.out.print("*");
        }
        System.out.println();
        }
biru.close();
    }
}
