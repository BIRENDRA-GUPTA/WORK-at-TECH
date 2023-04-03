import java.util.Scanner;
public class touppercase {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		//int t = biru.nextInt();
		//biru.nextInt();
        //String n = biru.next();
		
		//for(int i = 0; i > n; i++){
			String s = biru.nextLine();
			
			s = s.toUpperCase();
			
			System.out.println(s);
		
			
		biru.close();
    }
}

