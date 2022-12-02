package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class _409 {
    public int longestPalindrome(String s) {
        return solution1(s);
    }

    private int solution1(String s) {
        int result = 0;

        if (Objects.isNull(s) || s.isEmpty()) return 0;

        int length = s.length();
        if (length == 1) return 1;

        Map<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (dic.containsKey(c)) {
                dic.put(c, dic.get(c) + 1);
            } else {
                dic.put(c, 1);
            }
        }

        int n = 0;
        Set<Map.Entry<Character, Integer>> entries = dic.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value % 2 == 0) {
                result += value;
            } else {
                if (value != 1) {
                    result += value - 1;
                }
                n = 1;
            }
        }
        result += n;

        return result;
    }

    private int solution2(String s) {
        int count[] = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
