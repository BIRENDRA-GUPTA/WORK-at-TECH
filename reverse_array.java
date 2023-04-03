import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
		Scanner biru = new Scanner(System.in);
		int n = biru.nextInt();
		
		int [] arr = new int[n];
		for (int i = 0; i < n; i++){
			arr[i] = biru.nextInt();
		}
		
		int left = 0;
		int right = n - 1;
		
		while (left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		for (int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
        biru.close();
    }
    
}
