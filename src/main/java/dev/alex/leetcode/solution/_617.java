package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        System.out.printf("root1: %s, root2: %s", Objects.isNull(root1) ? "null" : root1.val,
                Objects.isNull(root2) ? "null" : root2.val);
        if (Objects.isNull(root1) && Objects.isNull(root2)) return null;
        if (Objects.isNull(root1)) return root2;
        if (Objects.isNull(root2)) return root1;

        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
