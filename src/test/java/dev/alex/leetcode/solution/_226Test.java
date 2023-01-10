package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _226Test {
    private _226 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _226();
    }

    @Test
    public void invertTree() {
        instance.invertTree(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))));
    }
}