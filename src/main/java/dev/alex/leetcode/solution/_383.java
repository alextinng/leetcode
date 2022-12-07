package dev.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class _383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l1 = ransomNote.length();
        int l2 = magazine.length();
        if (l1 > l2) return false;

        Map<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < l2; i++) {
            char cur = magazine.charAt(i);
            if (dic.containsKey(cur)) dic.put(cur, dic.get(cur) + 1);
            else dic.put(cur, 1);
        }

        for (int i = 0; i < l1; i++) {
            char cur = ransomNote.charAt(i);
            if (!dic.containsKey(cur)) return false;
            int cnt = dic.get(cur);
            if (cnt == 1) dic.remove(cur);
            else dic.put(cur, cnt - 1);
        }

        return true;
    }
}
