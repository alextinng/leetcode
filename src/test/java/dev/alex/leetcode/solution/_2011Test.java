package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _2011Test {
    private _2011 instance;

    @Before
    public void setup() {
        instance = new _2011();
    }

    @Test
    public void finalValueAfterOperations() {
        Assert.assertEquals(1, instance.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        Assert.assertEquals(3, instance.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
    }
}