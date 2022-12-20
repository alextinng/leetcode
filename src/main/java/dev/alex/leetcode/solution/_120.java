package dev.alex.leetcode.solution;

import java.util.Arrays;
import java.util.List;

public class _120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        /*
            row 0: 2
            row 1: 3 4
            row 2: 6 5 7
            row 3: 4 1 8 3

            dp[0][0] = 2 + Math.min(dp[1][0], dp[1][1])
            dp[1][0] = 3 + Math.min(dp[2][0], dp[2][1])
            dp[2][0] = 2 + Math.min(dp[3][0], dp[3][1])
            dp[3][0] = 4 + Math.min(dp[4][0], dp[4][1])
            dp[3][1] = 1

            dp[i][j] = triangle[i][j] + Math.min(dp[i+1][j], dp[i+1][j+1])
         */
        int rowCnt = triangle.size();
        int[][] dp = new int[rowCnt + 1][rowCnt + 1];
        for (int i = rowCnt - 1; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            int columnCnt = row.size();
            for (int j = 0; j < columnCnt; j++) {
                dp[i][j] = row.get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
            System.out.println("dp: " + Arrays.deepToString(dp));
        }

        return dp[0][0];
    }
}
