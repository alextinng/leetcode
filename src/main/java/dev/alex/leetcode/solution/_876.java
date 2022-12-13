package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;

import java.util.Objects;

public class _876 {
    public ListNode middleNode(ListNode head) {
        /*
            case 1:
                1 -> 2 -> 3 -> 4 -> 5

                slow: 1 -> 2 -> 3 -> 4 -> 5
                fast: 1 -> 3 -> 5

            case 2:
                1 -> 2 -> 3 -> 4

                slow: 1 -> 2 -> 3 -> 4
                fast: 1 -> 3 -> null
         */
        if (Objects.isNull(head)) return null;

        ListNode slow = head, fast = head;

        while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
            for (int i = 0; i < 2; i++) {
                fast = fast.next;
            }
            slow = slow.next;

            System.out.printf("slow: %s, fast: %s%n", slow, fast);
        }

        return slow;
    }
}
