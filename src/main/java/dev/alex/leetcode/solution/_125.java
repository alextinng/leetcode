package dev.alex.leetcode.solution;

public class _125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char aChar = s.charAt(i);
            if (aChar >= '0' && aChar <= '9') sb.append(aChar);
            if (aChar >= 'a' && aChar <= 'z') sb.append((char) (aChar - 32));
            if (aChar >= 'A' && aChar <= 'Z') sb.append(aChar);
        }
        String sn = sb.toString();
        System.out.println("clean str => " + sn);

        return isPalindrome(sn, true);
    }

    private boolean isPalindrome(String str, boolean clean) {
        System.out.println("str => " + str);
        int length = str.length();
        // 一个字符或者空白直接返回true
        if (length <= 1) return true;

        return str.charAt(0) == str.charAt(length - 1) && isPalindrome(str.substring(1, length - 1), true);
    }
}
