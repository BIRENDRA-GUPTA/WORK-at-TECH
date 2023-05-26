import java.util.*;
public class trapping_rain_water_stack_and_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of the array

            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt(); // Fill the array
            }

            int waterVolume = getTrappedWaterVolume(heights);
            System.out.println(waterVolume);
        }
    }

    private static int getTrappedWaterVolume(int[] heights) {
        int n = heights.length;

        int[] leftMax = new int[n]; // Max height to the left of each block
        int[] rightMax = new int[n]; // Max height to the right of each block

        // Calculate the max height to the left of each block
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        // Calculate the max height to the right of each block
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        int waterVolume = 0;

        // Calculate the trapped water volume for each block
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            int trappedWater = minHeight - heights[i];
            waterVolume += trappedWater;
        }

        return waterVolume;
    }
}
