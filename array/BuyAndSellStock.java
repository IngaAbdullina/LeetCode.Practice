package array;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 *
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 */
public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {5, 3, 1, 4, 9, 6};  // 8
//        int[] prices = {7, 1, 5, 3, 6, 4};    // 7
//        int[] prices = {1, 2, 3, 4, 5};   // 4
//        int[] prices = {7, 6, 4, 3, 1};   // 0
        int profit = maxProfit(prices);
        System.out.println("The maximum profit you can achieve is " + profit);
    }

    private static int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
