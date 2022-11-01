package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _110 {
    public boolean isBalanced(TreeNode root) {
        if (Objects.isNull(root)) return true;
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) return true;

        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        if (Objects.isNull(root)) return 0;
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
