package dev.alex.leetcode.solution;

public class _557 {
    public String reverseWords(String s) {
        int length = s.length();
        if (length == 1) return s;

        StringBuilder sb = new StringBuilder();
        int slow = 0, fast = 1;
        while (slow < fast) {
            while (fast < length && s.charAt(fast) != ' ') fast++;
            for (int i = fast - 1; i >= slow; i--) {
                sb.append(s.charAt(i));
            }
            if (fast < length)
                sb.append(s.charAt(fast));

            System.out.printf("slow: %d, fast: %d%n", slow, fast);

            slow = fast + 1;
            fast = Math.min(slow + 1, length);
        }

        return sb.toString();
    }
}
