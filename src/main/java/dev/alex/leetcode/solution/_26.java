package dev.alex.leetcode.solution;

public class _26 {
    public int removeDuplicates(int[] nums) {
        int current = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[current] != 0) {
                nums[++current] = nums[i];
            }
        }

        return current + 1;
    }
}
