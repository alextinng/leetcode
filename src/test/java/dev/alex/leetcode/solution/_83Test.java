package dev.alex.leetcode.solution;

import dev.alex.leetcode.solution._83;
import dev.alex.leetcode.entity.ListNode;
import org.junit.Before;
import org.junit.Test;

public class _83Test {
    private _83 instance;

    @Before
    public void setup() {
        instance = new _83();
    }

    @Test
    public void testDeleteDuplicates() {
        instance.deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3)))));
    }
}