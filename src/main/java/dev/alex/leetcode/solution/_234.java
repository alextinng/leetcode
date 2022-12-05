package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class _234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (Objects.nonNull(head)) {
            list.add(head.val);
            head = head.next;
        }

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int j = size - 1 - i;
            if (!Objects.equals(list.get(j), list.get(i))) {
                return false;
            }
        }

        return true;
    }
}
