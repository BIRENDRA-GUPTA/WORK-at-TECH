import java.util.Scanner;
public class percentagemarks {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < n; i++) {
            int marks = biru.nextInt();
            totalMarks += marks;
        }
        double percentage = ((double) totalMarks / (n*80)) * 100;
        System.out.printf("%.2f%%", percentage);

        biru.close();
	}
    }

