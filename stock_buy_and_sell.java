import java.util.*;
class Interval {
    int buy;
    int sell;
}

class  stock_buy_and_sell{
    List<Interval> stockBuySell(int[] prices) {
        int n = prices.length;
        List<Interval> result = new ArrayList<>();

        if (n == 1) {
            return result;
        }

        int i = 0;
        while (i < n - 1) {
            // Find local minimum (buy day)
            while (i < n - 1 && prices[i + 1] <= prices[i]) {
                i++;
            }

            if (i == n - 1) {
                break; // No more ascending pairs
            }

            Interval interval = new Interval();
            interval.buy = i++;

            // Find local maximum (sell day)
            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }

            interval.sell = i - 1;
            result.add(interval);
        }

        return result;
    }
}