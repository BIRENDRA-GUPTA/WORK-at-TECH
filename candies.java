import java.util.Scanner;
public class candies{
    public static void main(String[] args) {
        
     Scanner biru= new Scanner(System.in);
        
        // Read the number of friends
        int n = biru.nextInt();
        
        // Read the names of the friends and distribute candies accordingly
        for (int i = 0; i < n; i++) {
            String name = biru.next();
            int numVowels = countVowels(name);
            System.out.println(numVowels);
        }
        
        biru.close();
    }
    
    // Helper method to count the number of vowels in a given string
    private static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}