package dev.alex.leetcode.solution;

public class _121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int length = prices.length;
        int[] dp = new int[length];
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];
            if (i < 1) dp[i] = 0;
            System.out.println("min price: " + minPrice + ", current: " + prices[i]);
            dp[i] = prices[i] - minPrice;
            if (dp[i] > maxProfit) maxProfit = dp[i];
        }

        return maxProfit;
    }
}
