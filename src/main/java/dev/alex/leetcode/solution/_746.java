package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _746 {
    public int minCostClimbingStairs(int[] cost) {
        /*
            dp[i]表示到达第i个台阶的最小花费

            example:
                cost = [1,100,1,1,1,100,1,1,100,1]
                dp[0] = 0
                dp[1] = 0
                dp[2] = Math.min(dp[1] + 100, dp[0] + 1)
         */
        int[] dp = new int[cost.length + 1];

        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 2] + dp[i - 2]);

            System.out.println("dp: " + Arrays.toString(dp));
        }

        return dp[cost.length];
    }
}
