import java.util.Scanner;
public class sentence {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
		String sentence = biru.nextLine().trim();
		biru.close();
		
		int wordCount = 1;

        for (int i = 0; i < sentence.length(); i++) {
            // Increment the word count for each whitespace
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }

        System.out.println(wordCount);
    }
}
