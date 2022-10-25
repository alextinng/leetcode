package dev.alex.leetcode;

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