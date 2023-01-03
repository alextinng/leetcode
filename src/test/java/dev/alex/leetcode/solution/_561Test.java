package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _561Test {
    private _561 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _561();
    }

    @Test
    public void arrayPairSum() {
        Assert.assertEquals(9, instance.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
        Assert.assertEquals(4, instance.arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}