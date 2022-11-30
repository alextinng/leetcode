package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _217 {
    public boolean containsDuplicate(int[] nums) {
        return solution2(nums);
    }

    private boolean solution1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }

    private boolean solution2(int[] nums) {
        Map<Integer, Boolean> counter = new HashMap<>();
        for (int num : nums) {
            if (counter.containsKey(num)) return true;
            counter.put(num, true);
        }

        return false;
    }
}
