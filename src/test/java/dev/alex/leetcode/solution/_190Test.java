package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _190Test {
    private _190 instance;

    @Before
    public void setup() {
        instance = new _190();
    }

    @Test
    public void reverseBits() {
        Assert.assertEquals(964176192, instance.reverseBits(43261596));
    }
}