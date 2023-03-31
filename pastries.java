import java.util.Scanner;
public class pastries {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        
        // Read the number of pastries and customers
        int n = biru.nextInt();
        int q = biru.nextInt();
        
        // Serve each customer one by one
        for (int i = 0; i < q; i++) {
            int p = biru.nextInt(); // number of pastries the customer wants
            
            if (n >= p) {
                System.out.println("Enjoy your dessert!");
                n -= p; // reduce the number of pastries left
            } else {
                System.out.println("Sorry, we are all out!");
            }
        }
        
        biru.close();
    }
}
