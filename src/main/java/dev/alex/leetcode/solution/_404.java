package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

import java.util.Objects;

public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int cnt = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (Objects.isNull(left) && Objects.isNull(right)) return 0;

        if (Objects.nonNull(left)) {
            System.out.println("root.left => " + left.val);
            if (Objects.isNull(left.left) && Objects.isNull(left.right)) cnt += left.val;
            else cnt += sumOfLeftLeaves(left);
        }

        System.out.println("root => " + root.val);

        if (Objects.nonNull(right)) {
            System.out.println("root.right => " + right.val);
            if (Objects.nonNull(right.left) || Objects.nonNull(right.right)) {
                cnt += sumOfLeftLeaves(right);
            }
        }

        return cnt;
    }
}
