import java.util.ArrayDeque;

public class parentheshis_checker_array {
    static boolean ispar(String str)
    {
        // add your code here
         ArrayDeque<Character> s = new ArrayDeque<Character>();
        for(char c : str.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
                s.push(c);
            else
            {
                if(s.isEmpty())
                    return false;
                else if(c == ')' && s.peek() != '(')
                    return false;
                else if(c == '}' && s.peek() != '{')
                    return false;
                else if(c == ']' && s.peek() != '[')
                    return false;
                else
                    s.pop();
            }
        }
        if(s.isEmpty())
            return true;
        return false;
    }
}
