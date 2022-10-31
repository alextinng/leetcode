package dev.alex.leetcode;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _111 {
    public int minDepth(TreeNode root) {
        if (Objects.isNull(root)) return 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (Objects.isNull(left) && Objects.isNull(right)) return 1;

        return 1 + Math.min(Objects.isNull(left) ? Integer.MAX_VALUE : minDepth(left),
                Objects.isNull(right) ? Integer.MAX_VALUE : minDepth(right));
    }
}
