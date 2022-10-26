package dev.alex.leetcode;

import dev.alex.leetcode.entity.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _101Test {
    private _101 instance;

    @Before
    public void setup() {
        instance = new _101();
    }

    @Test
    public void isSymmetric() {
        TreeNode root = new TreeNode(1);
        TreeNode lChild = new TreeNode(2);
        lChild.left = new TreeNode(3);
        lChild.right = new TreeNode(4);
        TreeNode rChild = new TreeNode(2);
        rChild.left = new TreeNode(4);
        rChild.right = new TreeNode(3);
        root.left = lChild;
        root.right = rChild;

        boolean symmetric = instance.isSymmetric(root);
        System.out.println(symmetric);
    }
}