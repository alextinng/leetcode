package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _231Test {
    private _231 instance;

    @Before
    public void setup() {
        instance = new _231();
    }

    @Test
    public void isPowerOfTwo() {
        Assert.assertTrue(instance.isPowerOfTwo(8));
        Assert.assertFalse(instance.isPowerOfTwo(-16));
    }
}