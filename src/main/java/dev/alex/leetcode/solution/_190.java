package dev.alex.leetcode.solution;

public class _190 {
    public int reverseBits(int n) {
        return solution1(n);
    }

    private int solution1(int n) {
        String unsignedString = Integer.toUnsignedString(n, 2);
        unsignedString = String.format("%32s", unsignedString).replace(" ", "0");
        String reversedString = "";
        int length = unsignedString.length();
        for (int i = length - 1; i >= 0; i--) {
            reversedString = reversedString.concat(String.valueOf(unsignedString.charAt(i)));
        }

        return Integer.parseUnsignedInt(reversedString, 2);
    }
}
