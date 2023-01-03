package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class _387 {
    public int firstUniqChar(String s) {
        int length = s.length();
        Map<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            dic.putIfAbsent(c, 0);
            dic.put(c, dic.get(c) + 1);
        }

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (dic.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
