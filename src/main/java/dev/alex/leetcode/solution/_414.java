package dev.alex.leetcode.solution;

import java.util.NavigableSet;
import java.util.TreeSet;

public class _414 {
    public int thirdMax(int[] nums) {
        return solution1(nums);
    }

    private int solution1(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums) {
            sortedSet.add(num);
        }

        System.out.println("sorted set: " + sortedSet);

        if (sortedSet.size() >= 3) {
            sortedSet.pollLast();
            sortedSet.pollLast();
        }

        return sortedSet.last();
    }
}
