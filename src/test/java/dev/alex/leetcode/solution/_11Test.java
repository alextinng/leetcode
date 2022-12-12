package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _11Test {
    private _11 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _11();
    }

    @Test
    public void maxArea() {
        Assert.assertEquals(49, instance.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}