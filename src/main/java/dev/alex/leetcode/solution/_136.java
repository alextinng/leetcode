package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i += 2) {
            if (i == length - 1) return nums[i];
            if (nums[i] != nums[i + 1]) return nums[i];
        }

        // 随便返回点啥，根据题目要求，必然会出现符合条件的数字
        return 0;
    }
}
