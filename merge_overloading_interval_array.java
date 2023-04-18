import java.util.*;
public class merge_overloading_interval_array {
    // Interval class to represent intervals
    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // Function to merge overlapping intervals
    static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // Sort intervals based on their start times
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        List<Interval> result = new ArrayList<>();
        Interval currInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            // If nextInterval's start time is less than or equal to currInterval's end time,
            // merge the intervals by updating currInterval's end time
            if (nextInterval.start <= currInterval.end) {
                currInterval.end = Math.max(currInterval.end, nextInterval.end);
            }
            // If nextInterval's start time is greater than currInterval's end time,
            // add currInterval to the result and update currInterval to be nextInterval
            else {
                result.add(currInterval);
                currInterval = nextInterval;
            }
        }

        // Add the last interval to the result
        result.add(currInterval);

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        // Loop for each test case
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); // Number of intervals for the test case
            List<Interval> intervals = new ArrayList<>();

            // Input intervals for the test case
            for (int i = 0; i < n; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                intervals.add(new Interval(start, end));
            }

            // Merge intervals and print the result
            List<Interval> mergedIntervals = mergeIntervals(intervals);
            System.out.println(mergedIntervals.size());
            for (Interval interval : mergedIntervals) {
                System.out.println(interval.start + " " + interval.end);
            }
        }

        sc.close();

    }
}
