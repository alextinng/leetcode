package dev.alex.leetcode.solution;


import dev.alex.leetcode.solution._94;
import dev.alex.leetcode.entity.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class _94Test {
    private _94 instance;

    @Before
    public void setup () {
        instance = new _94();
    }

    @Test
    public void inorderTraversal() {
        TreeNode root = new TreeNode(1);
//        TreeNode leftChild = new TreeNode(3);
//        leftChild.right = new TreeNode(5);
//        root.left = leftChild;

        root.right = new TreeNode(2);
        List<Integer> list = instance.inorderTraversal(root);
        System.out.println(list);
    }
}