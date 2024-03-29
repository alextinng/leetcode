package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _198 {
    public int rob(int[] nums) {
        return solution3(nums);
    }

    private int solution1(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length + 2];

        for (int i = nums.length - 1; i >= 0; i--) {
            int max = 0;
            for (int idx = i + 2; idx < dp.length; idx++) {
                max = Math.max(max, dp[idx]);
            }
            dp[i] = nums[i] + max;
            result = Math.max(result, dp[i]);
        }

        return result;
    }

    private int solution2(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length + 2];
        int[] maxArr = new int[nums.length + 2];

        for (int i = nums.length - 1; i >= 0; i--) {
            dp[i] = nums[i] + maxArr[i + 2];
            maxArr[i] = Math.max(dp[i], maxArr[i + 1]);
            result = Math.max(result, dp[i]);

            System.out.println("dp: " + Arrays.toString(dp));
            System.out.println("maxArr: " + Arrays.toString(maxArr));
        }

        return result;
    }

    private int solution3(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
