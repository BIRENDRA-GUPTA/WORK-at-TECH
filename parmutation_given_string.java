import java.util.ArrayList;
import java.util.Arrays;

public class parmutation_given_string {
    public static ArrayList<String> find_permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        int n = chars.length;
        
        // Sort the characters to ensure lexicographic order
        Arrays.sort(chars);
        
        boolean[] visited = new boolean[n];
        StringBuilder current = new StringBuilder();
        
        backtrack(chars, visited, current, result);
        
        return result;
    }
    
    private static void backtrack(char[] chars, boolean[] visited, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (visited[i] || (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1]))
                continue;
            
            visited[i] = true;
            current.append(chars[i]);
            
            backtrack(chars, visited, current, result);
            
            current.deleteCharAt(current.length() - 1);
            visited[i] = false;
        }
    }
}
