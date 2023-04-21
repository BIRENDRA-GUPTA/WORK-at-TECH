import java.util.*;
public class roman_numeral_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t > 0) {
            String s = scanner.next(); // input Roman numeral
            int val = romanToInt(s);
            System.out.println(val);
            t--;
        }

        scanner.close();
    }

    private static int romanToInt(String s) {
        // Create a HashMap to store the Roman numeral symbols and their corresponding values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0; // to keep track of the previous Roman numeral value

        // Traverse the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            // If the current Roman numeral value is less than the previous value,
            // it means subtractive notation is used (e.g. IV = 4, IX = 9)
            if (currentValue < prevValue) {
                result -= currentValue;
            }
            // Otherwise, add the current value to the result
            else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
