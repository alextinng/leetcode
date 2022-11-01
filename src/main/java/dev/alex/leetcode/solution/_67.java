package dev.alex.leetcode.solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class _67 {
    public String addBinary(String a, String b) {
        Deque<Character> deque = new LinkedList<>();

        int len = Math.max(a.length(), b.length());
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        // 是否进位
        boolean car = false;
        // 10001
        // 00011
        for (int i = 1; i <= len; i++) {
            //calculate and remove last char of a & b
            char left = arr1.length - i > -1 ? arr1[arr1.length - i] : '0';
            char right = arr2.length - i > -1 ? arr2[arr2.length - i] : '0';

            if (left == right) {
                if (car) {
                    deque.add('1');
                    if ('0' == left) {
                        car = false;
                    }
                } else {
                    deque.add('0');
                    if ('1' == left) {
                        car = true;
                    }
                }
            } else {
                if (car) {
                    deque.add('0');
                } else {
                    deque.add('1');
                }
            }
        }

        if (car) {
            deque.add('1');
        }

        StringBuilder sb = new StringBuilder();
        Character character = deque.pollLast();
        while (Objects.nonNull(character)) {
            sb.append(character);
            character = deque.pollLast();
        }

        return sb.toString();
    }
}
