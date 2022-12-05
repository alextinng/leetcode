package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _414Test {
    private _414 instance;

    @Before
    public void setup() {
        instance = new _414();
    }

    @Test
    public void thirdMax() {
        Assert.assertEquals(1, instance.thirdMax(new int[]{3, 2, 1}));
        Assert.assertEquals(2, instance.thirdMax(new int[]{1, 2}));
        Assert.assertEquals(1, instance.thirdMax(new int[]{2, 2, 3, 1}));
    }
}