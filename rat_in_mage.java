// import java.util.*;
// public class rat_in_mage {
//     public static void main(String[] args) {
        
//     }
// }
import java.util.Scanner;

class rat_in_mage {
    public static boolean canReachCheese(int[][] maze, int n, int m) {
        // Create a boolean matrix to track visited cells
        boolean[][] visited = new boolean[n][m];

        // Call the recursive function to find the path to the cheese
        return findPath(maze, visited, 0, 0, n, m);
    }

    public static boolean findPath(int[][] maze, boolean[][] visited, int row, int col, int n, int m) {
        // Base cases
        if (row == n - 1 && col == m - 1) {
            // Reached the bottom-right cell (cheese)
            return true;
        }

        if (row >= n || col >= m || maze[row][col] == 0 || visited[row][col]) {
            // Out of bounds or blocked cell or already visited cell
            return false;
        }

        // Mark the current cell as visited
        visited[row][col] = true;

        // Move right
        if (findPath(maze, visited, row, col + 1, n, m)) {
            return true;
        }

        // Move down
        if (findPath(maze, visited, row + 1, col, n, m)) {
            return true;
        }

        // No path found, mark the current cell as unvisited
        visited[row][col] = false;

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns

            int[][] maze = new int[n][m];

            // Input maze
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maze[i][j] = scanner.nextInt();
                }
            }

            // Check if rat can reach the cheese
            boolean canReach = canReachCheese(maze, n, m);

            // Print the result
            System.out.println(canReach ? 1 : 0);
        }
    }
}