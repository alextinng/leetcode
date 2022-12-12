package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;

import java.util.Objects;

public class _61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || Objects.isNull(head)) return head;
        ListNode left = head, right = head;

        int cnt = 0;
        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            cnt++;
            cur = cur.next;
        }
        k = k % cnt;

        if (k == 0) return head;

        for (int i = 0; i < k; i++) {
            right = right.next;
        }

        if (Objects.isNull(right)) return null;
        while (Objects.nonNull(right.next)) {
            right = right.next;
            left = left.next;
        }

        ListNode t = left.next;
        left.next = null;
        right.next = head;

        return t;
    }
}
