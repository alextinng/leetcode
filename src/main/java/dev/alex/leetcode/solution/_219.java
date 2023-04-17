package dev.alex.leetcode.solution;

import java.util.LinkedHashMap;
import java.util.Map;

public class _219 {
    static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private int capacity;

        public FixedSizeLinkedHashMap(int capacity) {
            super();
            this.capacity = capacity;
        }

        public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (0 == k) return false;
        if (k > nums.length) k = nums.length;

        Map<Integer, Object> dict = new FixedSizeLinkedHashMap<>(k);

        for (int i = 0; i < nums.length; i++) {
            if (dict.containsKey(nums[i])) {
                return true;
            } else {
                dict.put(nums[i], 0);

                System.out.println("dict: " + dict.toString());
            }
        }

        return false;
    }
}
