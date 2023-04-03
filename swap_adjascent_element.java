import java.util.Scanner;
public class swap_adjascent_element {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		int n = biru.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = biru.nextInt();
		}
		for (int i = 0; i < n-1; i+= 2){
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (int i =0; i< n; i++){
			System.out.print(arr[i] + " ");
		}
    }
}
