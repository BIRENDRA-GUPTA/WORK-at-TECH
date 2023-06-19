import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int time = biru.nextInt();
        if (time < 10){
            System.out.println("Good morning");
        } else if (time < 18){
            System.out.println("Good day");
        }else {
            System.out.println("good evening");
        }
        biru.close();
    }
}
