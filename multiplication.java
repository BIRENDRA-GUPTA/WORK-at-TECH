import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int t  = biru.nextInt();
        int n = biru.nextInt();
        for(int i = 0; i < t; i++){
            for(int j = 1; j<=10; j++){
                System.out.println(n * j +" ");
            }
            System.out.println();
        }
        biru.close();
    }
}
