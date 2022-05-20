package dynamicProgramming;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {8, 7, 2, 4, 6, 9, 8, 2, 3};
        int maxProfit = maxProfit(prices);
        System.out.println("The maximum profit you can achieve from this transaction is " + maxProfit);
    }

    private static int maxProfit(int[] prices) {
        int length = prices.length;
        if(length < 2) return 0;

        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            if(prices[i] < prices[i+1]){
                result += prices[i+1] - prices[i];
            }
        }
        return result;
    }
}
