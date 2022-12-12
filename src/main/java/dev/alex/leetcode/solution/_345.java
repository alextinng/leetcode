package dev.alex.leetcode.solution;

public class _345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int left = 0, right = length - 1;
        while (left < right) {
            if (!isVowel(chars[left])) {
                left++;
            }

            if (!isVowel(chars[right])) {
                right--;
            }

            if (isVowel(chars[left]) && isVowel(chars[right])) {
                char t = chars[left];
                chars[left] = chars[right];
                chars[right] = t;

                left++;
                right--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
