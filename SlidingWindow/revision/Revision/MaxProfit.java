package SlidingWindow.revision.Revision;

public class MaxProfit {
    static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    private static int maxProfit(int[] prices) {
        int maxSales = 0;
        int left = 0;
        for (int i = left + 1; i < prices.length; i++) {
            if (prices[left] >= prices[i]) {
                left = i;
            } else {
                maxSales = Math.max(maxSales, prices[i] - prices[left]);
            }
        }

        return maxSales;
    }
}
