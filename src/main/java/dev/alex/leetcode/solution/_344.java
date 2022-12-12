package dev.alex.leetcode.solution;

public class _344 {
    public void reverseString(char[] s) {
        int length = s.length;
        int left = 0, right = length - 1;
        while (left < right) {
            char t = s[left];
            s[left] = s[right];
            s[right] = t;

            left++;
            right--;
        }
    }
}
