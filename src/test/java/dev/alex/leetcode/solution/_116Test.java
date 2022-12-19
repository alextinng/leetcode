package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.Node;
import org.junit.Before;
import org.junit.Test;

public class _116Test {
    private _116 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _116();
    }

    @Test
    public void connect() {
        Node root = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        Node connect = instance.connect(root);
        System.out.println(connect);
    }
}