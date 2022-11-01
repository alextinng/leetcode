package dev.alex.leetcode.solution;

import dev.alex.leetcode.solution._104;
import dev.alex.leetcode.entity.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class _104Test {
    private _104 instance;

    @Before
    public void setup() {
        instance = new _104();
    }

    @Test
    public void maxDepth() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        TreeNode rChild = new TreeNode(3);
        rChild.right = new TreeNode(4);

        int maxDepth = instance.maxDepth(root);
        System.out.println(maxDepth);
    }
}