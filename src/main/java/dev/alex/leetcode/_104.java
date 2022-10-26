package dev.alex.leetcode;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _104 {
    public int maxDepth(TreeNode root) {
        if (Objects.isNull(root)) return 0;
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
