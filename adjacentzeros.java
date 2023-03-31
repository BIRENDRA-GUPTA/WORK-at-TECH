import java.util.Scanner;
public class adjacentzeros {
public static void main(String[] args) {
    Scanner biru = new Scanner(System.in);
        int t = biru.nextInt();
        while (t-- > 0) {
            String n = biru.next();
            boolean adjacentZeroes = false;
            for (int i = 1; i < n.length(); i++) {
                if (n.charAt(i) == '0' && n.charAt(i - 1) == '0') {
                    adjacentZeroes = true;
                    break;
                }
            }
            if (adjacentZeroes) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        biru.close();
}
}
