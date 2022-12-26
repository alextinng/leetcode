package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _55Test {
    private _55 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _55();
    }

    @Test
    public void canJump() {
        Assert.assertTrue(instance.canJump(new int[]{0}));
        Assert.assertTrue(instance.canJump(new int[]{2, 3, 1, 1, 4}));
    }
}