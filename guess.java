import java.util.*;
public class guess {
    public static void main(String[] args) {
       // your code goes here
		/*Scanner biru = new Scanner(System.in);
		int birthday = biru.nextInt();
		
		boolean guessedCorrectly = false;
                  while (!guessedCorrectly) {
              int guess = biru.nextInt();
             if (guess == birthday) {
             System.out.println("Correct Guess");
             guessedCorrectly = true;
          } else {
        System.out.println("Incorrect Guess");
}
}
biru.close();*/
		
		// without using boolean
		Scanner biru = new Scanner(System.in);
        int birthdate = biru.nextInt();
        
        while (biru.hasNext()) {
            int guess = biru.nextInt();
            if (guess == birthdate) {
                System.out.println("Correct Guess");
                break;
            } else {
                System.out.println("Incorrect Guess");
            }
        }
        
        biru.close();
    }
}
