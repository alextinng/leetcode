package dev.alex.leetcode.solution;

public class _58 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int off = chars.length - 1;
        while(off >= 0 && ' ' == chars[off]) {
            off -= 1;
        }

        int end = off;
        while(off >= 0 && ' ' != chars[off]) {
            off -= 1;
        }
        int start = off;

        return end - start;
    }
}
