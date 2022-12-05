package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _234Test {
    private _234 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _234();
    }

    @Test
    public void isPalindrome() {
        Assert.assertFalse(instance.isPalindrome(new ListNode(1, new ListNode(2))));
        Assert.assertTrue(instance.isPalindrome(new ListNode(1,
                new ListNode(2, new ListNode(2, new ListNode(1))))));
    }
}