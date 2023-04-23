import java.util.*;
public class substring {
    public static int findSubstringIndex(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return -1;
        }

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            boolean found = true;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        sc.nextLine(); // consume the newline after integer input

        while (t > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int index = findSubstringIndex(s1, s2);
            System.out.println(index);

            t--;
        }

        sc.close();
}
}
