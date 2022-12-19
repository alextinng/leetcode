package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

public class _116 {
    public Node connect(Node root) {
        if (Objects.isNull(root)) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        List<Node> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            System.out.println("queue: " + queue.stream().map(n -> Integer.toString(n.val))
                    .collect(Collectors.joining(",")));
            Node n = queue.poll();
            while (Objects.nonNull(n)) {
                n.next = queue.peek();

                if (Objects.nonNull(n.left)) {
                    list.add(n.left);
                    list.add(n.right);
                }
                n = queue.poll();
            }
            queue.addAll(list);

            System.out.println("list: " + list.stream().map(x -> Integer.toString(x.val)).collect(Collectors.joining(",")));
            list.clear();
        }

        return root;
    }
}
