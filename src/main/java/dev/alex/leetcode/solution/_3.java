package dev.alex.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class _3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int longestSubString = 0;
        Set<Character> window = new HashSet<>();

        int left = 0, right = 0;
        int strLen = s.length();
        int length = 0;
        while (right < strLen) {
            char cur = s.charAt(right);

            if (!window.contains(cur)) {
                window.add(cur);
                length++;
                right++;
            } else {
                char c = s.charAt(left);
                while (window.contains(c)) {
                    window.remove(c);
                    length--;
                    left++;
                }
            }
            longestSubString = Math.max(longestSubString, length);

            System.out.println("window: " + window);
        }

        return longestSubString;
    }
}
