package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _1014 {
    public int maxScoreSightseeingPair(int[] values) {
        /*
            score=values[i] + i + (values[j] - j)
            dp[i]=max(dp0, dp1, dp2...dpi)
            maxScore[i]=dp[i] + (values[j] - j)
         */
        System.out.println("values: " + Arrays.toString(values));
        int maxScore = 0;
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            maxScore = Math.max(maxScore, max + values[i] - i);
            System.out.printf("i: %d, v: %d, maxScore: %d, max: %d%n",
                    i, values[i] - i, maxScore, max);
            max = Math.max(max, values[i] + i);
        }

        return maxScore;
    }
}
