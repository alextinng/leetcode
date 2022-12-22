package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class _257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        backtracking(result, stack, root);

        return result;
    }

    private void backtracking(List<String> result, Stack<TreeNode> stack, TreeNode root) {
        System.out.printf("current: %d, stack: %s%n", root.val, stack.stream()
                .map(treeNode -> String.valueOf(treeNode.val))
                .collect(Collectors.joining("->")));

        stack.push(root);

        if (root.left == null && root.right == null) {
            result.add(stack.stream()
                    .map(treeNode -> String.valueOf(treeNode.val))
                    .collect(Collectors.joining("->"))
            );
        } else {
            if (root.left != null) {
                backtracking(result, stack, root.left);
                stack.pop();
            }

            if (root.right != null) {
                backtracking(result, stack, root.right);
                stack.pop();
            }
        }
    }
}
