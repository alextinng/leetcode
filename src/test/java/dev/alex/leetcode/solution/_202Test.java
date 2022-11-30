package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _202Test {
    private _202 instance;

    @Before
    public void setup() {
        instance = new _202();
    }

    @Test
    public void isHappy() {
        Assert.assertTrue(instance.isHappy(19));
    }
}