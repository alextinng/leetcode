package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class _119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        rowIndex += 1;
        if (rowIndex == 1) {
            result.add(1);
        } else {
            int[][] dp = new int[rowIndex + 1][rowIndex + 2];
            for (int i = 1; i <= rowIndex; i++) {
                for (int j = 1; j <= rowIndex; j++) {
                    if (j == 1 || j == rowIndex) dp[i][j] = 1;
                    else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }

            for (int i = rowIndex; i <= rowIndex; i++) {
                for (int j = 1; j <= i; j++) {
                    result.add(dp[i][j]);
                }
            }
        }

        return result;
    }
}
