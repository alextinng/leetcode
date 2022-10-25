package dev.alex.leetcode;


import com.google.gson.Gson;

import java.util.Objects;

public class _83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (Objects.nonNull(current)) {
            // find next node
            ListNode cur = current;
            while (Objects.nonNull(cur.next) && cur.val == cur.next.val) {
                cur = cur.next;
            }

            current.next = cur.next;
            current = current.next;
        }

        return head;
    }
}
