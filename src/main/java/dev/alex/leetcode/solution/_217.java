package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class _217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> counter = new HashMap<>();
        for (int num : nums) {
            if (counter.containsKey(num)) return true;
            counter.put(num, true);
        }

        return false;
    }
}
