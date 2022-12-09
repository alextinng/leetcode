package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

public class _189Test {
    private _189 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _189();
    }

    @Test
    public void rotate() {
        instance.rotate(new int[]{1}, 1);
        instance.rotate(new int[]{1,2}, 2);
        instance.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}