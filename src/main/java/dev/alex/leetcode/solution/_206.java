package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;

import java.util.Objects;

public class _206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            if (Objects.isNull(newHead)) {
                newHead = new ListNode(cur.val);
                cur = cur.next;
            } else {
                // keep next node
                ListNode next = cur.next;
                System.out.println("current => " + cur + ", next => " + next);
                // current node point to newHead
                cur.next = newHead;
                // newHead point to current node
                newHead = cur;
                System.out.println("new head => " + newHead);

                cur = next;
            }
        }

        return newHead;
    }
}
