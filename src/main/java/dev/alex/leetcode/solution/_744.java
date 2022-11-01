package dev.alex.leetcode.solution;

public class _744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }

        return letters[0];
    }
}
