package Solution;

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    //122. Best Time to Buy and Sell Stock II - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
    public static int maxProfit(int[] prices) {
        int profit = 0, n = prices.length;

        for(int i = 1; i < n; i++) {
            if(prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
        }

        return profit;
    }
}
