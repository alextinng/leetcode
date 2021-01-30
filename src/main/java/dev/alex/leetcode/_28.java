package dev.alex.leetcode;

public class _28 {
    public int strStr(String haystack, String needle) {
        int result = -1;
        if (needle.length() == 0) {
            return 0;
        } else {
            if (haystack.length() > 0) {
                if (needle.length() > haystack.length()) {
                    return -1;
                } else if (needle.length() == haystack.length()) {
                    return needle.equals(haystack) ? 0 : -1;
                } else {
                    char initial = needle.charAt(0);
                    int length = needle.length();
                    char[] chars = haystack.toCharArray();
                    for (int i = 0; i <= chars.length - length; i++) {
                        if (chars[i] == initial) {
                            if (haystack.substring(i, i + length).equals(needle)) {
                                return i;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}
