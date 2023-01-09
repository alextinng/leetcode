package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _1863Test {
    private _1863 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _1863();
    }

    @Test
    public void subsetXORSum() {
        Assert.assertEquals(5, instance.subsetXORSum(new int[]{5}));
        Assert.assertEquals(6, instance.subsetXORSum(new int[]{1, 3}));
        Assert.assertEquals(28, instance.subsetXORSum(new int[]{5, 1, 6}));
    }
}