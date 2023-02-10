package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int mid, from = 0, end = n - 1;
        while (from < end - 1) {
            mid = from + (end - from) / 2;

            System.out.printf("nums[%d]: %d, nums[%d]: %d, nums[%d]: %d%n", from, nums[from], end, nums[end],
                    mid, nums[mid]);
            if (nums[mid] > mid) {
                end = mid;
            } else {
                from = mid;
            }
        }

        if (nums[from] > from) return from;
        if (nums[end] > end) return end;
        return end + 1;
    }
}
