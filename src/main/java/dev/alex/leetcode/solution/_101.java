package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _101 {
    public boolean isSymmetric(TreeNode root) {
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) return true;
        if (Objects.isNull(root.left) || Objects.isNull(root.right)) return false;
        if (root.left.val != root.right.val) return false;

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (Objects.isNull(left) && Objects.isNull(right)) return true;
        if (Objects.isNull(left) || Objects.isNull(right)) return false;
        if (left.val != right.val) return false;
        if (!isSymmetric(left.left, right.right)) return false;
        if (!isSymmetric(left.right, right.left)) return false;

        return true;
    }
}
