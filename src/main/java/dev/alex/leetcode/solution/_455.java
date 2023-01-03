package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; ) {
            if (s[j] >= g[i]) {
                cnt++;
                i++;
            }
            j++;
        }

        return cnt;
    }
}
