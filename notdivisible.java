import java.util.Scanner;
public class notdivisible {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		int T = biru.nextInt();
		
		
		 for (int i = 0; i < T; i++) {
        int n = biru.nextInt();
            for (int j = 1; j <= n; j++) {
                if (j % 3 != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        biru.close();
    }
}
