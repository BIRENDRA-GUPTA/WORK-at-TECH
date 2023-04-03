import java.util.Scanner;
public class array_sorted {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		int t = biru.nextInt();
		
		for (int i = 0; i < t; i++){
			int n = biru.nextInt();
			int [] arr = new int[n];
			
			for (int j = 0; j < n; j++){
				arr[j] = biru.nextInt();
			}
			boolean isSorted = true;
			
			for (int j = 0; j < n ; j++){
				if (arr[j] < arr[j - 1]){
					isSorted = false;
					break;
				}
			}
			
			if (isSorted){
				System.out.println("Yes");
				
			} else {
				System.out.println("No");
			}
		}
    }
    
}
