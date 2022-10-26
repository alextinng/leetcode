package dev.alex.leetcode;

import dev.alex.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class _94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        return solution2(root);
    }

    private List<Integer> solution1(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (Objects.isNull(root)) {
            return Collections.emptyList();
        }

        TreeNode left = root.left;
        if (Objects.nonNull(left)) {
            result.addAll(inorderTraversal(left));
        }

        // current
        result.add(root.val);

        TreeNode right = root.right;
        if (Objects.nonNull(right)) {
            result.addAll(inorderTraversal(right));
        }

        return result;
    }

    private List<Integer> solution2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // todo
        return list;
    }
}
