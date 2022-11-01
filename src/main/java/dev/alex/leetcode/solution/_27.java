package dev.alex.leetcode.solution;

public class _27 {
    public int removeElement(int[] nums, int val) {
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - val != 0) {
                nums[current++] = nums[i];
            }
        }

        return current;
    }
}
