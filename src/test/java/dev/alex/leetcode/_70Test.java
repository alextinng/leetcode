package dev.alex.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _70Test {
    private _70 instance;

    @Before
    public void setup() {
        instance = new _70();
    }

    @Test
    public void climbStairs() {
        Assert.assertEquals(2, instance.climbStairs(2));
        Assert.assertEquals(3, instance.climbStairs(3));
    }
}