package Solution;

public class MaxProfit {
    //121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public int maxProfit(int[] prices) {

        int min_profit = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int price : prices) {
            if(price < min_profit)
                min_profit = price;

            int profit = price - min_profit;

            if(max_profit < profit)
                max_profit = profit;
        }

        return max_profit;
    }
}
