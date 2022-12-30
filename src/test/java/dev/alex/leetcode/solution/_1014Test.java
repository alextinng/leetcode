package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1014Test {
    private _1014 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _1014();
    }

    @Test
    public void maxScoreSightseeingPair() {
        Assert.assertEquals(11, instance.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
    }
}