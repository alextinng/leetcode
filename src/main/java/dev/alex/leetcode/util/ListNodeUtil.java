package dev.alex.leetcode.util;

import dev.alex.leetcode.entity.ListNode;

public abstract class ListNodeUtil {
    public static ListNode asListNode(int val, int... next) {
        ListNode node = new ListNode(val);
        ListNode cur = node;
        for (int i : next) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        return node;
    }
}
