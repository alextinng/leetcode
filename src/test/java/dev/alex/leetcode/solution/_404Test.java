package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _404Test {
    private _404 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _404();
    }

    @Test
    public void sumOfLeftLeaves() {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Assert.assertEquals(24, instance.sumOfLeftLeaves(root));
    }
}