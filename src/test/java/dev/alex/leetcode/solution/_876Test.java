package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _876Test {
    private _876 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _876();
    }

    @Test
    public void middleNode() {
        System.out.println("case 1:");
        Assert.assertEquals(3, instance.middleNode(new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))))).val);

        System.out.println("case 2:");
        Assert.assertEquals(3, instance.middleNode(new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4))))).val);

        System.out.println("case 3:");
        Assert.assertEquals(1, instance.middleNode(new ListNode(1)).val);
    }
}