import java.util.*;
public class maximum_k_string_two_pointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String input = scanner.next();
            int k = scanner.nextInt();

            int maxVowelCount = findMaxVowelCount(input, k);
            System.out.println(maxVowelCount);
        }

        scanner.close();
    }

    private static int findMaxVowelCount(String s, int k) {
        int maxVowelCount = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            int vowelCount = countVowels(substring);
            maxVowelCount = Math.max(maxVowelCount, vowelCount);
        }

        return maxVowelCount;
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
