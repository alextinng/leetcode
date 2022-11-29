package dev.alex.leetcode.solution;

public class _171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        int length = columnTitle.length();
        for (int i = length - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            int off = ch - 'A' + 1;
            System.out.println(off);
            result += (off * Math.pow(26, length - 1 - i));
        }

        return result;
    }
}
