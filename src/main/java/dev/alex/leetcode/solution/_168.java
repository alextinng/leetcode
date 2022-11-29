package dev.alex.leetcode.solution;

import java.util.Stack;

public class _168 {
    public String convertToTitle(int columnNumber) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int mod = (columnNumber - 1) % 26;
            stack.push((char) (mod + 'A'));

            columnNumber = (columnNumber - 1) / 26;
        }

        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
