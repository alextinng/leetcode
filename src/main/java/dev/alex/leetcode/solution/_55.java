package dev.alex.leetcode.solution;

public class _55 {
    public boolean canJump(int[] nums) {
        // dp[i]表示从第i个节点出发，能到达的最远位置
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        int maxDistance = nums[0];
        for (int i = 0; i <= maxDistance; i++) {
            dp[i] = nums[i] + i;
            maxDistance = Math.max(maxDistance, dp[i]);

            if (maxDistance >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
