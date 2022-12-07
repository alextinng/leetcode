package dev.alex.leetcode.solution;

public class _392 {
    public boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int off = 0;
        for (int i = 0; i < sl; i++) {
            while (off < tl && t.charAt(off) != s.charAt(i)) {
                // find s[i] in t
                off++;
            }
            if (off >= tl) return false;
            System.out.printf("cur of s: %d, cur of t: %d%n", i, off);
            off++;
        }

        return true;
    }
}
