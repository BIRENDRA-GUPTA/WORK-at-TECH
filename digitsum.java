import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int t = biru.nextInt();
        biru.nextLine(); // Consume the remaining newline character

        while (t-- > 0) {
            String number = biru.nextLine();
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Character.getNumericValue(number.charAt(i));
            }
            System.out.println(sum);
        }

        biru.close();
    }
}
