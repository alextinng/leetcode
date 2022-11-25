package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class _169 {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length < 3) return nums[0];
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) {
            if (cnt.containsKey(num)) {
                int newCnt = cnt.get(num) + 1;
                if (newCnt > length / 2) return num;
                cnt.put(num, newCnt);
            } else {
                cnt.put(num, 1);
            }
        }

        return 0;
    }
}
