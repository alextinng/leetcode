package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class _567 {
    public boolean checkInclusion(String s1, String s2) {
        int str1Len = s1.length();
        if (str1Len > s2.length()) return false;

        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < str1Len; i++) {
            char c = s1.charAt(i);
            window.putIfAbsent(c, 0);
            window.put(c, window.get(c) + 1);
        }

        int left = 0, right = str1Len;
        int str2Len = s2.length();

        while (right <= str2Len) {
            System.out.println("window: " + s2.substring(left, right));
            if (compare(window, s2, left, right)) {
                return true;
            } else {
                left++;
                right++;
            }
        }

        return false;
    }

    private boolean compare(Map<Character, Integer> window, String str, int left, int right) {
        Map<Character, Integer> dic = new HashMap<>();
        for (int i = left; i < right; i++) {
            char current = str.charAt(i);
            dic.putIfAbsent(current, 0);
            if (!window.containsKey(current)) {
                return false;
            } else {
                dic.put(current, dic.get(current) + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> keys = window.entrySet();
        for (Map.Entry<Character, Integer> key : keys) {
            if (!Objects.equals(key.getValue(), dic.getOrDefault(key.getKey(), 0))) {
                return false;
            }
        }

        return true;
    }
}
