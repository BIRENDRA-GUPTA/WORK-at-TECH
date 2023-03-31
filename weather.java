import java.util.Scanner;
public class weather {
    public static void main(String[] args) {
       Scanner biru = new Scanner(System.in);
       int t = biru.nextInt();
       int temperature = biru.nextInt();
       int humidity = biru.nextInt();

       for (int i = 0; i<t; i++){
       
        if (temperature >= 30 && humidity >= 90){
            System.out.println("Hot and Humid");}
            else if(temperature >= 30 && humidity < 90){
                System.out.println("Hot");}
                else if(temperature <30 && humidity >= 90){
                 System.out.println("Cool and Humid");}
                 else {System.out.println("Cool");}
       }
       biru.close();
    }
}
