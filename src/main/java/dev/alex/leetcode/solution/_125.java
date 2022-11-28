package dev.alex.leetcode.solution;

public class _125 {
    public boolean isPalindrome(String s) {
        return isPalindrome2(s);
    }

    private boolean isPalindrome1(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char aChar = str.charAt(i);
            if (aChar >= '0' && aChar <= '9') sb.append(aChar);
            if (aChar >= 'a' && aChar <= 'z') sb.append((char) (aChar - 32));
            if (aChar >= 'A' && aChar <= 'Z') sb.append(aChar);
        }
        String sn = sb.toString();
        System.out.println("clean str => " + sn);

        return isPalindrome(sn, true);
    }

    private boolean isPalindrome2(String str) {
        int length = str.length();
        StringBuilder sb1, sb2;
        sb1 = new StringBuilder();
        sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(length - 1 - i);
            if (Character.isLetterOrDigit(c1)) sb1.append(Character.toLowerCase(c1));
            if (Character.isLetterOrDigit(c2)) sb2.append(Character.toLowerCase(c2));
        }

        System.out.println("sb1 => " + sb1);
        System.out.println("sb2 => " + sb2);

        return sb1.toString().equals(sb2.toString());
    }

    private boolean isPalindrome(String str, boolean clean) {
        System.out.println("str => " + str);
        int length = str.length();
        // 一个字符或者空白直接返回true
        if (length <= 1) return true;

        return str.charAt(0) == str.charAt(length - 1) && isPalindrome(str.substring(1, length - 1), true);
    }
}
