package dev.alex.leetcode.solution;

public class _704 {
    public int search(int[] nums, int target) {
        int from = 0, to = nums.length - 1;
        if (nums[from] == target) return from;
        if (nums[to] == target) return to;

        int mid = from + (to - from) / 2;
        while (nums[mid] != target && to - from > 1) {
            System.out.printf("from: %d, mid: %d, to: %d%n", from, mid, to);
            if (nums[mid] < target) {
                from = mid;
            } else {
                to = mid;
            }
            mid = from + (to - from) / 2;
        }

        if (nums[mid] == target) return mid;
        if (nums[from] == target) return from;
        if (nums[to] == target) return to;

        return -1;
    }
}
