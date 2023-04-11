package dev.alex.leetcode.solution;

public class _219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (0 == k) return false;

        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length && y - x <= k; y++) {
                if (nums[x] == nums[y]) return true;
            }
        }

        return false;
    }
}
