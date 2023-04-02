import java.util.Scanner;
public class sumproduct {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		int t = biru.nextInt();
		for (int i = 0; i < t; i++){
			int n = biru.nextInt();
			int num = n;
			int sum = 0;
			int product = 1;
			while (num > 0){
				int digit = num % 10;
				sum += digit; // add the digit to the sum
				product *= digit;
				num /= 10;
			}
			if(sum * product == n){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		biru.close();
    }
}
