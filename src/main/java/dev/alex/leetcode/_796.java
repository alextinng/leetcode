package dev.alex.leetcode;

public class _796 {
    private String rotate(String str) {
        return str.substring(1) + str.charAt(0);
    }

    public boolean answer(String s, String goal) {
        if (s.length() != goal.length()) {
            // fail fast
            return false;
        }

        if (s.length() == 1 && ! s.equals(goal)) {
            // fail fast
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }

        for (int i = 0; i < s.length(); i ++) {
            String rotateStr = rotate(s);
            if (goal.equals(rotateStr)) {
                return true;
            } else {
                System.out.println("rotate " + s + " ==> " + rotateStr);
                s = rotateStr;
            }
        }

        return false;
    }
}
