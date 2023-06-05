public class find_missing_and_reapting_array {
    public int[] findTwoElement(int[] arr, int n) {
        int[] result = new int[2];

        // Finding the repeating number
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            if (arr[absValue - 1] > 0)
                arr[absValue - 1] = -arr[absValue - 1];
            else
                result[0] = absValue;
        }

        // Finding the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 2};
        int n = arr.length;
        int[] result = solution.findTwoElement(arr, n);
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}
