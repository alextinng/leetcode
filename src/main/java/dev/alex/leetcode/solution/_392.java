package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _392 {
    public boolean isSubsequence(String s, String t) {
        return solution2(s, t);
    }

    private boolean solution1(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int off = 0;
        for (int i = 0; i < sl; i++) {
            while (off < tl && t.charAt(off) != s.charAt(i)) {
                // find s[i] in t
                off++;
            }
            if (off >= tl) return false;
            System.out.printf("cur of s: %d, cur of t: %d%n", i, off);
            off++;
        }

        return true;
    }

    private boolean solution2(String s, String t) {
        /*
            dp[i][j]表示s中下标为0-(i-1)的子串和t中0-(j-1)的子串相同子序列的长度
            example:
                对于输入：s = "abcde", t = "abfg"
                dp[0][0]=1(a), dp[0][1]=1(a), dp[0][2]=1(a)
                dp[1][1]=2(ab), dp[1][2]=2(ab)
                dp[2][2]=2(ab)
         */
        int length1 = s.length();
        int length2 = t.length();
        int[][] dp = new int[length1 + 1][length2 + 1];
        for (int i = 1; i <= length1; i++) {
            for (int j = i; j <= length2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        System.out.printf("s: %s, t: %s, dp: %s%n", s, t, Arrays.deepToString(dp));
        return dp[length1][length2] == length1;

    }
}
