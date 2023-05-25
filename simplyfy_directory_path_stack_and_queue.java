import java.util.*;
public class simplyfy_directory_path_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            String path = scanner.next(); // absolute path
            String simplifiedPath = simplifyPath(path);
            System.out.println(simplifiedPath);
        }

        scanner.close();
    }

    public static String simplifyPath(String path) {
        // Split the path into directories based on '/'
        String[] dirs = path.split("/");

        Deque<String> stack = new ArrayDeque<>(); // stack to store directories

        for (String dir : dirs) {
            if (dir.equals(".") || dir.isEmpty()) {
                // Ignore the current directory ('.') or empty directories
                continue;
            } else if (dir.equals("..")) {
                // Go back to the parent directory ('..')
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Add valid directory names to the stack
                stack.push(dir);
            }
        }

        // Construct the simplified path
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
