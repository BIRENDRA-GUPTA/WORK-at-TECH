import java.util.Scanner;
public class gross_salary {
    public static void main(String[] args) {
       // your code goes here
		Scanner biru = new Scanner(System.in);
		int t = biru.nextInt();
		double hra = biru.nextInt() / 100.0;
		double da = biru.nextInt() / 100.0;
		double bonus = biru.nextInt() / 100.0;
		
		
		while (t-- > 0){
			double base = biru.nextDouble();
		double grossSalary = base * (1 + hra + da + bonus);
		System.out.printf("%.2f%n", grossSalary);
	}
		biru.close(); 
    }
}
