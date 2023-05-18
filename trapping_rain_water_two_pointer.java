import java.util.*;
public class trapping_rain_water_two_pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println(trappedRainWater(arr));
    }
  }

  private static int trappedRainWater(int[] arr) {
    int n = arr.length;

    // Left max array
    int[] leftMax = new int[n];
    leftMax[0] = arr[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
    }

    // Right max array
    int[] rightMax = new int[n];
    rightMax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
    }

    // Water trapped
    int water = 0;
    for (int i = 0; i < n; i++) {
      water += Math.min(leftMax[i], rightMax[i]) - arr[i];
    }

    return water;
    }
}
