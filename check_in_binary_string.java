public class check_in_binary_string {
    public static int isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '1') {
                return 0; // Found a character other than 0 and 1
            }
        }
        return 1; // All characters are either 0 or 1
    }

    public static void main(String[] args) {
        String str1 = "101";
        int isBinary1 = isBinary(str1);
        System.out.println("Is '" + str1 + "' binary? " + isBinary1);

        String str2 = "75";
        int isBinary2 = isBinary(str2);
        System.out.println("Is '" + str2 + "' binary? " + isBinary2);
    }
}
