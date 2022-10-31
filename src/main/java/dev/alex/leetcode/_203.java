package dev.alex.leetcode;

import dev.alex.leetcode.entity.ListNode;

import java.util.Objects;

public class _203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = null;
        ListNode cur = null;

        while (Objects.nonNull(head)) {
            if (head.val != val) {
                if (Objects.isNull(cur)) {
                    cur = new ListNode(head.val);
                    h = cur;
                } else {
                    cur.next = new ListNode(head.val);
                    cur = cur.next;
                }
            }

            head = head.next;
        }

        return h;
    }
}
