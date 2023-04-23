import java.util.*;
public class longest_common_prefix_string {
    public static String findLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            while (!strings[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        sc.nextLine(); // consume the newline after integer input

        while (t > 0) {
            int n = sc.nextInt(); // number of strings in list A
            sc.nextLine(); // consume the newline after integer input

            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = sc.nextLine(); // read the strings
            }

            String longestCommonPrefix = findLongestCommonPrefix(strings);
            System.out.println(longestCommonPrefix);

            t--;
        }

        sc.close();
        
    }
    
}
