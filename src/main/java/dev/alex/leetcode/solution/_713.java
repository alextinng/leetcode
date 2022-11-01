package dev.alex.leetcode.solution;

public class _713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;

        if (k <= 1) return 0;

        int len = nums.length;
        int prod = 1;
        int left = 0;

        for (int right = 0; right < len; right++) {
            prod *= nums[right];

            for (; prod >= k & left <= right; left ++) {
                prod /= nums[left];
            }
            System.out.println("begin: " + left + ", end: " + right);
            System.out.println("current count: " + cnt + ", cnt += " + (right - left + 1));

            cnt += (right - left + 1);
        }

        return cnt;
    }
}
