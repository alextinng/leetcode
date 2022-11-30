package dev.alex.leetcode.solution;

public class _191 {
    public int hammingWeight(int n) {
        return solution1(n);
    }

    private int solution1(int n) {
        int count = 0;
        String str = Integer.toUnsignedString(n, 2);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '1') count++;
        }

        return count;
    }
}
