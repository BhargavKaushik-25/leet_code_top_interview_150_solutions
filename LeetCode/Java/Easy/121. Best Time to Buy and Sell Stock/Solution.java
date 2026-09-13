class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int stock = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int todaysProfit = prices[i] - stock;

            profit = Math.max(profit, todaysProfit);
            stock = Math.min(stock, prices[i]);
        }

        return profit;
    }
}