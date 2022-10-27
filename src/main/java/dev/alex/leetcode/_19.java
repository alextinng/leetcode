package dev.alex.leetcode;

import dev.alex.leetcode.entity.ListNode;

import java.util.Objects;

public class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode windowStart, windowEnd;
        windowStart = head;
        windowEnd = head;

        for (int i = 0; i < n; i++) {
            windowEnd = windowEnd.next;
            if (Objects.isNull(windowEnd)) {
                if (i == n - 1) {
                    head = head.next;
                    return head;
                } else {
                    return null;
                }
            }
        }

        while (Objects.nonNull(windowEnd.next)) {
            windowEnd = windowEnd.next;
            windowStart = windowStart.next;
        }

        windowStart.next = windowStart.next.next;

        return head;
    }
}
