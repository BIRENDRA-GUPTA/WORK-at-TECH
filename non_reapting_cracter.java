public class non_reapting_cracter {
     public static void main(String[] args) {
        String S = "hello";
        char result = nonrepeatingCharacter(S);
        System.out.println(result);
    }

    public static char nonrepeatingCharacter(String S) {
        int[] count = new int[26];

        // Step 1: Count the occurrences of each character
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            count[ch - 'a']++;
        }

        // Step 2: Find the first non-repeating character
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (count[ch - 'a'] == 1) {
                return ch;
            }
        }

        // Step 3: Return '$' if no non-repeating character is found
        return '$';
    }
}
