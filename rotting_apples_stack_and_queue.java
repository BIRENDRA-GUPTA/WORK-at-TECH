import java.util.*;
public class rotting_apples_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns

            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.nextInt(); // Fill the grid
                }
            }

            int minDays = getMinDays(grid);
            System.out.println(minDays);
        }
    }

    private static int getMinDays(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshApples = 0;
        int days = -1;

        // Count fresh apples and add rotten apples to the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshApples++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // Special case: No fresh apples
        if (freshApples == 0) {
            return 0;
        }

        // Perform BFS to rot adjacent fresh apples
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];

                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // Rot the fresh apple
                        queue.offer(new int[]{newRow, newCol});
                        freshApples--;
                    }
                }
            }
            days++;
        }

        return (freshApples == 0) ? days : -1;
    }
}
