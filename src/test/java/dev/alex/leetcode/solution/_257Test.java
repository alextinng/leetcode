package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _257Test {
    private _257 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _257();
    }

    @Test
    public void binaryTreePaths() {
        List<String> strings = instance.binaryTreePaths(new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)), new TreeNode(3)));
        System.out.println(strings);
    }
}