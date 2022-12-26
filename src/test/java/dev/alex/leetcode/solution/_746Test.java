package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _746Test {
    private _746 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _746();
    }

    @Test
    public void minCostClimbingStairs() {
        Assert.assertEquals(6, instance.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}