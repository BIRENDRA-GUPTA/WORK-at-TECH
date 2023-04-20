import java.util.*;
public class reverse_word_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        sc.nextLine(); // consume the newline character after reading t
        while (t-- > 0) {
            String s = sc.nextLine(); // input string
            String reversed = reverseWords(s); // reverse words in the string
            System.out.println(reversed); // print the reversed string
        }
        sc.close();
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" "); // split the string by spaces to get words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]); // append each word in reverse order
            if (i > 0) {
                sb.append(" "); // add a space between words, except for the last word
            }
        }
        return sb.toString();
    }
}
