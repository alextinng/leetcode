package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class _202 {
    public boolean isHappy(int n) {
        Map<Integer, Object> cache = new HashMap<>();
        while (true) {
            String str = Integer.toString(n);
            int num = 0;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                num += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
            }
            System.out.println("num => " + num);
            if (num == 1) return true;
            else {
                if (cache.containsKey(num)) {
                    return false;
                } else {
                    cache.put(num, new Object());
                }
            }

            n = num;
        }
    }
}
