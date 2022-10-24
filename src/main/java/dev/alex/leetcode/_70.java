package dev.alex.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _70 {
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        // 1 * c1 + 2 * c2 = n => (n - c1) % 2 == 0

        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                if (cache.containsKey(n)) {
                    return cache.get(n);
                } else {
                    int result = climbStairs(n - 1) + climbStairs(n - 2);
                    cache.put(n, result);

                    return result;
                }
        }
    }
}
