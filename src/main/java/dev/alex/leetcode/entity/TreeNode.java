package dev.alex.leetcode.entity;

public class TreeNode {
    public final int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    @Override
    public int hashCode() {
        return val;
    }
}
