package dev.alex.leetcode.solution;

public class _9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            char[] digits = Integer.toString(x).toCharArray();
            for (int i = 0, j = digits.length - i - 1; j - i >= 1; i++, j--) {
                if (digits[i] != digits[j]) {
                    return false;
                }
            }

            return true;
        }
    }
}
