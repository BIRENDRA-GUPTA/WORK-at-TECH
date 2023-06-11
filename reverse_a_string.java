public class reverse_a_string {
    public static String reverseWord(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        
        while (start < end) {
            // Swap characters
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            // Move indices
            start++;
            end--;
        }
        
        return new String(chars);
    }
}
