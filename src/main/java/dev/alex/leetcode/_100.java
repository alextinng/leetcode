package dev.alex.leetcode;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (Objects.isNull(p) && Objects.isNull(q)) return true;
        if (Objects.isNull(p) || Objects.isNull(q)) return false;
        if (p.val != q.val) return false;
        if (!isSameTree(p.left, q.left)) return false;
        if (!isSameTree(p.right, q.right)) return false;

        return true;
    }
}
