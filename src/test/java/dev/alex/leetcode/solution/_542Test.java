package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

public class _542Test {
    private _542 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _542();
    }

    @Test
    public void updateMatrix() {
        instance.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}});
    }
}