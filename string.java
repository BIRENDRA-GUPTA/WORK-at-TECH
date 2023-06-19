import java.util.Scanner;
public class string {
    public static void main(String[] args) {
System.out.println("which people voting");
Scanner biru = new Scanner(System.in);
int age = biru.nextInt();
int agenot = biru.nextInt();
if (agenot >= age){
    System.out.println("ha vote denga");
}else{
    System.out.println("vote nhi dega");
}
biru.close();
}

    }

