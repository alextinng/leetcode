package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (Objects.isNull(root)) return false;

        TreeNode left = root.left;
        TreeNode right = root.right;
        if (Objects.isNull(left) && Objects.isNull(right)) return targetSum == root.val;

        if (Objects.isNull(left)) {
            return hasPathSum(right, targetSum - root.val);
        } else
            return hasPathSum(left, targetSum - root.val) || hasPathSum(right, targetSum - root.val);
    }
}
