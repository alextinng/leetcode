package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _268Test {
    private _268 instance;

    @Before
    public void setup() {
        instance = new _268();
    }

    @Test
    public void missingNumber() {
        Assert.assertEquals(2, instance.missingNumber(new int[]{0, 1}));
        Assert.assertEquals(2, instance.missingNumber(new int[]{3, 0, 1}));
        Assert.assertEquals(3, instance.missingNumber(new int[]{2, 0, 1}));
        Assert.assertEquals(3, instance.missingNumber(new int[]{4, 2, 0, 1}));
        Assert.assertEquals(4, instance.missingNumber(new int[]{3, 2, 0, 1}));
    }
}