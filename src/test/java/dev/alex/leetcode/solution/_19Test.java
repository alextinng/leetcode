package dev.alex.leetcode.solution;

import com.google.gson.Gson;
import dev.alex.leetcode.solution._19;
import dev.alex.leetcode.entity.ListNode;
import org.junit.Before;
import org.junit.Test;

public class _19Test {
    private _19 instance;

    @Before
    public void setup() {
        instance = new _19();
    }

    @Test
    public void removeNthFromEnd() {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < 3; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(new Gson().toJson(head));
        ListNode listNode = instance.removeNthFromEnd(head, 3);
        System.out.println(new Gson().toJson(listNode));
    }
}