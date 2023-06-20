public class smallest_positive_array {
     public int missingNumber(int[] arr, int n) {
        // Separate positive and non-positive numbers
        int shift = segregate(arr, n);
        
        // Consider only positive numbers for finding missing number
        int[] positiveArr = new int[n - shift];
        int positiveCount = 0;
        
        for (int i = shift; i < n; i++) {
            positiveArr[positiveCount] = arr[i];
            positiveCount++;
        }
        
        // Mark presence of elements by negating corresponding indices
        markPresence(positiveArr, positiveCount);
        
        // Find the first positive index
        for (int i = 0; i < positiveCount; i++) {
            if (positiveArr[i] > 0) {
                // Return the smallest positive missing number
                return i + 1;
            }
        }
        
        // If all indices are marked, return the next positive number
        return positiveCount + 1;
    }
    
    // Separate positive and non-positive numbers
    private int segregate(int[] arr, int n) {
        int shift = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                // Swap non-positive numbers to the left side
                int temp = arr[i];
                arr[i] = arr[shift];
                arr[shift] = temp;
                
                shift++;
            }
        }
        
        return shift;
    }
    
    // Mark presence of elements by negating corresponding indices
    private void markPresence(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(arr[i]);
            
            if (absVal <= n) {
                arr[absVal - 1] = -Math.abs(arr[absVal - 1]);
            }
        }
    }
}
