public class equilibirium_point_array {
    public static int equilibriumPoint(int[] A, int n) {
        // Calculate the total sum of all elements in the array
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += A[i];
        }

        // Initialize the left sum to 0
        int leftSum = 0;

        // Iterate through the array and check for equilibrium point
        for (int i = 0; i < n; i++) {
            // Subtract the current element from the total sum to get the right sum
            int rightSum = totalSum - leftSum - A[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                // Return the index of equilibrium point (1-based index)
                return i + 1;
            }

            // Update the left sum for the next iteration
            leftSum += A[i];
        }

        // No equilibrium point found
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 2, 2};
        int n = A.length;
        int equilibriumIndex = equilibriumPoint(A, n);
        System.out.println("Equilibrium Point: " + equilibriumIndex);
    }
}
