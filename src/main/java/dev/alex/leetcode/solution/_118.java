package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 1) {
            result.add(Collections.singletonList(1));
        } else {
            int[][] dp = new int[numRows + 1][numRows + 2];
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= numRows; j++) {
                    if (j == 1 || j == numRows) dp[i][j] = 1;
                    else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }

            for (int i = 1; i <= numRows; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 1; j <= i; j++) {
                    list.add(dp[i][j]);
                }
                result.add(list);
            }
        }

        return result;
    }
}
