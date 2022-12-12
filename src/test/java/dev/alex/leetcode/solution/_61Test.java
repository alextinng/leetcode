package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;
import org.junit.Before;
import org.junit.Test;

public class _61Test {
    private _61 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _61();
    }

    @Test
    public void rotateRight() {
//        ListNode head = instance.rotateRight(new ListNode(1,
//                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
//        System.out.println(head);

        ListNode head = instance.rotateRight(new ListNode(1), 1);
        System.out.println(head);
    }
}