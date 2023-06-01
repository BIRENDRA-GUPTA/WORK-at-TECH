
public class trapping_rain_water_array {
    static int trappingWater(int arr[], int n) {
        int left = 0; // pointer for the left side
        int right = n - 1; // pointer for the right side
        int leftMax = 0; // maximum height on the left side
        int rightMax = 0; // maximum height on the right side
        int water = 0; // total amount of water trapped

        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] > leftMax) {
                    // update the left maximum
                    leftMax = arr[left];
                } else {
                    // calculate the trapped water
                    water += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] > rightMax) {
                    // update the right maximum
                    rightMax = arr[right];
                } else {
                    // calculate the trapped water
                    water += rightMax - arr[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4};
        int n = arr.length;
        System.out.println(trappingWater(arr, n));
    }
}
