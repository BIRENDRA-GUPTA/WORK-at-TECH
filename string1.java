import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int time = biru.nextInt();
        if (time < 18){
            System.out.println("good day.");
        }else {
            System.out.println("good evening");
        }
        biru.close();
    }
}
