package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

public class _226 {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) return null;

        TreeNode left = root.left;
        TreeNode right = root.right;
        if (null == left && null == right) return root;

        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }
}
