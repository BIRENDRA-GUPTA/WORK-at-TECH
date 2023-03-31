import java.util.*;
public class vowel {
    public static void main(String[] args) {
       Scanner biru = new Scanner(System.in);
       int n = biru.nextInt();
       for(int i = 0; i < n; i++) {
       String name = biru.next();
       int numVowels = countVowels(name);
       System.out.println(numVowels);
    }
    biru.close();
}
private static int countVowels(String s){
    int count = 0;
    for (int i =0; i < s.length(); i++){
        char c =s.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i'  || c == 'o' || c == 'u'){
            count++;
        }
    }
    return count;
}
}