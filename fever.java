import java.util.*;
public class fever {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();
        biru.nextLine();

        ArrayList<String> highTempEmployees = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String inputLine = biru.nextLine();
            String[] inputParts = inputLine.split(" ");

            String employeeName = inputParts[0];
            double temperature = Double.parseDouble(inputParts[1]);
            if(temperature > 98.6){
                highTempEmployees.add(employeeName);
            }
        }
        for (int i =0; i < highTempEmployees.size(); i++){
            System.out.println(highTempEmployees);
            if(i < highTempEmployees.size() - 1){
                System.out.println(". ");
            }
            biru.close();
        }
        }
    }

