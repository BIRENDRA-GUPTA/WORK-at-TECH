import java.util.*;
public class integer_to_roman_numeral_string {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
        // Create a hashmap to store the values and symbols
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        
        // Get the keys (values) in descending order
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        for (int i = keys.length - 1; i >= 0; i--) {
            while (num >= keys[i]) {
                sb.append(map.get(keys[i]));
                num -= keys[i];
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {15, 3610, 20};
        for (int num : nums) {
            System.out.println(intToRoman(num));
        }
    }
}
