package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _367Test {
    private _367 instance;

    @Before
    public void setup() {
        instance = new _367();
    }

    @Test
    public void isPerfectSquare() {
        Assert.assertTrue(instance.isPerfectSquare(1));
        Assert.assertTrue(instance.isPerfectSquare(16));
//        Assert.assertFalse(instance.isPerfectSquare(Integer.MAX_VALUE));
    }
}