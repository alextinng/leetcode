package dev.alex.leetcode;

import dev.alex.leetcode.entity.ListNode;
import dev.alex.leetcode.util.ListNodeUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _203Test {
    private _203 instance;

    @Before
    public void setup() {
        instance = new _203();
    }

    @Test
    public void removeElements() {
        ListNode node = ListNodeUtil.asListNode(1, 2, 3, 4, 5, 4, 6);
        ListNode listNode = instance.removeElements(node, 4);
        System.out.println(listNode);
    }
}