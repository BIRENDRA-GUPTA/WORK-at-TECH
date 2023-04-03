// usig this code by main funtion

import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
        Scanner biru = new Scanner(System.in);

			int n = biru.nextInt();
		long factorial = 1;
		for(int i = 1; i<= n; i++){
			factorial *= i;
		}
		System.out.println(factorial);
		
		biru.close();
	}
}



// using this code by method/funtion

// import java.util.Scanner;
// public class factorial{
// 	public static void printFactorial(int n){
// 		int factorial = 1;
// 		for (int i = n; i>=1; i--){
// 			factorial = factorial * i;
// 		}
// 		System.out.println(factorial);
// 		return;
// 	}
// 	public static void main(String[] args) {
// 		Scanner biru = new Scanner(System.in);
// 		int n = biru.nextInt();
// 		printFactorial(n);
// 	}
// }