package dev.alex.leetcode;

import dev.alex.leetcode.entity.ListNode;

import java.util.Objects;

public class _21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (Objects.isNull(list1) && Objects.isNull(list2)) {
            return null;
        }

        if (Objects.isNull(list1)) {
            return list2;
        }

        if (Objects.isNull(list2)) {
            return list1;
        }

        ListNode head1 = list1, head2 = list2;
        ListNode result = null, tail = null;
        while (Objects.nonNull(head1) && Objects.nonNull(head2)) {
            if (head1.val < head2.val) {
                if (Objects.isNull(tail)) {
                    result = new ListNode(head1.val);
                    tail = result;
                } else {
                    tail.next = new ListNode(head1.val);
                    tail = tail.next;
                }

                head1 = head1.next;
            } else {
                if (Objects.isNull(tail)) {
                    result = new ListNode(head2.val);
                    tail = result;
                } else {
                    tail.next = new ListNode(head2.val);
                    tail = tail.next;
                }

                head2 = head2.next;
            }
        }

        if (Objects.isNull(head1)) {
            tail.next = head2;
        } else {
            tail.next = head1;
        }

        return result;
    }
}
