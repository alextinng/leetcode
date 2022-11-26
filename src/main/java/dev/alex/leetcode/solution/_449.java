package dev.alex.leetcode.solution;

import com.google.gson.Gson;
import dev.alex.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

public class _449 {
    private Queue<TreeNode> queue = new LinkedList<>();


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();

        if (Objects.isNull(root)) {
            return "";
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();

            if (Objects.nonNull(head)) {
                list.add(head);

                queue.add(head.left);
                queue.add(head.right);
            } else {
                list.add(new TreeNode(-1));
            }

            System.out.println("queue => " + new Gson().toJson(queue));
        }

        return list.stream().map(e -> String.valueOf(e.val)).collect(Collectors.joining(","));
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> queue = new LinkedList<>();

        if (Objects.nonNull(data) && !"".equals(data)) {
            String[] arr = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
            queue.add(root);

            for (int i = 1; i < arr.length & !queue.isEmpty(); i = i + 2) {
                TreeNode head = queue.poll();
                String str = arr[i];
                if (!"-1".equals(str)) {
                    // 非空节点
                    TreeNode child = new TreeNode(Integer.parseInt(str));
                    queue.add(child);
                    head.left = child;
                }

                str = arr[i + 1];
                if (!"-1".equals(str)) {
                    TreeNode child = new TreeNode(Integer.parseInt(str));
                    queue.add(child);
                    head.right = child;
                }
            }

            return root;
        }

        return null;

    }
}

