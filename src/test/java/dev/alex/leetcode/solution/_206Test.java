package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _206Test {
    private _206 instance;

    @Before
    public void setup() {
        instance = new _206();
    }

    @Test
    public void reverseList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode = instance.reverseList(head);
        System.out.println(listNode);

        head = new ListNode(1 );
        listNode = instance.reverseList(head);
        System.out.println(listNode);
    }
}