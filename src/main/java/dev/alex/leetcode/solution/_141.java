package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _141 {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> visitor = new HashMap<>();

        while (Objects.nonNull(head)) {
            if (visitor.containsKey(head)) {
                return true;
            } else {
                visitor.put(head, 1);
            }

            head = head.next;
        }

        return false;
    }
}
