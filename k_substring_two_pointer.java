import java.util.*;
public class k_substring_two_pointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String input = scanner.next();
            int k = scanner.nextInt();

            List<Integer> vowelCounts = countVowelsInSubstrings(input, k);
            for (int count : vowelCounts) {
                System.out.print(count + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static List<Integer> countVowelsInSubstrings(String s, int k) {
        List<Integer> vowelCounts = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            vowelCounts.add(countVowels(substring));
        }

        return vowelCounts;
    }

    private static int countVowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
