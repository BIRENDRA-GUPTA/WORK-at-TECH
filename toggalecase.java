import java.util.Scanner;
public class toggalecase {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		int T = biru.nextInt();
		biru.nextInt();
		
		for (int i = 0; i < T; i++);
		String s = biru.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		for(int j = 0; j < s.length(); j++){
			char c = s.charAt(j);
			
			if (Character.isUpperCase(c)){
				
				result.append(Character.toLowerCase(c));
				
			}else{
				result.append(Character.toUpperCase(c));
			}
		}
		
		System.out.println(result);
        biru.close();
    }
}
