import java.util.Scanner;
public class narcissistic {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		int t = biru.nextInt();
		for(int i = 0; i < t; i++){
			int n = biru.nextInt();
			int num = n;
			int sum = 0;
			int numDigits =(int) Math.log10(n) + 1;
			while (num > 0){
				int digit = num % 10;
				sum += Math.pow(digit,numDigits);
				num /= 10;
			}
			if (sum == n){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}
		biru.close();
    }
}
