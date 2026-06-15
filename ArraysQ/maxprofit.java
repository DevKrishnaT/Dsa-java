package ArraysQ;

public class maxprofit {
    static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = max(prices);
        System.out.println(ans);
    }

    private static int max(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
                continue;
            }
            profit = Math.max(price - min, profit);

        }
        return profit;
        
    }
}
