import java.util.*;
public class count_and_say_string {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String prev = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prevChar = prev.charAt(0);

            for (int j = 1; j < prev.length(); j++) {
                char currChar = prev.charAt(j);

                if (currChar == prevChar) {
                    count++;
                } else {
                    sb.append(count).append(prevChar);
                    prevChar = currChar;
                    count = 1;
                }
            }

            sb.append(count).append(prevChar);
            prev = sb.toString();
        }

        return prev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Input n
            String result = countAndSay(n); // Calculate nth count-and-say sequence
            System.out.println(result); // Print the result
        }

        scanner.close();
}
}
